parser grammar RqlParser;
options { tokenVocab = RqlLexer; }

prog
    : fromStatement  whereStatement? selectStatement? 
    
    ;


// FROM PART
fromStatement
    : FROM (ALL_DOCS | (( INDEX indexName | WORD) (AS WORD)?))
    ;


//I assume custom index is build using next pattern: 'word/wordx/.../...'
indexName
    : QUOTE WORD (FORWARD_SLASH WORD)+ QUOTE  
    ;



//for now: without JS functions
selectStatement
    : SELECT (WORD DOT)? WORD (AS WORD)? (COMMA (WORD DOT)? WORD (AS WORD)?)*
    ;

whereStatement
    : WHERE expr
    ;

expr
    : OPEN_PAREN expr CLOSE_PAREN
    | WORD ( OPEN_BRACKET CLOSE_BRACKET DOT)? WORD (IN | ALL_IN) OPEN_PAREN array CLOSE_PAREN
    | WORD BETWEEN (INT|DOUBLE) AND (INT|DOUBLE)
    |  MATH_OPERATOR (INT|DOUBLE|QUOTE WORD QUOTE)
    | expr (AND | OR) NOT?  expr
    ;



/*
whereFunctions
    : ID OPEN_PAREN CLOSE_PAREN 
    | (STARTS_WITH | ENDS_WITH) OPEN_PAREN whereFunctions COMMA whereFunctions CLOSE_PAREN
    ;
*/
    

array
 :  QUOTE WORD QUOTE  (COMMA QUOTE WORD QUOTE)* #wordListExpression
 | (INT|DOUBLE) (COMMA (INT|DOUBLE))* #numberListExpression
 ;


