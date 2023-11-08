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

BOLD_START: DoubleAsterix -> pushMode(INSIDE_BOLD);

fragment DoubleAsterix : '**' ;

ITALIC: SgAsterix .*? (SgAsterix | EOF);

fragment SgAsterix : '*' ;

ITALIC_2: '_' .*? ('_' | EOF) ->type(ITALIC);

STRIKETHROUGH: '~~' .*? ('~~' | EOF);

CODE : Backtick {this._input.LA(2)!='`' && this._input.LA(3)!='`'}? (Backtick | ~[\r\n])* Backtick;

fragment Backtick : '`' ;

BLOCK_CODE_START : TriBacktick->pushMode(INSIDE_BLOCK_CODE);

fragment TriBacktick : '```';

//images will be included in this token
HYPER_LINK_LABEL : '!'? '[' ~('\r' | '\n' | '[' | '(' | ')')* (']' | EOF)
    ;
HYPER_LINK  : '(' ~('\r' | '\n' | '(' | '[' | ']')* (')' | EOF)
    ;

RAW_TEXT : RawText ;

fragment RawText :
    ('a'..'z'|'A'..'Z')+
    | . ;

mode INSIDE_BOLD;

BOLD_HYPER_LINK_LABEL : '!'? '[' ~('\r' | '\n' | '[' | '(' | ')')* (']' | EOF) -> type(HYPER_LINK_LABEL)
    ;
BOLD_HYPER_LINK  : '(' ~('\r' | '\n' | '(' | '[' | ']')* (')' | EOF) -> type(HYPER_LINK)
    ;
BOLD_END : DoubleAsterix->popMode;

BOLD_NL : NL ->type(NL), popMode;
BOLD : ~[\r\n*[(]+;

SINGLE_PAR : ('(' | '[') ->type(BOLD);

mode INSIDE_BLOCK_CODE;

LANG_TYPE : {this.isFirstCodeBlockElement()}? ~[\r\n]+;
BLOCK_CODE : ~('`' | '\r' | '\n')+;
BLOCK_CODE_END : TriBacktick->popMode;
BLOCK_CODE_ESCAPE : [\r\n`] ->type(BLOCK_CODE);