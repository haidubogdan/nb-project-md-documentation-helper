parser grammar MdAntlrParser;

@header{
  package org.antlr.parser.markdown;
}

options { tokenVocab = MdAntlrLexer; }

file: element+ EOF ;
element: header
| breakLine
| textEffect
| list
| html
| rawText
| NL
;

list: listItem+;

header: HEADER;
breakLine : BREAK_LINE NL;
textEffect : BOLD
    | ITALIC;

html: HTML;
rawText : RAW_TEXT;
listItem : LI_PRE_WS;
code : CODE;
blockCode : BLOCK_CODE;