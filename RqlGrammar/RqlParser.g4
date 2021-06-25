parser grammar RqlParser;
options { tokenVocab = RqlLexer; }

prog
    : fromStatement GROUP_BY? selectStatement 
    
    ;


// FROM PART
fromStatement
    : FROM (ALL_DOCS | (( INDEX indexName | WORD) (AS WORD)?))
    ;


//I assume custom index is build using next pattern: 'word/wordx/.../...'
indexName
    : QUOTE WORD (FORWARD_SLASH WORD)+ QUOTE  
    ;

whereStatement
    :
    ;

//for now: without JS functions
selectStatement
    : SELECT (WORD DOT)? WORD (COMMA (WORD DOT)* WORD)*
    ;