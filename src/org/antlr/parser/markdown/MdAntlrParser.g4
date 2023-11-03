parser grammar MdAntlrParser;

@header{
  package org.antlr.parser.markdown;
}

options { tokenVocab = MdAntlrLexer; }

file: main_element+ EOF ;
main_element: header | line | NL;

line: element+ (NL | EOF);

element: breakLine
| textEffect
| link
| code    
| list
| html
| rawText
;

list: listItem+;

listItem : LI_PRE_WS element+ NL;
header: HEADER;
breakLine : BREAK_LINE;
textEffect : BOLD
    | ITALIC;

html: HTML;
rawText : RAW_TEXT;
code : CODE;
blockCode : BLOCK_CODE;
link: HYPER_LINK_LABEL HYPER_LINK;