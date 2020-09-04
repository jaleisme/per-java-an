/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exterior_v2;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author FAIZAL
 */
public class Ext_v2 {
    public static void main(String[] args){
        JFrame MyFrame = new JFrame("Egypt Pyramids");
        MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Panel
        Ext_v2Panel MyPanel = new Ext_v2Panel();
        MyPanel.setBackground(Color.white);
        MyFrame.add(MyPanel);
        MyFrame.setSize(800, 600);
        MyFrame.setVisible(true);
    }
}
