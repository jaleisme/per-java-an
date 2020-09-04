/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaru.xiirpl1.controllers;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import zaru.xiirpl1.models.Barang;
import zaru.xiirpl1.views.InputBarang;
import zaru.xiirpl1.models.Config;


/**
 *
 * @author Zaru
 */
public class BarangController {
  private Barang model;
  public void setModel(Barang model){
      this.model = model;
  }
   
  public void reset(InputBarang view){
      String id_barang = view.getId_barang().getText();
      String nama_barang = view.getNama_barang().getText();
      String stock = view.getStock().getText();
      String harga_satuan = view.getHarga_satuan().getText();
      
       if(id_barang.equals("") && nama_barang.equals("") && stock.equals("") && harga_satuan.equals("")){
            
        }else{
            model.reset();
            model.setId_barang("");
            model.setNama_barang("");
            model.setStock("");
            model.setHarga_satuan("");
            
        }
    }
     
  public void confirm(InputBarang view) throws SQLException {
      
      String id_barang = view.getId_barang().getText();
      String nama_barang = view.getNama_barang().getText();
      String stock = view.getStock().getText();
      String harga_satuan = view.getHarga_satuan().getText();
      
       if(id_barang.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Field Masih kosong!");
        } else if(nama_barang.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Field Masih kosong!");
        } else if(stock.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Field Masih kosong!");
        } else if(harga_satuan.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Field Masih kosong!");
        } else {
            model.setId_barang(id_barang);
            model.setNama_barang(nama_barang);
            model.setStock(stock);
            model.setHarga_satuan(harga_satuan);
            model.confirm();
        }
    }
  
}