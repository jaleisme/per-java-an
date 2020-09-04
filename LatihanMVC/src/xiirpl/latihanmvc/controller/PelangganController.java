/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xiirpl.latihanmvc.controller;

import javax.swing.JOptionPane;
import xiirpl.latihanmvc.model.PelangganModel;
import xiirpl.latihanmvc.view.PelangganView;
/**
 *
 * @author hajjah
 */
public class PelangganController {
    
    private PelangganModel model;
    
    public void setModel(PelangganModel model){
        this.model = model;
    }
    
    public void resetForm(PelangganView view){
        String nama = view.getTxtnama().getText();
        String email = view.getTxtemail().getText();
        String noTlp = view.getTxttlp().getText();
        
        if(nama.equals("")&& email.equals("")&& noTlp.equals("")){
            
        }else{
            model.resetForm();
        }
    }
    
    public void simpanForm(PelangganView view){
        String nama = view.getTxtnama().getText();
        String email = view.getTxtemail().getText();
        String noTlp = view.getTxttlp().getText();
        
        if(nama.trim().equals("")){
            JOptionPane.showMessageDialog(view,"Nama Kosong!");
        }else if(email.trim().equals("")){
            JOptionPane.showMessageDialog(view,"Email Kosong!");
        }else if(noTlp.trim().equals("")){
            JOptionPane.showMessageDialog(view,"No Telepon Kosong!");
        }else{
            model.simpanForm();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        PelangganView pv = new PelangganView();
        pv.setVisible(true);
    }

}
