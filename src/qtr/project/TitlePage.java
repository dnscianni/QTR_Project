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
public class TitlePage extends JPanel {
    


@Override
    public Dimension getPreferredSize(){
        return new Dimension(600,400);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Font font = new Font("Lucida Console", Font.BOLD, 30);
        Graphics2D g2 = (Graphics2D) g;
        g2.setFont(font);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawString("Super Hangman Delux", this.getWidth()/2-200, 100);
        font = new Font("Lucida Console", Font.PLAIN, 10);
        g2.setFont(font);
        g.drawString("a CS 245 Project",this.getWidth()/2-200, 160);
        font = new Font("Lucida Console", Font.PLAIN, 20);
        g2.setFont(font);
        g.drawString("by WYSIWIZARDS", this.getWidth()/2-200, 240);
    }
}
