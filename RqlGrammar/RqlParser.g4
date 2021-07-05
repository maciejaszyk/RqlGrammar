parser grammar RqlParser;
options { tokenVocab = RqlLexer; }


prog:
    jsCode? fromStatement loadStatment? whereStatement? groupByStatement? orderByStatement? selectStatement? EOF
    ;

fromStatement:
     FROM WORD alias? #CollectionByName 
    |FROM INDEX STRING+ alias? #CollectionByIndex
    |FROM ALL_DOCS #AllCollections 
    ;

loadStatment:
    LOAD itemName AS WORD #LoadAdditionalCollection
    ;

selectStatement:
    //  Select only individual fields e.g. "select Column1, Column2"
     SELECT itemName (COMMA itemName)* #ProjectIndividualFields
    |SELECT selectItem (COMMA selectItem)* #ProjectWithGroupBy
    |SELECT jsCode #javascriptCode
    ;


jsCode: (JS_FUNCTION_DECLARATION WORD OP_PAR WORD (COMMA WORD)* CL_PAR)? OP_CUR .*? CL_CUR

;

//tree with alias name in second node
alias:
    AS WORD #AliasExpr
    ;

//Accept item or list
itemName:
    (WORD (OP_Q CL_Q)? DOT )? WORD
        ;
selectItem:
((functionName | itemName)) alias?;
//Function with optional param
functionName:
    (WORD (DOT WORD)* OP_PAR ((itemName|STRING+|NUM|functionName) (COMMA (itemName|STRING+|NUM|functionName))*)? CL_PAR)
        ;

whereStatement:
    WHERE expr #WherePart
    ; 

groupByStatement:
    GROUP_BY ((functionName | itemName)) (COMMA (functionName | itemName))*
    ;

orderByStatement:
    ORDER_BY (functionName | itemName) (COMMA (functionName | itemName))* alias? SORTING?
    ;

   


expr:
     OP_PAR expr CL_PAR #ParentissExpr
    | expr EQUAL expr #EqualExpr
    | expr MATH expr #MathOperatorExpr
    | expr BETWEEN expr AND expr #BetweenExpr
    | expr AND NOT? expr #AndExpr
    | expr OR NOT? expr #OrExpr
    | expr  ALL? IN expr #ListExpr
    | COMMA? STRING+ expr? #WordValueExpr
    | NUM #NumExpr
    | functionName #FunctionExpr
    | itemName #WordExpr
    ;



