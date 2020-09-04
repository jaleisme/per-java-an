/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ikhsan.xiirpl2.controllers;


import java.sql.SQLException;
import java.util.Random;
import javax.swing.JOptionPane;
import ikhsan.xiirpl2.models.Models;
import ikhsan.xiirpl2.views.Views;

/**
 *
 * @author FAIZAL
 */
public class Controllers {
    private Models model;

    public void setModel(Models model) {
        this.model = model;
    }
    
    public void resetForm(Views view){
        String Nama = view.getNama().getText();
        String Ttl= view.getTtl().toString();
        String Telepon = view.getTelp().toString();
        String Alamat = view.getAlamat().getText();
        
        if(Nama.equals("") && Ttl.equals("") && Telepon.equals("") && Alamat.equals("")){
            JOptionPane.showMessageDialog(view, "KOSONG!");
        }
        else{
            model.resetValue();
        }   
    }

    public void saveData(Views view) throws SQLException{
        String Id = this.generatePelangganId();
        String Nama    = view.getNama().getText();
        String Ttl          = view.getTtl().getText();
        String Telepon       = view.getTelp().getText();
        String Alamat = view.getAlamat().getText();
        
        if(Nama.trim().equals("")){
            JOptionPane.showMessageDialog(view,"Nama Kosong!");   
        }else if(Ttl.trim().equals("")){
            JOptionPane.showMessageDialog(view,"Tanggal Lahir Kosong!");
        }else if(Telepon.trim().equals("")){
            JOptionPane.showMessageDialog(view,"No Telepon Kosong!");
        }else if(Alamat.trim().equals("")){
            JOptionPane.showMessageDialog(view,"Alamat Kosong!");
        }else{
        model.setPelanggan_id(Id);
        model.setPelanggan_Nama(Nama.trim());
        model.setPelanggan_Ttl(Ttl);
        model.setPelanggan_Telepon(Telepon);
        model.setPelanggan_Alamat(Alamat);
        model.saveData();
        model.loadTableUser();
        }
    }    
    
    public String generatePelangganId(){
        String aChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder ast = new StringBuilder();
        Random ran = new Random();
        while(ast.length() < 6){
            int index = (int) (ran.nextFloat() * aChars.length());
            ast.append(aChars.charAt(index));
        }
        String astr = ast.toString();
        return astr;
    }    
    
}
