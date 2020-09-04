/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polygon;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;
/**
 *
 * @author FAIZAL
 */
public class PolygonJPanel extends JPanel {
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        this.setBackground(Color.white);
        int[] Xa = {20, 40, 50, 30, 20, 15};
        int[] Ya = {50, 50, 60, 80, 80, 60};
        Polygon PolyOne = new Polygon(Xa, Ya, 6);
        G.drawPolygon(PolyOne);
        
        //Polyline with 2 array
        int[] Xb = {70, 90, 100, 80, 70, 65, 60};
        int[] Yb = {100, 100, 110, 110, 130, 110, 90};
        G.drawPolyline(Xb, Yb, 4);
        
        //Polygon with 2 array
        int[] Xc = {120, 140, 150, 190};
        int[] Yc = {40, 70, 80, 60};
        G.fillPolygon(Xc, Yc, 4);
        
        Polygon PolyTwo = new Polygon();
        PolyTwo.addPoint(165, 135);
        PolyTwo.addPoint(175, 150);
        PolyTwo.addPoint(270, 200);
        PolyTwo.addPoint(200, 220);
        PolyTwo.addPoint(130, 180);
        G.fillPolygon(PolyTwo);
        
        G.drawString("Even Dead, I'm the Heroes", 5, 220);
        
    }
}
