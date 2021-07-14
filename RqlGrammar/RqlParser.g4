parser grammar RqlParser;
options { tokenVocab = RqlLexer; }

prog:
    (jsFunction)* 
    fromStatement 
    loadStatement? 
    whereStatement? 
    groupByStatement? 
    orderByStatement? 
    selectStatement? 
    EOF
    ;

fromStatement:
     FROM WORD alias? #CollectionByName 
    |FROM INDEX indexName alias? #CollectionByIndex
    |FROM ALL_DOCS #AllCollections 
    ;

indexName:
    STRING+;

loadStatement:
    LOAD 
    variable 
    alias
    ;

selectStatement:
    //  Select only individual fields e.g. "select Column1, Column2"
     SELECT 
        (
             function
             |variable
        ) 
    alias? 
    (
        COMMA 
        (
            (
                function
                |variable
            )
             alias?
        )
    )* #ProjectIndividualFields
    |SELECT jsCode #javascriptCode
    ;

jsFunction: 
    (JS_FUNCTION_DECLARATION WORD OP_PAR WORD (COMMA WORD)* CL_PAR) //definition declare func(X,...y)
    JS_BODY
    ;

jsCode:
    JS_BODY
;

//tree with alias name in second node
alias:
    AS WORD
    ;

//Capture variable name (also accept aliased names).
variable:
    (
        WORD 
        (OP_Q CL_Q)? 
        DOT 
    )? 
    WORD
        ;

//Function definition. It accept function with aliases, params or param-free.
function:
    (
        variable 
        OP_PAR 
        (
            (
                function
                |variable
                |STRING+
                |NUM
            ) //Parser would throw when comma occures at first place in parenthesis
            (
                COMMA 
                (
                    function
                    |variable
                    |STRING+
                    |NUM
                )
            )*
        )? 
        CL_PAR
    )
        ;

whereStatement:
    WHERE expr
    ; 

groupByStatement:
    GROUP_BY 
    (
        function
        |variable
    )
    (
        COMMA 
        (
            function
            |variable
        )
    )*
    ;

orderByStatement:
    ORDER_BY 
        (
            variable 
            |function
        )
        (
            COMMA 
            (
                variable 
                |function
            )
        )* 
        orderBySorting?
        SORTING?
    ;

//Order sorting option keyword.
orderBySorting:
    AS 
    (
        STRING_W 
        |ALPHANUMERIC
        |LONG 
        |DOUBLE
    );

expr:
    specialFunctions #SpecialFunctionExpr
    | OP_PAR expr CL_PAR #ParentissExpr
    | expr EQUAL expr #EqualExpr
    | expr MATH expr #MathOperatorExpr
    | expr BETWEEN expr AND expr #BetweenExpr
    | expr AND NOT? expr #AndExpr
    | expr OR NOT? expr #OrExpr
    | expr  ALL? IN expr #ListExpr
    | COMMA? STRING+ expr? #WordValueExpr
    | NUM #NumExpr
    | (FALSE | TRUE) #BooleanExpr
    | function #FunctionExpr
    | variable #VariableExpr
    ;

//Functions like morelikethis() or intersect()
specialFunctions:
    (
        MORELIKETHIS
        |INTERSECT
    ) 
    OP_PAR 
        specialParam 
        (
            COMMA specialParam
        )* 
    CL_PAR
;

specialParam:
    specialParam EQUAL specialParam
    | specialParam AND specialParam
    | specialParam OR specialParam
    | function
    | variable
    | STRING+
    | NUM;
