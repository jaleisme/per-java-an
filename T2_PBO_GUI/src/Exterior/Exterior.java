/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exterior;

import LinesRectsOval.LinesRectsOvalsJPanel;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author FAIZAL
 */
public class Exterior {
    public static void main(String[] args){
        JFrame MyFrame = new JFrame("Exterior");
        MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Panel
        ExteriorPanel MyPanel = new ExteriorPanel();
        MyPanel.setBackground(Color.white);
        MyFrame.add(MyPanel);
        MyFrame.setSize(1080, 540);
        MyFrame.setVisible(true);
    }
}

