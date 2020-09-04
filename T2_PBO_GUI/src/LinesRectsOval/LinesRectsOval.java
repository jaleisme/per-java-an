/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinesRectsOval;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Soke Bahtera
 */

public class LinesRectsOval {
    public static void main(String[] args){
        JFrame MyFrame = new JFrame("Menggambar Garis, Persegi, dan Oval");
        MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Panel
        LinesRectsOvalsJPanel MyPanel = new LinesRectsOvalsJPanel();
        MyPanel.setBackground(Color.white);
        MyFrame.add(MyPanel);
        MyFrame.setSize(400, 210);
        MyFrame.setVisible(true);
    }
}
