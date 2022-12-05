grammar FoolParser;

@lexer::members { 
    int nesting = 0;
}

program : NEWLINE* importDec* classDec* EOF
        ;

importDec :  IMPORT STRING NEWLINE+ ;
classDec :   CLASS TYPE (':' TYPE)? '{' NEWLINE* declaration* '}' NEWLINE+ ;

declaration
            :   DEF ID '(' parameterlist? ')' (':' type)? exprblock NEWLINE+
            |	NEW '(' parameterlist? ')' exprblock NEWLINE+
            |	(VAR | VAL) ID (':' type)? ('=' expr)? NEWLINE+
            ;
type:	(TYPE | functype);
typelist: type (',' type)*;
functype:   '(' typelist ')' '->' type;
parameter:  ID ':' type;
parameterlist:  parameter (',' parameter)*;
exprlist:   expr (',' expr)*;
exprblock:  NEWLINE* '{' NEWLINE* (expr NEWLINE+)* '}' ;
expr
    :		BOOL
    |       INT
    |       NUMBER
    |       STRING
    |		NIL
    |       THIS
    |       SUPER
    |       WRITE
    |       READ
    |       VAR ID ':' type
    |		(VAR | VAL) ID (':' type)? '=' expr
    |		expr '.' ID
    |		NOT expr
    |		expr '[' expr ']'
    |		TYPE('(' exprlist? ')')
    |		expr('(' exprlist? ')')
    | 	    expr ('*' | '\\') expr
    |		expr ('+' | '-') expr
    |		expr ('<' | '>' | '<=' | '>=') expr
    |		expr '==' expr
    |		expr '&&' expr
    |		expr '||' expr
    |		expr '=' expr
    |		WHILE '(' expr ')' exprblock
    |		WHEN '(' expr ')' '{' NEWLINE* ((expr | (IS TYPE)) '->' expr NEWLINE+)+ 
                                    (ELSE '->' expr NEWLINE+)'}'
    |		IF '(' expr ')' exprblock NEWLINE? (ELSE exprblock)
    |		'{' NEWLINE* '(' parameterlist? ')' '->' NEWLINE* (exprblock | expr) NEWLINE* '}'
    |       RETURN expr
    |       ID
    |		'(' expr ')'
    |		'[' exprlist ']'
    |		NEWLINE
    ;


LPAREN: '(' {nesting++;};
RPAREN: ')' {nesting--;};
LBRACE: '{' {nesting -= 10000;};
RBRACE: '}' {nesting += 10000;};
LBRACK: '[' {nesting++;};
RBRACK: ']' {nesting--;};

COMMENT1 :  '#' ~[\r\n]* -> skip;
COMMENT2 :  '//' ~[\r\n]* -> skip;
COMMENT3 :  '/*' .*? '*/' -> skip;
COMMENT4 :  '\'\'\'' .*? '\'\'\'' -> skip;

IGNORE_NEWLINE
        :   '\r'? '\n' {nesting>0}? -> skip
        ;
NEWLINE:    '\r'? '\n';

WS  :   [ \t]+ -> skip
    ;

LINE_ESCAPE
    :   '\\' '\r'? '\n' -> skip
    ;

CLASS:  'class';
IF: 'if';
ELSE:   'else';
WHEN:   'when';
WHILE:  'while';
VAR:    'var';
VAL:    'val';
DEF:    'def';
NOT	:   'not';
NIL:    'NIL';
IS: 'is';
NEW:    'new';
BREAK:  'break';
CONTINUE:   'continue';
THIS:   'this';
RETURN: 'return';
READ:   'read';
WRITE:  'write';
OPENFILE:   'open';
IMPORT: 'import' ;
ASSERT: 'assert' ;
SUPER:  'super' ;

BOOL:	'true' | 'false';
INT:   '0' | [1-9] [0-9]*;
EXP:    [Ee] [+-]? INT;
NUMBER
    :   '-'? INT '.' [0-9]+ EXP? // 1.35, 1.35E-9, 0.3, -4.5
    |   '-'? INT EXP             // 1e10 -3e4
    |   '-'? INT                 // -3, 45
    ;               
ID: [_a-z][_a-zA-Z0-9]*;
TYPE:   [A-Z][_a-zA-Z0-9]*;
STRING
        : '"' (~'"')* '"'
        |   '\'' (~'\'')* '\''
        ;
