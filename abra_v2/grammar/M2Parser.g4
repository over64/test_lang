parser grammar M2Parser;
options {
    tokenVocab=M2LexerForIDE;
}
sp: (NL | WS | COMMENT)* ;

literal: IntLiteral
       | HexLiteral
       | FloatLiteral
       | BooleanLiteral
       | StringLiteral
       ;

id: VarId | 'self' ;

expression: literal #exprLiteral
          | id #exprId
          | TypeId #exprTypeId
          | '(' sp expression sp ')' #exprParen
          | tuple #exprTuple
          | expression (NL WS?)? DOT op=(VarId  | '*' | '/' | '+' | '-' | '>' | '<' | '<=' | '>=' | '==' | '!=')
              (sp '[' sp typeHint (sp ',' sp typeHint)* ']')? sp tuple #exprSelfCall
          | expression WS* ('[' sp typeHint (sp ',' sp typeHint)* ']')?  WS* tuple #exprCall
          | lambda #exprLambda
          | expression ((NL WS?)? DOT op+=VarId)+ #exprProp
          | op='!' sp expression #exprUnaryCall
          | expression WS* op=('*' | '/') sp expression #exprInfixCall
          | expression WS* op=('+' | '-' | VarId) sp expression #exprInfixCall
          | expression WS* op=('>' | '<' | '<=' | '>=') sp expression #exprInfixCall
          | expression WS* op=('==' | '!=') sp expression #exprInfixCall
          | expression WS* op=('||' | '&&') sp expression #exprInfixCall
          | 'if' sp cond=expression sp ('do' sp doStat+=blockBody*) sp ('else' sp elseStat+=blockBody*)? DOT #exprIfElse
          | 'when' sp expr=expression sp is+ sp ('else' sp elseStat+=blockBody*)? DOT #exprWnen
          ;

tuple : '(' sp (expression sp (',' sp expression)*)? sp ')'
      | 'with' sp (expression sp (',' sp expression)*)? sp DOT;

fieldTh: id sp ':' sp typeHint ;
scalarTh: (id sp DOT sp)? typeName=TypeId ('[' sp typeHint (sp ',' sp typeHint)* ']')?;
fnTh: ('\\' sp args+=typeHint (sp ',' sp args+=typeHint)*)? sp '->' sp rett=typeHint ;
structTh: '(' sp fieldTh (sp ',' sp fieldTh)+ ')' ;
nonUnionTh: scalarTh | fnTh | structTh ;
unionTh: nonUnionTh (sp '|' sp nonUnionTh)+ ;

typeHint: scalarTh
        | structTh
        | fnTh
        | unionTh
        ;

is: 'is' sp VarId sp ':' sp typeHint sp 'do' sp blockBody* ;

store: id ((NL WS?)? DOT VarId)* sp (tuple | ( ':' sp typeHint))? sp '=' sp expression ;
ret: 'return' sp expression?;
while_stat: 'while' sp cond=expression sp 'do' sp blockBody* DOT ;

fnArg: id sp (':' sp typeHint (sp '=' sp expression)?)? ;
lambda: 'lambda' (sp fnArg sp (',' sp fnArg)* sp '->')? sp blockBody* sp DOT?;
blockBody: (store | while_stat | expression | ret) sp ';'? sp ;

scalarType: 'type' sp tname=TypeId (sp '[' params+=TypeId (',' params+=TypeId)* ']')? sp '=' sp REF? sp llvm ;
typeField: 'self'? sp VarId sp ':' sp typeHint (sp '=' sp expression)? ;
structType: 'type' sp name=TypeId (sp '[' params+=TypeId (',' params+=TypeId)* ']')? sp '=' sp  '(' NL* typeField (',' NL* typeField)* NL*')' ;
unionType: 'type' sp name=TypeId sp ('[' params+=TypeId (',' params+=TypeId)* ']')? sp '=' sp scalarTh sp ('|' sp scalarTh)+ ;

type: scalarType
    | structType
    | unionType
    ;

def: 'def' sp name=(VarId | '!' | '*' | '/' | '+' | '-' | '>' | '<' | '<=' | '>=' | '==' | '!=')
    sp ('[' TypeId (',' TypeId)* ']')?
    sp '=' sp
    (fnArg sp (',' sp fnArg)* sp '->')? sp ((blockBody* sp DOT) | llvm) typeHint? ;

import_: 'import' sp VarId ( sp '/' sp VarId)* ;

level1: type | def ;
module: (sp import_)* sp (sp llvm)* sp (level1 sp)* EOF ;

llvmBody: (LLVM_NL | LLVM_WS | IrLine | LL_Dot)* ;
llvm: LlBegin llvmBody LL_End;