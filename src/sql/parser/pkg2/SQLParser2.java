/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql.parser.pkg2;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Toshiba PC
 */
public class SQLParser2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } 
        catch (UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, "Unsupported look and feel exception!", "Exception", JOptionPane.ERROR_MESSAGE);
        }
        catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Class not found exception!", "Exception", JOptionPane.ERROR_MESSAGE);
        }
        catch (InstantiationException e) {
            JOptionPane.showMessageDialog(null, "Instantiation exception!", "Exception", JOptionPane.ERROR_MESSAGE);
        }
        catch (IllegalAccessException e) {
            JOptionPane.showMessageDialog(null, "Illegal access exception!", "Exception", JOptionPane.ERROR_MESSAGE);
        }
        new InputPage();
    }
    
}
