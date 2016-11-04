/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sql.parser.pkg2;

/**
 *
 * @author Toshiba PC
 */
public class Substring {
    public enum Lexic { Blank, Variable, Keyword, ConstantNum, ConstantString, Error, BooleanOperator, SetOperator, LogicOperator };
    
    String substring;
    Lexic lexic;
    int state;
    
    public Substring(String substring, Lexic lexic, int state) {
        this.substring = substring;
        this.lexic = lexic;
        this.state = state;
    }

    public String getSubstring() {
        return substring;
    }

    public Lexic getLexic() {
        return lexic;
    }

    public int getstate() {
        return state;
    }
    
}
