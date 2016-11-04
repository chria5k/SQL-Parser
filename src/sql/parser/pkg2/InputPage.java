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
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Toshiba PC
 */
public class InputPage extends JFrame implements ActionListener {
    
    private JPanel panel;
    private JTextArea textArea;
    private JButton buttonEvaluate;
    
    public InputPage () {
        this.setTitle("SQL Parser 2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        
        // Text area
        textArea = new JTextArea(500, 250);
        JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setPreferredSize(new Dimension(500, 250));
        addItem(scrollPane, 0, 0, 1, 1, 250, 250, GridBagConstraints.CENTER);
        
        // Evaluate button
        buttonEvaluate = new JButton("Evaluate");
        buttonEvaluate.setPreferredSize(new Dimension(100, 25));
        buttonEvaluate.addActionListener(this);
        addItem(buttonEvaluate, 0, 1, 1, 1, 150, 50, GridBagConstraints.CENTER);
        
        this.add(panel);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setBackground(Color.WHITE);
        this.setForeground(Color.WHITE);
        this.setResizable(false);
    }
    
    private void addItem(JComponent component, int x, int y, int width, int height, int weightX, int weightY, int align) {
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
        Data d = new Data(textArea.getText());
        if (e.getSource() == buttonEvaluate) {
            new OutputPage(d.getState());
            this.dispose();
        }
    }
    
}
