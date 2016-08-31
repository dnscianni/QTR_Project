/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qtr.project;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * @author Alejandro
 */
public class CreditPage extends JPanel{
    
     public Dimension getPreferredSize(){
        return new Dimension(600,400);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Font font = new Font("Lucida Console", Font.PLAIN, 20);
        Graphics2D g2 = (Graphics2D) g;
        g2.setFont(font);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawString("Created By", this.getWidth()/2-70, 100);
        g.drawString("Alejandro Diaz    008202922",this.getWidth()/2-130, 130);
        g.drawString("Raymond Mandujano", this.getWidth()/2-130, 150);
        g.drawString("David Scianni", this.getWidth()/2-130, 170);
    }
    
}
