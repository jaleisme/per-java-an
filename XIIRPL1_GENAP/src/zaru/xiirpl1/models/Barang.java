/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaru.xiirpl1.models;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import zaru.xiirpl1.events.BarangListener;
/**
 *
 * @author Sieg
 */
public class Barang {
    
    private String id_barang;
    private String nama_barang;
    private String kategori;
    private String stock;
    private String harga_satuan;
    private BarangListener barangListener;
    private static Statement statement;
    private static ResultSet result;
    
    
     public Barang(){
        Config.RunConnection();
        statement = Config.statement;
        result = Config.result;
    }

    public String getId_barang() {
        return id_barang;
    }

    public void setId_barang(String id_barang) {
        this.id_barang = id_barang;
        fireOnChange();
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
        fireOnChange();
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
        fireOnChange();
    }

    public String getHarga_satuan() {
        return harga_satuan;
    }

    public void setHarga_satuan(String harga_satuan) {
        this.harga_satuan = harga_satuan;
        fireOnChange();
    }

    public BarangListener getBarangListener() {
        return barangListener;
    }

    public void setBarangListener(BarangListener barangListener) {
        this.barangListener = barangListener;
    }

    public void fireOnChange(){
            if(barangListener != null)
            {
                barangListener.onChange(this);
            }
        }

    public void reset() {
        setId_barang("");
        setNama_barang("");
        setStock("");
        setHarga_satuan("");
    }

    public void confirm() throws SQLException {
        try{
            String Query = "INSERT INTO barang (id_barang,nama_barang,stock,harga_satuan) VALUES ('%s','%s','%s','%s')";
            Query = String.format(Query,this.getId_barang(),this.getNama_barang(),this.getStock(),this.getHarga_satuan());
            if(!statement.execute(Query)){
                JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
                
            }else{
                JOptionPane.showMessageDialog(null, "Gagal Disimpan");
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    
}
