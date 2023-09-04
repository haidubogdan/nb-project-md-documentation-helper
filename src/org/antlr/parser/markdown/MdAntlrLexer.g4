lexer grammar MdAntlrLexer;
  
@header{
  package org.antlr.parser.markdown;
}

options { superClass = LexerAdaptor; }
 
tokens { TOKEN_REF , RULE_REF , LEXER_CHAR_SET }
  
LI_PRE_WS : {this.IsNewLineOrStart()}? LiPrefix;  

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

WS
    : [ \t]+
    ;

HEADER
    : Header;

fragment Header
    : (('#')+[ ]) ~[\n\r]*
    ;

BREAK_LINE : ('---')+[-]* ~[\n\r];

fragment LiPrefix
    : ([ \t]* '- ')
    | ([ \t]* '* ')
    | ([ \t]* [0-9]+ '. ')
    ;

//fragment LiItem
//    : (('-')+[ ]) ~ [\n\r]*
//    | (('*')+[ ]) ~ [\n\r]*
//    | ([0-9]+ ('.') [ ]) ~ [\n\r]*
//    ;

//text highlight

BOLD
    : Bold;

fragment Bold
    : DbAsterix .*? (DbAsterix | EOF);

fragment DbAsterix
    : '**' ;

ITALIC
    : Italic;

fragment Italic
    : SgAsterix .*? (SgAsterix | EOF);

fragment SgAsterix
    : '*' ;


fragment Backtip
   : '`'
   ;

fragment BacktickCode
   : Backtip (Backtip | ~[\r\n])* Backtip
   ;

CODE : BacktickCode;

RAW_TEXT : . ->channel(HIDDEN);