/*
Licensed to the Apache Software Foundation (ASF)
 */
package org.antlr.parser.markdown;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.misc.Interval;

/**
 *
 * @author bogdan
 */
public abstract class LexerAdaptor extends Lexer {

    private int _currentRuleType = Token.INVALID_TYPE;

    public LexerAdaptor(CharStream input) {
        super(input);
    }

    public int getCurrentRuleType() {
        return _currentRuleType;
    }

    public void setCurrentRuleType(int ruleType) {
        this._currentRuleType = ruleType;
    }
    
    @Override
    public Token emit() {
        return super.emit();
    }
    
    @Override
    public void reset() {
        setCurrentRuleType(Token.INVALID_TYPE);
        super.reset();
    }
    
    public boolean IsNewLineOrStart(){
        if (this._tokenStartCharPositionInLine <= 2){
            return true;
        } 
        return false;
    }
}
