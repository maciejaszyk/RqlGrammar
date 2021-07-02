lexer grammar RqlLexer;
//RQL keywords
FROM: F R O M;
AS: A S;
SELECT: S E L E C T;
WHERE: W H E R E;
INDEX: I N D E X;
GROUP_BY: G R O U P ' ' B Y;
DECLARE: D E C L A R E;
ORDER_BY: O R D E R ' ' B Y;
LOAD: L O A D;
INCLUDE: I N C L U D E;
ENDS_WITH: E N D S W I T H;
STARTS_WITH: S T A R T S W I T H;
WITH: W I T H;
MATCH: M A T C H;
ALL_DOCS: '@all_docs';
BETWEEN: B E T W E E N;
IN: I N;
AND: A N D;
NOT: N O T;
//RQL OPERATORS:
MATH_OPERATOR: MORE_OR_EQUAL | MORE_CHAR | LESS_CHAR | LESS_OR_EQUAL | EQUAL | NOT_EQUAL;
MORE_CHAR: '>';
MORE_OR_EQUAL: '>=';
LESS_CHAR: '<';
LESS_OR_EQUAL: '<=';
EQUAL: '='|'==';
NOT_EQUAL: '<>'|'!=';
ALL_IN: A L L ' ' I N;
OR: O R;



WORD: [a-zA-Z]+;
INT: '-'? DIGIT+;
DOUBLE: '-'? DIGIT+ DOT DIGIT+;


//chars
QUOTE : '\'';
BACK_SLASH: '\\';
FORWARD_SLASH: '/';
DIGIT : [0-9];
COMMA: ','; 
DOT: '.';
OPEN_CURLY: '{';
CLOSE_CURLY: '}';
OPEN_PAREN : '(';
CLOSE_PAREN : ')';
OPEN_BRACKET: '[';
CLOSE_BRACKET: ']';
AT: '@';
UNDERSCORE: '_';

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI]; 
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];

WS: [ \n\t\r]+ -> channel(HIDDEN);
