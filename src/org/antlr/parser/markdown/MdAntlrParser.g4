parser grammar MdAntlrParser;

@header{
  package org.antlr.parser.markdown;
}

options { tokenVocab = MdAntlrLexer; }

file: main_element+ EOF ;
main_element: header | element;
element: breakLine
| textEffect
| link
| code    
| list
| html
| rawText
| NL
;

list: listItem+;

listItem : LI_PRE_WS element NL;
header: HEADER;
breakLine : BREAK_LINE NL;
textEffect : BOLD
    | ITALIC;

html: HTML;
rawText : RAW_TEXT;
code : CODE;
blockCode : BLOCK_CODE;
link: HYPER_LINK_LABEL HYPER_LINK;