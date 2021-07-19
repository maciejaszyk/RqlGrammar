lexer grammar RqlLexer;

//SPECIAL CHARACTERS:
CL_CUR:     '}';
CL_PAR:     ')';   
CL_Q:       ']';
COMMA:      ',';
DOT:        '.';
D_QUOTE:    '"';
EQUAL:      '=' | '==' | '<>' | '!=';
MATH:       '<' | '>'  | '<=' | '>=';
OP_CUR:     '{';
OP_PAR:     '(';
OP_Q:       '[';
SLASH:      '/';


//RQL keywords
ALL:            A L L;
ALL_DOCS:       '@all_docs';
ALPHANUMERIC:   A L P H A N U M E R I C;
AND:            A N D;
AS:             A S;
BETWEEN:        B E T W E E N;
DECLARE:        D E C L A R E;
DISTINCT:       D I S T I N C T;
DOUBLE:         D O U B L E;
ENDS_WITH:      E N D S W I T H;
FALSE:          F A L S E;
FROM:           F R O M;
GROUP_BY:       G R O U P ' ' B Y;
IN:             I N;
INCLUDE:        I N C L U D E;
INDEX:          I N D E X;
INTERSECT:      I N T E R S E C T;
LOAD:           L O A D;
LONG:           L O N G;
MATCH:          M A T C H;
MORELIKETHIS:   M O R E L I K E T H I S;
NOT:            N O T;
NULL:           N U L L;
OR:             O R;
ORDER_BY:       O R D E R ' ' B Y;
SELECT:         S E L E C T;
SORTING:        A S C | A S C E N D I N G | D E S C | D E S C E N D I N G;
STARTS_WITH:    S T A R T S W I T H;
STRING_W:       S T R I N G;
TRUE:           T R U E;
WHERE:          W H E R E;
WITH:           W I T H;

//Literals
JS_BODY: '{' .*? '}';
JS_FUNCTION_DECLARATION: 'declare function';
NUM: DIGIT+ (DOT DIGIT+)?;
STRING : ('"' ( '\\"' | . )*? '"' ) | ('\'' ( '\\"' | . )*? '\'' ) ;
WORD: [a-zA-Z]+;


// fragments
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
