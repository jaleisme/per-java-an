/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Up;

import Exterior.ExteriorPanel;
import jaco.mp3.player.MP3Player;
import java.awt.Color;
import java.io.File;
import javax.swing.JFrame;

/**
 *
 * @author FAIZAL
 */
public class CarlHouse {
        public static final String Song = "C:\\Users\\FAIZAL\\Downloads\\y2mate.com - married_life_up_piano_saddest_version_56vXdQl4Qaw.mp3";
        
        public static void main(String[] args){
        MP3Player mp3player = new MP3Player(new File(Song));
        JFrame MyFrame = new JFrame("Carl Fredrickson's House");
        MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mp3player.play();
        
        //Panel
        CarlHousePanel MyPanel = new CarlHousePanel();
        MyPanel.setBackground(Color.white);
        MyFrame.add(MyPanel);
        MyFrame.setSize(700, 500);
        MyFrame.setVisible(true);
    }
}
