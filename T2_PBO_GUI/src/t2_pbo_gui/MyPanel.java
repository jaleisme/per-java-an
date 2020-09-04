/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_pbo_gui;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author FAIZAL
 */
public class MyPanel extends JPanel {
    public void paintComponent(Graphics j){
        super.paintComponent(j);
        
//        //Top
//        j.setColor(new Color(0, 100, 200));
//        j.drawLine(50, 50, 150, 50);
//        
//        //Left
//        j.setColor(new Color(255, 0, 0));
//        j.drawLine(50, 50, 50, 100);
//        
//        //Bottom
//        j.setColor(new Color(0, 255, 0));
//        j.drawLine(50, 100, 150, 100);
//        
//        //Right
//        j.setColor(new Color(0, 0, 0));
//        j.drawLine(150, 50, 150, 100);
        
        //Coloring
        j.setColor(Color.blue);
        //Bottom
        j.drawLine(200, 250, 300, 250);
        //Right
        j.drawLine(300, 200, 300, 250);        
        //Left
        j.drawLine(200, 200, 200, 250);
        
        //yellow rect
        j.setColor(Color.yellow);
        j.fillRect(200, 150, 101, 50); // X-axis, Y-axis, Width, Height
        
        //blue rect
        j.setColor(Color.blue);
        j.fillRect(225, 200, 50, 50); // X-axis, Y-axis, Width, Height
        
        j.setColor(Color.red);
        j.drawPolygon(new int[] {275, 250, 225}, new int[] {200, 150, 200}, 3);
        j.fillPolygon(new int[] {275, 250, 225}, new int[] {200, 150, 200}, 3);
        j.drawString("Even Dead I'm The Hero", 190, 270);
    }
}
