lexer grammar RqlLexer;

//SPECIAL CHARACTERS:
OP_CUR:     '{';
CL_CUR:     '}';
OP_PAR:     '(';
OP_Q:       '[';
CL_Q:       ']';
CL_PAR:     ')';   
D_QUOTE:    '"';
DOT:        '.';
COMMA:      ',';
EQUAL:      '=' | '==' | '<>' | '!=';
MATH:       '<' | '>'  | '<=' | '>=';
SLASH:      '/';
//RQL keywords
ALL_DOCS:       '@all_docs';
ALL:            A L L;
AND:            A N D;
AS:             A S;
SORTING:        A S C | A S C E N D I N G | D E S C | D E S C E N D I N G;
BETWEEN:        B E T W E E N;
DECLARE:        D E C L A R E;
ENDS_WITH:      E N D S W I T H;
FALSE:          F A L S E;
FROM:           F R O M;
GROUP_BY:       G R O U P ' ' B Y;
IN:             I N;
INCLUDE:        I N C L U D E;
INDEX:          I N D E X;
LOAD:           L O A D;
MATCH:          M A T C H;
NOT:            N O T;
NULL:           N U L L;
ORDER_BY:       O R D E R ' ' B Y;
SELECT:         S E L E C T;
STARTS_WITH:    S T A R T S W I T H;
TRUE:           T R U E;
WHERE:          W H E R E;
WITH:           W I T H;
OR:             O R;
WORD: [a-zA-Z]+;
NUM: DIGIT+ (DOT DIGIT+)?;
STRING : ('"' ( '\\"' | . )*? '"' ) | ('\'' ( '\\"' | . )*? '\'' );
JS_FUNCTION_DECLARATION: 'declare function';

fragment DIGIT:     [0-9];


fragment A :    [aA];
fragment B :    [bB];
fragment C :    [cC];
fragment D :    [dD];
fragment E :    [eE];
fragment F :    [fF];
fragment G :    [gG];
fragment H :    [hH];
fragment I :    [iI]; 
fragment J :    [jJ];
fragment K :    [kK];
fragment L :    [lL];
fragment M :    [mM];
fragment N :    [nN];
fragment O :    [oO];
fragment P :    [pP];
fragment Q :    [qQ];
fragment R :    [rR];
fragment S :    [sS];
fragment T :    [tT];
fragment U :    [uU];
fragment V :    [vV];
fragment W :    [wW];
fragment X :    [xX];
fragment Y :    [yY];
fragment Z :    [zZ];

WS: [ \n\t\r]+ -> channel(HIDDEN);
