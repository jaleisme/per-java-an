/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape2D;
import javax.swing.JFrame;
import java.awt.Color;
/**
 *
 * @author FAIZAL
 */
public class Shape2D {
    public static void main(String[] args){
        JFrame AbiFrame = new JFrame("Gambar Bentuk 2 Dimensi");
        
        ShapePanel AbiPanel = new ShapePanel();
        AbiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        AbiFrame.add(AbiPanel);
        AbiFrame.setSize(600, 200);
        AbiFrame.setVisible(true);
    }
}
