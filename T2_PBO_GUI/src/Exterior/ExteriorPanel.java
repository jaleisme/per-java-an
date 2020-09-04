/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exterior;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

/**
 *
 * @author FAIZAL
 */
public class ExteriorPanel extends JPanel {
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        this.setBackground(new Color(140, 179, 255));
        
//        G.setColor(new Color(0, 240, 0));
//        G.fillRect(0, 0, 500, 500);
        
//        G.setColor(Color.white);
//        Polygon Lapangan = new Polygon();
//        Lapangan.addPoint(150, 150);
//        Lapangan.addPoint(150, 250);
//        Lapangan.addPoint(350, 250);
//        Lapangan.addPoint(350, 150);
//        G.fillPolygon(Lapangan);
//        
//        G.setColor(Color.lightGray);
//        Lapangan.reset();
//        Lapangan.addPoint(350, 250);
//        Lapangan.addPoint(350, 150);
//        Lapangan.addPoint(450, 50);
//        Lapangan.addPoint(450, 150);
//        G.fillPolygon(Lapangan);
//        
//        G.setColor(new Color(150, 150, 150));
//        Lapangan.reset();
//        Lapangan.addPoint(450, 50);
//        Lapangan.addPoint(250, 50);
//        Lapangan.addPoint(150, 150);
//        Lapangan.addPoint(350, 150);
//        G.fillPolygon(Lapangan);
        
        //Kubah Kiri
        G.setColor(new Color(189, 154, 42));
        G.fillOval(75, 100, 250, 250);
        
        //Kubah Tengah
        G.setColor(new Color(237, 237, 237));
        G.fillOval(384, 31, 311, 250);
        
        //Kubah Kanan
        G.setColor(new Color(189, 154, 42));
        G.fillOval(745, 100, 250, 250);
        
        //Kotak kecil dibawah Kubah
        G.setColor(new Color(193, 127, 69));
        G.fillRect(385, 140, 310, 20);
        
        //Gedung Awal
        G.setColor(new Color(250, 237, 140));
        G.fillRect(40, 200, 980, 250);
        
        //BULAT LIKE MY HEAD pake gradasi putih biar like benang panon poe
         G.setColor(new Color(92, 118, 211));
        G.fillOval(90, 265, 45, 50);
        
        //jendela kehampaan
        G.setColor(new Color(92, 118, 211));
        G.fillRect(90,290,45,110);
        
        //Coklat dibawah Kubah
        G.setColor(new Color(173, 107, 49));
        G.fillRect(40, 200, 980, 15);
        G.drawRect(359, 159, 361, 291);
        
        //Gedung tengah
        G.setColor(new Color(255, 243, 156));
        G.fillRect(360, 160, 360, 290);

        //Gradasi Gedung Tengah Kiri
        G.setColor(new Color(253, 240, 148));
        G.fillRect(360, 160, 30, 290);
        
        //Gradasi Gedung Tengah Kanan
        G.setColor(new Color(253, 240, 148));
        G.fillRect(690, 160, 30, 290);
        
        //Coklat diatas Gedung tengah
        G.setColor(new Color(173, 107, 49));
        G.fillRect(360, 160, 360, 15);
        
        //Ko Bulet 1
        G.setColor(new Color(173, 107, 49));
        G.fillRect(420, 320, 65, 130);
        G.fillOval(419, 285, 66, 80);
        
        //Gradasi Ko Bulet 1
        G.setColor(new Color(140, 74, 16));
        G.fillRect(430, 325, 45, 115);
        G.fillOval(429, 300, 46, 45);
        
        //Ko Bulet 2
        G.setColor(new Color(173, 107, 49));
        G.fillRect(510, 320, 65, 130);
        G.fillOval(509, 285, 66, 80);
        
        //Gradasi Ko Bulet 2
        G.setColor(new Color(140, 74, 16));
        G.fillRect(520, 325, 45, 115);
        G.fillOval(519, 300, 46, 45);
        
        //Ko Bulet 3
        G.setColor(new Color(173, 107, 49));
        G.fillRect(600, 320, 65, 130);
        G.fillOval(599, 285, 66, 80);
        
        //Gradasi Ko Bulet 3
        G.setColor(new Color(140, 74, 16));
        G.fillRect(610, 325, 45, 115);
        G.fillOval(609, 300, 46, 45);
        
        //Masjid Raya Ibnu Sina
        G.setColor(new Color(145, 87, 36));
        G.setFont(new Font("Levenim MT", Font.BOLD, 25));
        G.drawString("Masjid Raya Ibnu Sina", 400, 220);

        //SMKN 1 Katapang
        G.setFont(new Font("Levenim MT", Font.BOLD, 18));
        G.drawString("SMK Negeri 1 Katapang", 435, 250);
        
        //Karpet
        G.setColor(new Color(0,200,0));
        Polygon Kr = new Polygon();
        Kr.addPoint(360,450);
        Kr.addPoint(720,450);
        Kr.addPoint(820,800);
        Kr.addPoint(260,800);
        G.fillPolygon(Kr);
        
    }
}
