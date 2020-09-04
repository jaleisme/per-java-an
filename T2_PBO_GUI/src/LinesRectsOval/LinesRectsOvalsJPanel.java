/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinesRectsOval;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

/**
 *
 * @author Soke Bahtera
 */
public class LinesRectsOvalsJPanel extends JPanel {
    
    //Draw Lines, Rectangles, and Ovals
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        this.setBackground(Color.WHITE);
        
        G.setColor(Color.RED);
        G.drawLine(5, 30, 375, 30);//X-axis coordinate, Y-axis Coordinate, width, height end coordinate
        
        
        G.setColor(Color.BLUE);
        G.drawRect(5, 40, 90, 55);
        G.fillRect(100, 40, 90, 55);
        
        //For Debugging Purposes
        //G.setColor(Color.BLACK);
        //G.drawRect(200, 40, 90, 55);//X-axis Coordinate, Y-axis Coordinate, Width, Height

        G.setColor(Color.CYAN);
        G.fillRoundRect(195, 40, 90, 55, 50, 50);
        G.drawRoundRect(290, 40, 90, 55, 50, 50);
        
        //For Debugging Purposes
        //G.setColor(Color.ORANGE);
        //G.fillRoundRect(390, 40, 90, 55, 50, 50);//X-axis, Y-axis, width, height, width-arc size, height-arc size
        
        G.setColor(Color.GREEN);
        G.draw3DRect(5, 100, 90, 55, true);
        G.fill3DRect(100, 100, 90, 55, true);
        
        G.setColor(Color.MAGENTA);
        G.drawOval(195, 100, 90, 55);
        G.fillOval(290, 100, 90, 55);
        
    }
}
