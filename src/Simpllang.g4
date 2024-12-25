grammar Simpllang;
// Главная точка входа
program: stmt* EOF;
// Утверждения
stmt: varDecl
    | assignment
    | print
    | ifstmt
    | whilestmt
    | forstmt
    | blockstmt;
// Выражения
expr: '(' expr ')'                                  #parenthesisExpr
    | left=expr op=(ASTERISK | SLASH) right=expr    #mulDivExpr
    | left=expr op=(PLUS | MINUS) right=expr        #plusMinusExpr
    | left=expr op=(AND | OR) right=expr            #logicalExpr
    | left=expr compOperator right=expr             #compExpr
    | ID                                            #idExpr
    | NUM                                           #numExpr
    | BOOL                                          #boolExpr
    | STRING                                        #stringExpr;
// Операторы сравнения
compOperator: op=(LESS | LESS_OR_EQUAL | EQUAL | NOT_EQUAL | GREATER | GREATER_OR_EQUAL);
// Объявление переменной
varDecl: 'var' ID ('=' expr)? ';' ;
// Присваивание
assignment: ID '=' expr ';' ;
// Печать
print: 'print' '(' expr ')' ';' ;
// Условные операторы
ifstmt: 'if' '(' expr ')' stmt (elifstmt)* (elsestmt)? ;
elifstmt: 'elif' '(' expr ')' stmt ;
elsestmt: 'else' stmt ;
// Циклы
whilestmt: 'while' '(' expr ')' stmt ;
forstmt: 'for' '(' (varDeclFor | assignmentFor)? ';' expr? ';' assignmentFor? ')' stmt ;
// Определение и присваивание
varDeclFor: 'var' ID ('=' expr)?;
assignmentFor: ID '=' expr;
// Блоки
blockstmt: '{' stmt* '}' ;
// Токены
ID       : [a-zA-Z_][a-zA-Z_0-9]* ;       // Идентификаторы
NUM      : [0-9]+ ;                       // Целые числа
BOOL     : 'true' | 'false';              // Булевы значения
STRING   : '"' (~["\r\n])* '"' ;          // Строки
ASTERISK : '*' ;
SLASH    : '/' ;
PLUS     : '+' ;
MINUS    : '-' ;
AND      : '&&' ;
OR       : '||' ;
EQUAL    : '==' ;
NOT_EQUAL: '!=' ;
LESS     : '<' ;
LESS_OR_EQUAL : '<=' ;
GREATER  : '>' ;
GREATER_OR_EQUAL : '>=' ;

// Пропуск пробелов и комментариев
SPACE    : [ \t\r\n]+ -> skip ;
COMMENT  : '/*' .*? '*/' -> skip ;
LINE_COMMENT : '//' ~[\r\n]* -> skip ;
