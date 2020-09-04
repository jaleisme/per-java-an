/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polygon;

import javax.swing.JFrame;
import java.awt.Color;

/**
 *
 * @author FAIZAL
 */
public class Polygon {
    public static void main(String[] args){
        JFrame AnaFrame = new JFrame("Gambar Polygon");
        AnaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PolygonJPanel AnaPanel = new PolygonJPanel();
        AnaFrame.add(AnaPanel);
        AnaFrame.setSize(280, 270);
        AnaFrame.setVisible(true);
    }
}
