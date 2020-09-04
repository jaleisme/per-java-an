/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exterior_v2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

/**
 *
 * @author FAIZAL
 */
public class Ext_v2Panel extends JPanel {
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        this.setBackground(new Color(140, 179, 255));
        
        G.setColor(new Color(255, 255, 0));
        G.fillRect(0, 400, 800, 400);
        Polygon PyOne = new Polygon();        
        
        //Piramida 1 -----------------------------------------------------------
        
        //Shadowy Base
        G.setColor(Color.yellow);
        PyOne.reset();
        PyOne.addPoint(0, 380);//Atas Kiri
        PyOne.addPoint(0, 400);//Bawah Kiri
        PyOne.addPoint(800, 400);//Bawah Kanan
        PyOne.addPoint(800, 380);//Atas Kanan
        G.fillPolygon(PyOne);
        
        //Shadowy Part
        G.setColor(new Color(140, 140, 0));
        PyOne.reset();
        PyOne.addPoint(440, 370);
        PyOne.addPoint(470, 400);
        PyOne.addPoint(570, 200);
        G.fillPolygon(PyOne);
        
        //Main Part
        G.setColor(new Color(240, 240, 0));
        PyOne.reset();
        PyOne.addPoint(470, 400);
        PyOne.addPoint(670, 400);
        PyOne.addPoint(570, 200);
        G.fillPolygon(PyOne);
        G.setColor(new Color(140, 140, 0));
        G.drawPolygon(PyOne);
        
        //Piramida 2------------------------------------------------------------
        
        //Shadowy Part
        G.setColor(new Color(170, 170, 0));
        PyOne.reset();
        PyOne.addPoint(275, 360); //Bawah Kiri
        PyOne.addPoint(315, 400); //Bawah Kanan
        PyOne.addPoint(440, 150); //Peak
        G.fillPolygon(PyOne);
        
        //Main Part
        G.setColor(new Color(240, 240, 0));
        PyOne.reset();
        PyOne.addPoint(315, 400);//Bawah Kiri
        PyOne.addPoint(565, 400);//Bawah Kanan
        PyOne.addPoint(440, 150); //Peak
        G.fillPolygon(PyOne);
        G.setColor(new Color(140, 140, 0));
        G.drawPolygon(PyOne);
        
        
        //Piramida 3------------------------------------------------------------
        
        //Shadowy Part
        PyOne.reset();
        G.setColor(new Color(170, 170, 0));
        PyOne.addPoint(180, 380); //Bawah Kiri
        PyOne.addPoint(200, 400); //Bawah Kanan
        PyOne.addPoint(275, 250); //Peak
        G.fillPolygon(PyOne);
        
        //Shadowy Terrain
        G.setColor(new Color(140, 140, 0));
        PyOne.reset();
        PyOne.addPoint(0, 380);//Atas Kiri
        PyOne.addPoint(0, 400);//Bawah Kiri
        PyOne.addPoint(200, 400);//Bawah Kanan
        PyOne.addPoint(180, 380);//Atas Kanan
        G.fillPolygon(PyOne);
        G.setColor(new Color(140, 140, 0));
        G.drawPolygon(PyOne);
        
        //Main Part
        G.setColor(new Color(240, 240, 0));
        PyOne.reset();
        PyOne.addPoint(200, 400); //Bawah Kiri
        PyOne.addPoint(350, 400); //Bawah Kanan
        PyOne.addPoint(275, 250); //Peak
        G.fillPolygon(PyOne);
        G.setColor(new Color(140, 140, 0));
        G.drawPolygon(PyOne);
        
        
        //Sun ------------------------------------------------------------------
        
        G.setColor(Color.orange);
        G.fillOval(650, -100, 200, 200);
    }
}
