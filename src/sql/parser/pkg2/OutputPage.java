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
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Toshiba PC
 */
public class OutputPage extends JFrame implements ActionListener {

    JPanel panel;
    JLabel label;
    JButton buttonBack;
    
    
    
    public OutputPage (ArrayList stringInput) {
        
        // Program Contoh PDA
        ArrayList<String> stack = new ArrayList<>();
        ArrayList<String> a = new ArrayList<>();
        a = stringInput;
        ArrayList<ArrayList<String>> stackDummyList = new ArrayList<>();
        ArrayList<Integer> indexStrDummyList = new ArrayList<>();
        int startNum = 0;
        int stateNum = 0;
        int indexStr = 0;
        boolean isValid = false;
   
        int i = 0;
        while(i < stringInput.size()) {
            System.out.println(stringInput.get(i));
            i++;
        }
        i = 0;
        while (indexStr < stringInput.size() || stack.size() > 0) {
            if (indexStr < stringInput.size()) {
       //         if (stringInput.charAt(indexStr) == ' ' || stringInput.charAt(indexStr) == '\n' || stringInput.charAt(indexStr) == '\t') {
       //             indexStr++;
         //       }
           }
            
            switch (stateNum) {
                case 0:
                    stack.add("#");
                    stateNum++;
                    break;
                case 1:
                    stack.add("S");
                    stateNum++;
                    break;
                case 2:
                    int stackLastIndex = stack.size() - 1;
                    if (stack.get(stackLastIndex) == "#") {
                        stateNum++;
                    }
                    else if (stack.get(stackLastIndex) == "S") {
                        stack.remove(stackLastIndex);
                        switch (startNum) {
                            case 0:
                               // S -> A B E K
                               stack.add("K");
                               stack.add("E");
                               stack.add("B");
                               stack.add("A"); 
                                
                               break;
                            case 1:
                                // S -> A C E B
                                stack.add("K");
                                stack.add("E");
                                stack.add("C");
                                stack.add("A"); 
                                break;
                            case 2:
                                // S -> A D E Kse
                            /*    stack.add("K");
                                stack.add("E");
                                stack.add("D");
                                stack.add("A"); */
                                stack.add("C");
                                break;
                            case 3:
                                // S -> A C E F G K
                                stack.add("K");
                                stack.add("G");
                                stack.add("F");
                                stack.add("E");
                                stack.add("C");
                                stack.add("A");
                                break;
                            case 4:
                                // S -> A B E F G K
                                stack.add("K");
                                stack.add("G");
                                stack.add("F");
                                stack.add("E");
                                stack.add("B");
                                stack.add("A");
                                break;
                             case 5:
                                // S -> A C E F N K
                                stack.add("K");
                                stack.add("N");
                                stack.add("F");
                                stack.add("E");
                                stack.add("C");
                                stack.add("A");
                                break;
                            case 6:
                                // S -> A B E F N K
                                stack.add("K");
                                stack.add("N");
                                stack.add("F");
                                stack.add("E");
                                stack.add("B");
                                stack.add("A");
                                break;
                            case 7:
                                // S -> A C E F L K
                                stack.add("K");
                                stack.add("L");
                                stack.add("F");
                                stack.add("E");
                                stack.add("C");
                                stack.add("A");
                                break;
                            case 8:
                                // S -> A B E F L K
                                stack.add("K");
                                stack.add("L");
                                stack.add("F");
                                stack.add("E");
                                stack.add("B");
                                stack.add("A");
                                break;
                             case 9:
                                // S -> A C E F R K
                                stack.add("K");
                                stack.add("R");
                                stack.add("F");
                                stack.add("E");
                                stack.add("C");
                                stack.add("A");
                                break;
                             case 10:
                                // S -> A B E F R K
                                stack.add("K");
                                stack.add("R");
                                stack.add("F");
                                stack.add("E");
                                stack.add("B");
                                stack.add("A");
                                break;
                             case 11:
                                // S -> A C E F P K
                                stack.add("K");
                                stack.add("P");
                                stack.add("F");
                                stack.add("E");
                                stack.add("C");
                                stack.add("A");
                                break;
                            case 12:
                                // S -> A B E F P K
                                stack.add("K");
                                stack.add("P");
                                stack.add("F");
                                stack.add("E");
                                stack.add("B");
                                stack.add("A");
                                break;
                            case 13:
                                // S -> A C E F I K
                                stack.add("K");
                                stack.add("I");
                                stack.add("F");
                                stack.add("E");
                                stack.add("C");
                                stack.add("A");
                                break;
                            case 14:
                                // S -> A B E F I K
                                stack.add("K");
                                stack.add("I");
                                stack.add("F");
                                stack.add("E");
                                stack.add("B");
                                stack.add("A");
                                break;
                             case 15:
                                // S -> A C E F G M G K
                                stack.add("K");
                                stack.add("G");
                                stack.add("M");
                                stack.add("G");
                                stack.add("F");
                                stack.add("E");
                                stack.add("C");
                                stack.add("A");
                                break;
                             case 16:
                                // S -> A B E F G M G K
                                stack.add("K");
                                stack.add("G");
                                stack.add("M");
                                stack.add("G");
                                stack.add("F");
                                stack.add("E");
                                stack.add("B");
                                stack.add("A");
                                break;
                             case 17:
                                // S -> A C E F I M I K
                                stack.add("K");
                                stack.add("I");
                                stack.add("M");
                                stack.add("I");
                                stack.add("F");
                                stack.add("E");
                                stack.add("C");
                                stack.add("A");
                                break;
                            case 18:
                                // S -> A B E F I M I K
                                stack.add("K");
                                stack.add("I");
                                stack.add("M");
                                stack.add("I");
                                stack.add("F");
                                stack.add("E");
                                stack.add("B");
                                stack.add("A");
                                break;
                            case 19:
                                // S -> A C E F G O G K
                                stack.add("K");
                                stack.add("G");
                                stack.add("O");
                                stack.add("G");
                                stack.add("F");
                                stack.add("E");
                                stack.add("C");
                                stack.add("A");
                                break;
                            case 20:
                                // S -> A B E F G O G K
                                stack.add("K");
                                stack.add("G");
                                stack.add("O");
                                stack.add("G");
                                stack.add("F");
                                stack.add("E");
                                stack.add("B");
                                stack.add("A");
                                break;
                             case 21:
                                // S -> A C E F I O I K
                                stack.add("K");
                                stack.add("I");
                                stack.add("O");
                                stack.add("I");
                                stack.add("F");
                                stack.add("E");
                                stack.add("C");
                                stack.add("A");
                                break;
                            case 22:
                                // S -> A B E F I O I K
                                stack.add("K");
                                stack.add("I");
                                stack.add("O");
                                stack.add("I");
                                stack.add("F");
                                stack.add("E");
                                stack.add("B");
                                stack.add("A");
                                break;
                            case 23:
                                // S -> A C E F Q K
                                stack.add("K");
                                stack.add("Q");
                                stack.add("F");
                                stack.add("E");
                                stack.add("C");
                                stack.add("A");
                                break;
                            case 24:
                                // S -> A B E F Q K
                                stack.add("K");
                                stack.add("Q");
                                stack.add("F");
                                stack.add("E");
                                stack.add("B");
                                stack.add("A");
                                break;
                             case 25:
                                // S -> A C E F T K
                                stack.add("K");
                                stack.add("T");
                                stack.add("F");
                                stack.add("E");
                                stack.add("C");
                                stack.add("A");
                                break;
                            case 26:
                                // S -> A B E F T K
                                stack.add("K");
                                stack.add("T");
                                stack.add("F");
                                stack.add("E");
                                stack.add("B");
                                stack.add("A");
                                break;
                            case 27:
                                // S -> S 17 S K 
                                stack.add("K");
                                stack.add("S");
                                stack.add("17");
                                stack.add("S");
                                break;
                            default:
                                indexStr = stringInput.size();
                                stack = new ArrayList<>();
                                break;
                        }
                    }
                    else if (stack.get(stackLastIndex) == "A") {
                        stack.remove(stackLastIndex);
                        // A -> 1
                        stack.add("1");
                    }
                    else if (stack.get(stackLastIndex) == "B") {
                        stack.remove(stackLastIndex);
                        // B -> 2
                        stack.add("2");
                    }
                    else if (stack.get(stackLastIndex) == "C") {
                        stack.remove(stackLastIndex);
                        // C -> 4
                        stack.add("4");
                        
                      
                    }
                    else if (stack.get(stackLastIndex) == "D") {
                        stack.remove(stackLastIndex);
                        // D -> 4 22 D                        
                        //ArrayList<String> stackDummy = new ArrayList<>(stack);
                      //  stackDummy.add("D");
                      //  stackDummy.add("22");
                      //  stackDummy.add("4");
                      //  stackDummyList.add(stackDummy);
                      //  indexStrDummyList.add(indexStr);
                        // D -> 4 22 4
                        stack.add("4");
                        stack.add("22");
                        stack.add("4"); 
                    }
                    else if (stack.get(stackLastIndex) == "E") {
                        stack.remove(stackLastIndex);
                        // E -> 3 4
                        stack.add("4");
                        stack.add("3");
                    }
                    else if (stack.get(stackLastIndex) == "F") {
                        stack.remove(stackLastIndex);
                        // F -> 5
                        stack.add("5");
                    }
                    else if (stack.get(stackLastIndex) == "G") {
                        stack.remove(stackLastIndex);
                        // G -> 4 7 10
                        stack.add("10");
                        stack.add("7");
                        stack.add("4");
                    }
                    else if (stack.get(stackLastIndex) == "H") {
                        stack.remove(stackLastIndex);
                        // H -> 4 7 10 14 H
                        ArrayList<String> stackDummy = new ArrayList<>(stack);
                        stackDummy.add("H");
                        stackDummy.add("14");
                        stackDummy.add("10");
                        stackDummy.add("7");
                        stackDummy.add("4");
                        stackDummyList.add(stackDummy);
                        indexStrDummyList.add(indexStr);
                        // H -> 4 7 10 14 G
                        stack.add("G");
                        stack.add("14");
                        stack.add("10");
                        stack.add("7");
                        stack.add("4"); 
                    }
                    else if (stack.get(stackLastIndex) == "I") {
                        stack.remove(stackLastIndex);
                        // I -> 4 7 8
                        stack.add("8");
                        stack.add("7");
                        stack.add("4");
                    }
                    else if (stack.get(stackLastIndex) == "J") {
                        stack.remove(stackLastIndex);
                        // J -> 4 7 8 14 J	
                        ArrayList<String> stackDummy = new ArrayList<>(stack);
                        stackDummy.add("J");
                        stackDummy.add("14");
                        stackDummy.add("8");
                        stackDummy.add("7");
                        stackDummy.add("4");
                        stackDummyList.add(stackDummy);
                        indexStrDummyList.add(indexStr);
                        // J -> 4 7 8 14 I
                        stack.add("I");
                        stack.add("14");
                        stack.add("8");
                        stack.add("7");
                        stack.add("4"); 
                    }
                    else if (stack.get(stackLastIndex) == "K") {
                        stack.remove(stackLastIndex);
                        // I -> 4 7 8
                        stack.add("9");
                    }
                    else if (stack.get(stackLastIndex) == "L") {
                        stack.remove(stackLastIndex);
                        // L -> 4 18 10
                        stack.add("10");
                        stack.add("18");
                        stack.add("4");
                    }
                
                    else if (stack.get(stackLastIndex) == "N") {
                        stack.remove(stackLastIndex);
                        // N -> 4 19 10
                        stack.add("10");
                        stack.add("19");
                        stack.add("4");
                    }
                    
                    else if (stack.get(stackLastIndex) == "P") {
                        stack.remove(stackLastIndex);
                        // P -> 4 21 10
                        stack.add("10");
                        stack.add("21");
                        stack.add("4");
                    }
                    else if (stack.get(stackLastIndex) == "R") {
                        stack.remove(stackLastIndex);
                        // R -> 4 20 10
                        stack.add("10");
                        stack.add("20");
                        stack.add("4");
                    }
                    else if (stack.get(stackLastIndex) == "M") {
                        stack.remove(stackLastIndex);
                        // M -> 14	
                        stack.add("14");
                    
                    }
                    else if (stack.get(stackLastIndex) == "O") {
                        stack.remove(stackLastIndex);
                        // O ->15
                        stack.add("15");
                    
                    }
                    else if (stack.get(stackLastIndex) == "Q") {
                        stack.remove(stackLastIndex);
                        // Q -> 4 25 12 S 13
                        stack.add("13");
                        stack.add("S");
                        stack.add("12");
                        stack.add("25");
                        stack.add("4");
                    }
                    else if (stack.get(stackLastIndex) == "Q") {
                        stack.remove(stackLastIndex);
                        // T -> 4 24 12 S 13
                        stack.add("13");
                        stack.add("S");
                        stack.add("12");
                        stack.add("24");
                        stack.add("4");
                    }
                    
                    else {
                        
                            boolean isInputEqualWithStack = String.valueOf(stringInput.get(stringInput.size()-1)).equals(String.valueOf(stack.get(stackLastIndex)));
                            System.out.println(isInputEqualWithStack);
                            System.out.println(stringInput.get(stringInput.size()-1));
                            System.out.println(stack.get(stack.size()-1));
                            System.out.println(i);
                       
                        if (isInputEqualWithStack) {
                            stack.remove(stackLastIndex);
                            stringInput.remove(stringInput.size() -1);
                        
                            indexStr++;
                        
                        }
                        else {
                            
                            if (stackDummyList.size() > 0) {
                                stringInput = a;
                                stack = stackDummyList.get(0);
                                indexStr = indexStrDummyList.get(0);
                                stackDummyList.remove(0);
                                indexStrDummyList.remove(0);
                                startNum++;
                 
               
                            }
                            else {
                                stringInput = a;
                                startNum++;
                                stack = new ArrayList<>();          
                                stackDummyList = new ArrayList<>();
                                indexStrDummyList = new ArrayList<>();
                                stateNum = 0;
                                indexStr = 0;
                                isValid = false;
                            }
                        } 
               
                    }
                    break;
                case 3:
                    isValid = true;
                    stack.remove(stack.size() - 1);
                 //   stringInput.remove(stringInput.size() - 1);
                    break;
             
            }
            indexStr++;
        }
        
        this.setTitle("SQL Parser 2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        
        // Label
        label = new JLabel("Valid");
        if (!isValid) {
            label = new JLabel("Invalid");
        }
        label.setPreferredSize(new Dimension(100, 25));
        label.setAlignmentX(CENTER_ALIGNMENT);
        label.setAlignmentY(CENTER_ALIGNMENT);
        addItem(panel, label, 0, 0, 1, 1, 150, 50, GridBagConstraints.CENTER);
        
        // Back button
        buttonBack = new JButton("Back");
        buttonBack.setPreferredSize(new Dimension(100, 25));
        buttonBack.addActionListener(this);
        addItem(panel, buttonBack, 0, 1, 1, 1, 150, 50, GridBagConstraints.CENTER);
        
        this.add(panel);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setBackground(Color.WHITE);
        this.setForeground(Color.WHITE);
        this.setResizable(false);
    }
    
    private void addItem(JPanel panel, JComponent component, int x, int y, int width, int height, int weightX, int weightY, int align) {
        GridBagConstraints gridBagConstraint = new GridBagConstraints();
        gridBagConstraint.gridx = x;
        gridBagConstraint.gridy = y;
        gridBagConstraint.gridwidth = width;
        gridBagConstraint.gridheight = height;
        gridBagConstraint.weightx = weightX;
        gridBagConstraint.weighty = weightY;
        gridBagConstraint.anchor = align;
        gridBagConstraint.fill = GridBagConstraints.NONE;
        gridBagConstraint.insets = new Insets(5, 5, 5, 5);
        panel.add(component, gridBagConstraint);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonBack) {
            new InputPage();
            this.dispose();
        }
    }
    
}
