/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape2D;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.GradientPaint;
import java.awt.TexturePaint;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;


/**
 *
 * @author FAIZAL
 */
public class ShapePanel extends JPanel {
    public void paintComponent(Graphics H){
        super.paintComponent(H);
        this.setBackground(Color.WHITE);
        
        Graphics2D G = (Graphics2D) H;
        
        H.drawString("Ellipse with Gradient", 2, 20);
        
        G.setPaint(new GradientPaint(5, 30, Color.BLUE, 35, 100, Color.CYAN, true));
        G.fill(new Ellipse2D.Double(5, 30, 65, 100));
        
        H.drawString("Rectangle", 100, 20);
        
        G.setPaint(Color.red);
        G.setStroke(new BasicStroke(10.0f));
        G.draw(new Rectangle2D.Double(100, 30, 65, 100));
        
    }
}
