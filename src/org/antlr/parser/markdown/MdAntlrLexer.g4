lexer grammar MdAntlrLexer;
  
@header{
  package org.antlr.parser.markdown;
}

options { superClass = LexerAdaptor; }
 
tokens { TOKEN_REF , RULE_REF , LEXER_CHAR_SET }
  
LI_PRE_WS : {this.IsNewLineOrStart()}? LiPrefix;  

fragment LiPrefix
    : ([ \t]* '- ')
    | ([ \t]* '* ')
    | ([ \t]* [0-9]+ '. ')
    ;

BLOCK_CODE : TriBacktip .*? (TriBacktip | EOF);

TriBacktip : '```';

HTML
   : HtmlElement
   ;    
    
fragment HtmlElement
    : '<!--' .*? ( '-->' | EOF )
    | '<' .*? ('/>' | '>' | EOF )
    | '</' .*? ('>' | EOF )
    ;

NL :[\n\r];

HEADER : (('#')+[ ]) ~[\n\r]*;

BREAK_LINE : BreakLine;

fragment BreakLine : ('---')+[-]*;

BOLD_START: DbAsterix -> pushMode(INSIDE_BOLD);

fragment DbAsterix : '**' ;

ITALIC: SgAsterix .*? (SgAsterix | EOF);

fragment SgAsterix : '*' ;

CODE : Backtip (Backtip | ~[\r\n])* Backtip;

fragment Backtip : '`' ;

FENCED_CODEBLOCK : Backticks3 (Backticks3 | ~[\r\n])* Backticks3;
    
fragment Backticks3 : '```' ;

HYPER_LINK_LABEL : '[' ~('\r' | '\n' | '[' | '(' | ')')* (']' | EOF)
    ;
HYPER_LINK  : '(' ~('\r' | '\n' | '(' | '[' | ']')* (')' | EOF)
    ;

RAW_TEXT : RawText ;

fragment RawText :
    ('a'..'z'|'A'..'Z' | ' ' | '\t')+
    | . ;

mode INSIDE_BOLD;
  
BOLD_HYPER_LINK_LABEL : '[' ~('\r' | '\n' | '[' | '(' | ')')* (']' | EOF) -> type(HYPER_LINK_LABEL)
    ;
BOLD_HYPER_LINK  : '(' ~('\r' | '\n' | '(' | '[' | ']')* (')' | EOF) -> type(HYPER_LINK)
    ;
BOLD_END : DbAsterix->popMode;

BOLD_NL : NL ->type(NL), popMode;
BOLD : ~[\r\n*[(]+;

SG_PAR : ('(' | '[') ->type(BOLD);