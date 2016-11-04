/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql.parser.pkg2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author fadhilurrizki
 */
public class Data {
    ArrayList<String> a = new ArrayList<>();
    ArrayList<String> b = new ArrayList<>();
    public Data(String stringInput) {
        
        // Program Contoh DFA
        ArrayList<Substring> substringList = new ArrayList<>();
        Substring.Lexic lexic = Substring.Lexic.Blank;
        String substring = "";
        int state = 1;
        int tokenLexic = 0;
        for (int i = 0; i < stringInput.length(); i++) {
            switch (state) {
                case 1:
                    tokenLexic = 4;
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == 's' || stringInput.charAt(i) == 'S') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 2;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == 'w' || stringInput.charAt(i) == 'W') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 14;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }

                    } else if (stringInput.charAt(i) == 'N' || stringInput.charAt(i) == 'n') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 39;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }

                    } else if (stringInput.charAt(i) == 'L' || stringInput.charAt(i) == 'l') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 34;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }

                    } else if (stringInput.charAt(i) == 'F' || stringInput.charAt(i) == 'f') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 18;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == '*') {
                        lexic = Substring.Lexic.Keyword;
                        substring += stringInput.charAt(i);
                        tokenLexic = 2;
                        state = 7;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == '"') {
                        lexic = Substring.Lexic.Error;
                        substring += stringInput.charAt(i);
                        state = 11;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == 'A' || stringInput.charAt(i) == 'a') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 21;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == 'I' || stringInput.charAt(i) == 'i') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 40;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == 'O' || stringInput.charAt(i) == 'o') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 23;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == 'J' || stringInput.charAt(i) == 'j') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 24;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == 'U' || stringInput.charAt(i) == 'u') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 27;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (Character.isDigit(stringInput.charAt(i))) {
                        lexic = Substring.Lexic.ConstantNum;
                        tokenLexic = 10;
                        substring += stringInput.charAt(i);
                        state = 32;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == '.') {
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ',') {
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '(') {
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == '<') {
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 2:
                    if (stringInput.charAt(i) == 'e' || stringInput.charAt(i) == 'E') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 3;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }

                    break;
                case 3:
                    if (stringInput.charAt(i) == 'l' || stringInput.charAt(i) == 'L') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 4;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 4:
                    if (stringInput.charAt(i) == 'e' || stringInput.charAt(i) == 'E') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 5;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 5:
                    if (stringInput.charAt(i) == 'c' || stringInput.charAt(i) == 'C') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 6;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 6:
                    if (stringInput.charAt(i) == 't' || stringInput.charAt(i) == 'T') {
                        lexic = Substring.Lexic.Keyword;
                        substring += stringInput.charAt(i);
                        state = 8;
                        tokenLexic = 1;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }

                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }

                    break;
                case 7:
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        tokenLexic = 11;
                        lexic = Substring.Lexic.Error;
                        substring += stringInput.charAt(i);
                        state = 7;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 8:
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        tokenLexic = 4;
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 9:
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        tokenLexic = 2;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        tokenLexic = 10;
                        lexic = Substring.Lexic.Error;
                        substring += stringInput.charAt(i);
                        state = 10;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 10:
                    if (stringInput.charAt(i) == '"') {
                        lexic = Substring.Lexic.ConstantString;
                        substring += stringInput.charAt(i);
                        state = 12;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Error;
                        substring += stringInput.charAt(i);
                        state = 11;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 11:
                    if (stringInput.charAt(i) == '"') {
                        lexic = Substring.Lexic.ConstantString;
                        tokenLexic = 8;
                        substring += stringInput.charAt(i);
                        state = 13;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        tokenLexic = 11;
                        lexic = Substring.Lexic.Error;
                        substring += stringInput.charAt(i);
                        state = 12;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else {
                        tokenLexic = 11;
                        lexic = Substring.Lexic.Error;
                        substring += stringInput.charAt(i);
                        state = 11;
                        if (i == stringInput.length() - 1) {
                            state = 10;
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 12:
                    tokenLexic = 11;
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '"') {
                        lexic = Substring.Lexic.Error;
                        substring += stringInput.charAt(i);
                        state = 12;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else {
                        lexic = Substring.Lexic.Error;
                        substring += stringInput.charAt(i);
                        state = 12;
                        if (i == stringInput.length() - 1) {
                            state = 10;
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 13:
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {

                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else {
                        tokenLexic = 11;
                        lexic = Substring.Lexic.Error;
                        substring += stringInput.charAt(i);
                        state = 12;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 14:
                    if (stringInput.charAt(i) == 'H' || stringInput.charAt(i) == 'h') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 15;
                        if (i == stringInput.length() - 1) {
                            state = 8;
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 15:
                    if (stringInput.charAt(i) == 'E' || stringInput.charAt(i) == 'e') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 16;
                        if (i == stringInput.length() - 1) {
                            state = 8;
                            substringList.add(new Substring(substring, lexic, state));
                        }
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 16:
                    if (stringInput.charAt(i) == 'R' || stringInput.charAt(i) == 'r') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 17;
                        if (i == stringInput.length() - 1) {
                            state = 8;
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 17:
                    if (stringInput.charAt(i) == 'E' || stringInput.charAt(i) == 'e') {
                        tokenLexic = 5;
                        lexic = Substring.Lexic.Keyword;
                        substring += stringInput.charAt(i);
                        state = 8;
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                    }
                    if (i == stringInput.length() - 1) {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                    }
                    break;
                case 18:
                    if (stringInput.charAt(i) == 'R' || stringInput.charAt(i) == 'r') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 19;

                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;

                    }
                    if (i == stringInput.length() - 1) {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                    }
                    break;
                case 19:
                    if (stringInput.charAt(i) == 'O' || stringInput.charAt(i) == 'o') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 20;
                        if (i == stringInput.length() - 1) {
                            state = 8;
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                    }
                    if (i == stringInput.length() - 1) {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                    }
                    break;
                case 20:
                    if (stringInput.charAt(i) == 'M' || stringInput.charAt(i) == 'm') {
                        tokenLexic = 3;
                        lexic = Substring.Lexic.Keyword;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 21:
                    if (stringInput.charAt(i) == 'N' || stringInput.charAt(i) == 'n') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 22;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 22:
                    if (stringInput.charAt(i) == 'D' || stringInput.charAt(i) == 'd') {
                        tokenLexic = 14;
                        lexic = Substring.Lexic.BooleanOperator;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 23:
                    if (stringInput.charAt(i) == 'R' || stringInput.charAt(i) == 'r') {
                        tokenLexic = 15;
                        lexic = Substring.Lexic.BooleanOperator;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 24:
                    if (stringInput.charAt(i) == 'O' || stringInput.charAt(i) == 'o') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 25;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 25:
                    if (stringInput.charAt(i) == 'I' || stringInput.charAt(i) == 'i') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 26;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 26:
                    if (stringInput.charAt(i) == 'N' || stringInput.charAt(i) == 'n') {
                        tokenLexic = 16;
                        lexic = Substring.Lexic.SetOperator;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 27:
                    if (stringInput.charAt(i) == 'N' || stringInput.charAt(i) == 'n') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 28;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 28:
                    if (stringInput.charAt(i) == 'I' || stringInput.charAt(i) == 'i') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 29;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 29:
                    if (stringInput.charAt(i) == 'O' || stringInput.charAt(i) == 'o') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 30;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 30:
                    if (stringInput.charAt(i) == 'N' || stringInput.charAt(i) == 'n') {
                        tokenLexic = 17;
                        lexic = Substring.Lexic.SetOperator;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }

                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }

                    break;
                case 31:
                    if (stringInput.charAt(i) == '=') {
                        if (stringInput.charAt(i - 1) == '>') {
                            tokenLexic = 20;
                        } else if (stringInput.charAt(i - 1) == '<') {
                            tokenLexic = 21;
                        }
                        lexic = Substring.Lexic.Keyword;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Keyword;
                        substring = "";
                    } else if (stringInput.charAt(i) == 's' || stringInput.charAt(i) == 'S') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 2;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == 'w' || stringInput.charAt(i) == 'W') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 14;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == 'F' || stringInput.charAt(i) == 'f') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 18;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == '*') {
                        lexic = Substring.Lexic.Keyword;
                        substring += stringInput.charAt(i);
                        tokenLexic = 2;
                        state = 7;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == '"') {
                        lexic = Substring.Lexic.Error;
                        substring += stringInput.charAt(i);
                        state = 11;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == 'A' || stringInput.charAt(i) == 'a') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 21;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == 'O' || stringInput.charAt(i) == 'o') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 23;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == 'J' || stringInput.charAt(i) == 'j') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 24;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == 'U' || stringInput.charAt(i) == 'u') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 27;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (Character.isDigit(stringInput.charAt(i))) {
                        lexic = Substring.Lexic.ConstantNum;
                        tokenLexic = 10;
                        substring += stringInput.charAt(i);
                        state = 32;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == '.') {
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ',') {
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '(') {
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }

                    break;
                case 32:
                    if (Character.isDigit(stringInput.charAt(i))) {
                        lexic = Substring.Lexic.ConstantNum;
                        substring += stringInput.charAt(i);
                        state = 32;
                        tokenLexic = 10;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }

                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else {
                        lexic = Substring.Lexic.Error;
                        tokenLexic = 11;
                        state = 33;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }

                    break;
                case 33:
                    if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else {
                        lexic = Substring.Lexic.Error;
                        tokenLexic = 11;
                        state = 33;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 34:
                    if (stringInput.charAt(i) == 'I' || stringInput.charAt(i) == 'i') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 35;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 35:
                    if (stringInput.charAt(i) == 'K' || stringInput.charAt(i) == 'k') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 36;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 36:
                    if (stringInput.charAt(i) == 'e' || stringInput.charAt(i) == 'E') {
                        lexic = Substring.Lexic.LogicOperator;
                        tokenLexic = 23;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 37:
                    if (stringInput.charAt(i) == 'O' || stringInput.charAt(i) == 'o') {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 38;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 38:
                    if (stringInput.charAt(i) == 'T' || stringInput.charAt(i) == 't') {
                        tokenLexic = 24;
                        lexic = Substring.Lexic.BooleanOperator;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 39:
                    if (stringInput.charAt(i) == 'N' || stringInput.charAt(i) == 'n') {
                        tokenLexic = 25;
                        lexic = Substring.Lexic.Keyword;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    } else if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        lexic = Substring.Lexic.Blank;
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == ',') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 22;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '.') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 6;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ';') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 9;
                        substring += stringInput.charAt(i);
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        state = 1;
                    } else if (stringInput.charAt(i) == '(') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 12;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == ')') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 13;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '=') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 7;
                        substring += stringInput.charAt(i);
                        state = 1;
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                    } else if (stringInput.charAt(i) == '>') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 18;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else if (stringInput.charAt(i) == '<') {
                        substringList.add(new Substring(substring, lexic, tokenLexic));
                        substring = "";
                        lexic = Substring.Lexic.Keyword;
                        tokenLexic = 19;
                        substring += stringInput.charAt(i);
                        state = 31;
                    } else {
                        lexic = Substring.Lexic.Variable;
                        substring += stringInput.charAt(i);
                        state = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new Substring(substring, lexic, tokenLexic));
                        }
                    }
                    break;
            }
        }


        // Table
        
        Object[][] objectData = new Object[substringList.size()][3];
        for (int i = 0; i < substringList.size(); i++) {
            objectData[i][0] = substringList.get(i).getSubstring();
            objectData[i][1] = substringList.get(i).getLexic();
            objectData[i][2] = substringList.get(i).getstate();
            a.add(String.valueOf(substringList.get(substringList.size() - i -1).getstate()));
        }
        String[] stringTitle = new String[3];
        stringTitle[0] = "String";
        stringTitle[1] = "Besaran Lexic";
        stringTitle[2] = "Token Lexic";


        // Back button
    
    }
    
    private String[] joinStringArray(String[] stringArray1, String[] stringArray2) {
        String[] stringReturn = new String[stringArray1.length + stringArray2.length];
        for (int i = 0; i < stringArray1.length + stringArray2.length; i++) {
            if (i < stringArray1.length) {
                stringReturn[i] = stringArray1[i];
            } else {
                stringReturn[i] = stringArray2[i - stringArray1.length];
            }
        }
        return stringReturn;
    }

    private boolean isKeyword(String substring) {
        return (substring.equalsIgnoreCase("SELECT") || substring.equalsIgnoreCase("*") || substring.equalsIgnoreCase("FROM") || substring.equalsIgnoreCase("WHERE") || substring.equalsIgnoreCase(".") || substring.equalsIgnoreCase("=") || substring.equalsIgnoreCase(";") || substring.equalsIgnoreCase("(") || substring.equalsIgnoreCase(")") || substring.equalsIgnoreCase("JOIN") || substring.equalsIgnoreCase("UNION"));
    }

    private boolean isConstantString(String substring) {
        return ((substring.charAt(0) == '"' && substring.charAt(substring.length() - 1) == '"'));
    }

    private boolean isConstantNumber(String substring) {
        return (isInteger(substring) || isReal(substring));
    }

    private boolean isContainDot(String substring) {
        return substring.contains(".");
    }

    private boolean isContainSemicolon(String substring) {
        return substring.contains(";");
    }

    private int getstate(String substring) {
        try {
            String checkString = substring;
            if (!isKeyword(checkString)) {
                if (isConstantString(checkString)) {
                    checkString = "CONSTANT_STRING";
                } else if (isConstantNumber(checkString)) {
                    checkString = "CONSTANT_NUMBER";
                } else {
                    checkString = "VARIABLE";
                }
            }
            BufferedReader reader = new BufferedReader(new FileReader("Data.txt"));
            ArrayList<String> dataStringKeyword = new ArrayList<>();
            ArrayList<String> dataStringToken = new ArrayList<>();
            String dataString;
            while ((dataString = reader.readLine()) != null) {
                String[] dataStringArray = dataString.split(" ");
                dataStringKeyword.add(dataStringArray[0]);
                dataStringToken.add(dataStringArray[1]);
            }
            for (int i = 0; i < dataStringKeyword.size(); i++) {
                if (checkString.equalsIgnoreCase(dataStringKeyword.get(i))) {
                    if (isInteger(dataStringToken.get(i))) {
                        return Integer.parseInt(dataStringToken.get(i));
                    } else {
                        return -1;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("BufferedReader fails.");
        }
        return -1;
    }

    private boolean isInteger(String substring) {
        try {
            Integer.parseInt(substring);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isReal(String substring) {
        try {
            Float.parseFloat(substring);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public ArrayList getState() {
        return a;
    }

}
