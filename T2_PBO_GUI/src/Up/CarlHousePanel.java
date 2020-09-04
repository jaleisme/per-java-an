/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Up;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author FAIZAL 
 */
public class CarlHousePanel extends JPanel {
        public void paintComponent(Graphics G){
            Graphics2D G2 = (Graphics2D) G;
            
            super.paintComponent(G);
            this.setBackground(new Color(177, 223, 255));
            
            G.setColor(new Color(57, 77, 176));
            
            //Gunung-----------------------------------------------------------
            Polygon PolyOne = new Polygon();
            PolyOne.addPoint(0, 180);//Awal
            PolyOne.addPoint(40, 130);//Tanjakan 1
            PolyOne.addPoint(100, 130);//Flat 1
            PolyOne.addPoint(105, 120);//Tanjakan 2
            PolyOne.addPoint(130, 120);//Flat 2
            PolyOne.addPoint(400, 120);//Ujung Kanan
            PolyOne.addPoint(360, 220);//Ujung Kanan
            PolyOne.addPoint(380, 320);//Ujung Kanan
            PolyOne.addPoint(360, 420);//Ujung Kanan
            PolyOne.addPoint(390, 500);//Bawah Kanan
            PolyOne.addPoint(0, 500);//Bawah Kiri
            G.fillPolygon(PolyOne);
            
            PolyOne.reset();
            PolyOne.addPoint(400, 120);//Depth 1A
            PolyOne.addPoint(400, 520);//Depth 1A
            PolyOne.addPoint(360, 520);//Depth 1A
            PolyOne.addPoint(320, 520);//Depth 1A
            PolyOne.addPoint(360, 120);//Depth 1A
            G.fillPolygon(PolyOne);
            
            //Gradasi 1
            G.setColor(new Color(66, 91, 183));
            PolyOne.reset();
            PolyOne.addPoint(0, 180);//Awal
            PolyOne.addPoint(40, 130);//Tanjakan
            PolyOne.addPoint(50, 500);//Bawah Kanan
            PolyOne.addPoint(0, 500);//End
            G.fillPolygon(PolyOne);
            
            //Gradasi 2
            G.setColor(new Color(92, 118, 211));
            PolyOne.reset();
            PolyOne.addPoint(40, 130);//Tanjakan 1
            PolyOne.addPoint(100, 130);//Tanjakan
            PolyOne.addPoint(80, 400);//Bawah Kanan
            PolyOne.addPoint(100, 500);//Bawah Kanan
            PolyOne.addPoint(40, 500);//End
            G.fillPolygon(PolyOne);
            
                        //bayangan 1
            PolyOne.reset();
            G.setColor(new Color(54, 54, 54));
            PolyOne.addPoint(105, 120);//Tanjakan 2
            PolyOne.addPoint(90, 130);//Flat 1
            PolyOne.addPoint(90, 600);//Tanjakan 2
            G.fillPolygon(PolyOne);
            
            
            //Gradasi 3
            G.setColor(new Color(36, 46, 133));
            PolyOne.reset();
            PolyOne.addPoint(100, 130);//Flat 1
            PolyOne.addPoint(105, 120);//Tanjakan 2
            PolyOne.addPoint(160, 120);//Flat 2
            PolyOne.addPoint(180, 300);//Flat 2
            PolyOne.addPoint(180, 500);//Flat 2
            PolyOne.addPoint(0, 500);//Flat 2
            PolyOne.addPoint(80, 400);//Bawah Kanan
            PolyOne.addPoint(100, 130);//Tanjakan
            G.fillPolygon(PolyOne);
            
            //Gradasi 4
            G.setColor(new Color(25, 32, 76));
            PolyOne.reset();
            PolyOne.addPoint(160, 120);//Flat 2
            PolyOne.addPoint(180, 300);//Flat 2
            PolyOne.addPoint(180, 500);//Flat 2
            PolyOne.addPoint(250, 520);//Bawah Kiri
            PolyOne.addPoint(270, 300);//Bawah Kiri
            PolyOne.addPoint(250, 120);//Ujung Kiri
            G.fillPolygon(PolyOne);
            
            //Gradasi 5
            G.setColor(new Color(92, 118, 211));
            PolyOne.reset();
            PolyOne.addPoint(400, 120);//Ujung Kanan
            PolyOne.addPoint(420, 140);//Ujung Kiri 1
            PolyOne.addPoint(430, 240);//Ujung Kiri 2
            PolyOne.addPoint(430, 520);//Ujung Kiri Bawah
            PolyOne.addPoint(400, 520);//Ujung Kanan Bawah
            G.fillPolygon(PolyOne);
            
            //Tebing kanan
            G.setColor(new Color(57, 77, 176));
            PolyOne.reset();
            PolyOne.addPoint(540, 270);//Flat 2
            PolyOne.addPoint(650, 300);//Flat 2
            PolyOne.addPoint(650, 345);//Flat 2
            PolyOne.addPoint(620, 360);//Flat 2
            PolyOne.addPoint(640, 500);//Flat 2
            PolyOne.addPoint(560, 500);//Flat 2
            PolyOne.addPoint(570, 340);//Flat 2
            PolyOne.addPoint(540, 310);//Flat 2
            G.fillPolygon(PolyOne);
            
            G.setColor(new Color(36, 46, 133));
            PolyOne.reset();
            PolyOne.addPoint(540, 300);//Flat 2
            PolyOne.addPoint(650, 330);//Flat 2
            PolyOne.addPoint(650, 350);//Flat 2
            
            PolyOne.addPoint(600, 370);//Flat 2
            PolyOne.addPoint(620, 500);//Flat 2
            PolyOne.addPoint(560, 500);//Flat 2
            PolyOne.addPoint(570, 340);//Flat 2
            PolyOne.addPoint(540, 310);//Flat 2
            G.fillPolygon(PolyOne);
            
            // sungai
            G.setColor(new Color(54,54,54));
            PolyOne.reset();
            PolyOne.addPoint(278, 120);//Ujung Kiri
            PolyOne.addPoint(338, 120);//Ujung Kiri
            PolyOne.addPoint(402, 520);//Bawah Kiri
            PolyOne.addPoint(250, 520);//Bawah Kiri
            G.fillPolygon(PolyOne);
            
            //Air
            G.setColor(new Color(183, 195, 233));
            Polygon PolyOneA = new Polygon();
            PolyOneA.addPoint(280, 120);//Ujung Kiri
            PolyOneA.addPoint(340, 120);//Ujung Kiri
            PolyOneA.addPoint(400, 520);//Bawah Kiri
            PolyOneA.addPoint(250, 520);//Bawah Kiri
            G.fillPolygon(PolyOneA);
            
            G.setColor(new Color(170, 182, 220));
            PolyOneA.reset();
            PolyOneA.addPoint(300, 140);//Ujung Kiri
            PolyOneA.addPoint(320, 140);//Ujung Kiri
            PolyOneA.addPoint(380, 520);//Bawah Kiri
            PolyOneA.addPoint(270, 520);//Bawah Kiri
            G.fillPolygon(PolyOneA);
            
            //Bangunan---------------------------------------------------------
                //Putih
            G.setColor(new Color(245, 245, 245));
            G.fillRect(150, 50, 110, 70);
            
                //Kuning
            G.setColor(Color.yellow);
            G.fillRect(200, 50, 50, 70);
            
                //Kaca kiri kuning
            G.setColor(new Color(245, 245, 245));
            G.fillRect(205, 70, 10, 30);
            
                //Kaca item kiri 1
            G.setColor(new Color(70, 70, 70));
            G.fillRect(206, 72, 8, 12);
            
                //Kaca item kiri 2
            G.setColor(new Color(70, 70, 70));
            G.fillRect(206, 86, 8, 12);
            
                //Kaca tengah kuning
            G.setColor(new Color(245, 245, 245));
            G.fillRect(220, 70, 10, 30);
            
            //Kaca item tengah 1
            G.setColor(new Color(70, 70, 70));
            G.fillRect(221, 72, 8, 12);
            
                //Kaca item tengah 2
            G.setColor(new Color(70, 70, 70));
            G.fillRect(221, 86, 8, 12);
            
                //Kaca kanan kuning
            G.setColor(new Color(245, 245, 245));
            G.fillRect(235, 70, 10, 30);
            
                //Kaca item kanan 1
            G.setColor(new Color(70, 70, 70));
            G.fillRect(236, 72, 8, 12);
            
                //Kaca item kanan 2
            G.setColor(new Color(70, 70, 70));
            G.fillRect(236, 86, 8, 12);
            
            
                //Ungu
            G.setColor(new Color(221, 121, 221));
            G.fillRect(150, 50, 50, 70);
            
                //Pintu
            G.setColor(new Color(245, 135, 245));
            G.fillRect(181, 64, 14, 34);
            G.setColor(new Color(230, 230, 230));
            G.drawRect(180, 63, 15, 35);
            G.drawRect(182, 65, 11, 14);//Kotak atas
            G.drawRect(182, 81, 11, 14);//Kotak bawah
            
                //Tangga
            G.setColor(Color.white);//bawah
            G.fillRect(175, 115, 25, 5);
            
            G.setColor(Color.lightGray);//tengah
            G.fillRect(175, 110, 25, 5);
            
            G.setColor(Color.white);//atas
            G.fillRect(175, 105, 25, 5);
            
                //Teras
            G.setColor(new Color(240, 240, 240));
            G.fillRect(140, 105, 35, 15);//Alas
            G.fillRect(140, 50, 5, 55);//Tiang Awal
            G.fillRect(150, 90, 5, 15);//Pole 1
            G.fillRect(160, 90, 5, 15);//Pole 2
            G.fillRect(170, 50, 5, 55);//Tiang Akhir
            G.fillRect(140, 85, 35, 5);//Handle Pole
            
            //Atap-------------------------------------------------------------
            G.setColor(new Color(139, 118, 137));
            Polygon PolyTwo = new Polygon();
            PolyTwo.addPoint(138, 50);//Awal
            PolyTwo.addPoint(150, 20);//Tanjakan Kiri
            PolyTwo.addPoint(258, 20);//Top
            PolyTwo.addPoint(270, 50);//Turunan Kanan
            G.fillPolygon(PolyTwo);
            
                //Segitiga gede
            G.setColor(new Color(245, 245, 0));
            Polygon PolyThree = new Polygon();
            PolyThree.addPoint(200, 50);
            PolyThree.addPoint(225, 20);
            PolyThree.addPoint(250, 50);
            G.fillPolygon(PolyThree);
            
                //Segitiga gede roof
                
                    //Kiri
            G.setColor(new Color(121, 100, 119));
            Polygon PolyFour = new Polygon();
            PolyFour.addPoint(190, 55);
            PolyFour.addPoint(200, 55);
            PolyFour.addPoint(225, 20);
            PolyFour.addPoint(225, 10);
            G.fillPolygon(PolyFour);
            
                    //Kanan
            PolyFour.reset();
            PolyFour.addPoint(225, 10);
            PolyFour.addPoint(225, 20);
            PolyFour.addPoint(250, 55);
            PolyFour.addPoint(260, 55);
            G.fillPolygon(PolyFour);
            
                    //Kaca Jendela
            G.setColor(new Color(70, 70, 70));
            G.fillRect(219, 35, 11, 21);        
            
                    //Kusen Jendela
            G.setColor(Color.white);
            G.drawRect(218, 34, 12, 22);
            G.drawRect(218, 44, 12, 2);
            
                //Cerobong Asap
            G.setColor(new Color(225, 170, 0));
            G.fillRect(193, 10, 10, 10);       
            
                    //Peak
            G.setColor(new Color(235, 200, 0));
            G.fillRect(188, 5, 20, 5);
            
                //Jendela 2
            G.setColor(Color.yellow);
            G.fillRect(170, 28, 16, 16);                  
                
                //Polygon
            G.setColor(Color.yellow);
            PolyFour.reset();
            PolyFour.addPoint(168, 30);
            PolyFour.addPoint(188, 30);
            PolyFour.addPoint(178, 20);
            G.fillPolygon(PolyFour);
            
            G.setColor(new Color(121, 100, 119));
            PolyFour.reset();
            PolyFour.addPoint(166, 30);
            PolyFour.addPoint(170, 30);
            PolyFour.addPoint(178, 22);
            PolyFour.addPoint(178, 18);
            G.fillPolygon(PolyFour);
            
            PolyFour.reset();
            PolyFour.addPoint(178, 22);
            PolyFour.addPoint(178, 18);
            PolyFour.addPoint(188, 30);
            PolyFour.addPoint(185, 30);
            G.fillPolygon(PolyFour);
            
            G.setColor(Color.white);
            G.fillRect(172, 28, 12, 12);                 
                
            G.setColor(new Color(70, 70, 70));
            G.fillRect(173, 29, 10, 10);   
            
            //Text
            G.setColor(Color.white);
            G.setFont(new Font("Bahamas", Font.ITALIC, 64));
            G.drawString("Up", 450, 210);
            G.drawLine(490, 130, 480, 200);
            G.drawLine(470, 140, 488, 170);
            G.drawLine(515, 119, 485, 165);
            
            G.setColor(Color.red);
            G.fillOval(480, 100, 20, 30);
            
            G.setColor(Color.yellow);
            G.fillOval(460, 120, 20, 30);
            
            G.setColor(Color.green);
            G.fillOval(500, 110, 20, 30);
            
        }
}
