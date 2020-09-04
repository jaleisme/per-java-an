/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ikhsan.xiirpl2.models;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static ikhsan.xiirpl2.databases.Configuration.result;
import static ikhsan.xiirpl2.databases.Configuration.statement;
import ikhsan.xiirpl2.databases.Database;
import ikhsan.xiirpl2.events.Events;
import ikhsan.xiirpl2.views.Views;

public class Models {
    private String pelanggan_id;
    private String pelanggan_nama;
    private String pelanggan_ttl;
    private String pelanggan_telp;
    private String pelanggan_alamat;
    private Events events;
    
    DefaultTableModel model = new DefaultTableModel();
    
    public Models(){
        model.addColumn("ID Pelanggan");
        model.addColumn("Nama Pelanggan");
        model.addColumn("Tempat Tanggal Lahir");
        model.addColumn("No. Telp");
        model.addColumn("Alamat Pelanggan");
    }
    
    public Events getEvents(){
        return events;
    }
    
    public void setEvents(Events events){
        this.events = events;
    }
    
    protected void fireOnChange(){
        if(events != null)
        {
            events.onChange(this);
        }
    }
    
    
//______________________________________________________________________________________________________________________________________________
//______________________________________________________________________________________________________________________________________________
    
    
    public String getPelanggan_id() {
        return pelanggan_id;
    }

    public void setPelanggan_id(String pelanggan_id) {
        this.pelanggan_id = pelanggan_id;
    }

    public String getPelanggan_Nama() {
        return pelanggan_nama;
    }

    public void setPelanggan_Nama(String pelanggan_name) {
        this.pelanggan_nama = pelanggan_nama;
    }

    public String getPelanggan_Ttl() {
        return pelanggan_ttl;
    }

    public void setPelanggan_Ttl(String pelanggan_ttl) {
        this.pelanggan_ttl = pelanggan_ttl;
    }

    public String getPelanggan_Telepon() {
        return pelanggan_telp;
    }

    public void setPelanggan_Telepon(String pelanggan_telp) {
        this.pelanggan_telp = pelanggan_telp;
    }

    public String getPelanggan_Alamat() {
        return pelanggan_alamat;
    }

    public void setPelanggan_Alamat(String pelanggan_alamat) {
        this.pelanggan_alamat = pelanggan_alamat;
    }
    
//______________________________________________________________________________________________________________________________________________    
//______________________________________________________________________________________________________________________________________________
    
    public void resetValue(){
        setPelanggan_Nama("");
        setPelanggan_Ttl("");
        setPelanggan_Telepon("");
        setPelanggan_Alamat("");
    }
    
    public void saveData() throws SQLException{
        String Id = this.getPelanggan_id();
        String Nama = this.getPelanggan_Nama();
        String Ttl = this.getPelanggan_Ttl();
        String Telepon = this.getPelanggan_Telepon();
        String Alamat = this.getPelanggan_Alamat();

            String Query = "INSERT INTO konsumen (pelanggan_id , pelanggan_nama, pelanggan_ttl, pelanggan_telp, pelanggan_alamat) VALUES ('%s', '%s', '%s', '%s' ,'%s')";
            Query = String.format(Query, this.getPelanggan_id(), this.getPelanggan_Nama(), this.getPelanggan_Ttl(), this.getPelanggan_Telepon(), this.getPelanggan_Alamat());
            System.out.println(Query);
             if(!statement.execute(Query)){
                JOptionPane.showMessageDialog(null, "Pelanggan atas nama : '"+Nama+"' telah terdaftar, dengan User ID : '"+Id+"'");           
             }
             else{
                 JOptionPane.showMessageDialog(null, "Gagal Disimpan");
             }
    }
    
    
     public DefaultTableModel loadTableUser() throws SQLException{
         String Query = "SELECT * FROM konsumen";
         java.sql.Connection conn = Database.configDatabase();
         java.sql.PreparedStatement pst = conn.prepareStatement(Query);
         java.sql.ResultSet rs = pst.executeQuery();
         model.setNumRows(0);
         while(rs.next()){
            model.addRow(new Object[]{rs.getString(1), rs.getString(2),  rs.getString(3), rs.getString(4),  rs.getString(5)});
         }
         return model;
    }    

}
