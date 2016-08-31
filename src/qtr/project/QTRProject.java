/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qtr.project;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Alejandro
 */
public class QTRProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        System.out.println("Created GUI on EDT? " + SwingUtilities.isEventDispatchThread());
   //   JFrame frame = new JFrame("Title");
        JFrame frame = new JFrame("Credits");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton back = new JButton("Back");
        back.setSize(70, 25);
        back.setLocation(10, 360);
        frame.add(back);
      frame.add(new TitlePage());
        frame.add(new CreditPage());
        frame.pack();
        frame.setVisible(true);
    }
}