/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_pbo_gui;

import java.awt.Color;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import java.awt.Graphics;
/**
 *
 * @author FAIZAL
 */
public class T2_PBO_GUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                createAndShowGUI();
            }
        });

        //String
        
    }
    
    private static void createAndShowGUI(){
        JFrame JF = new JFrame("Tutorial Gambar");
        JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JF.setSize(500, 500);
        JF.setVisible(true);

        JF.add(new MyPanel());
    }
    
    
}
