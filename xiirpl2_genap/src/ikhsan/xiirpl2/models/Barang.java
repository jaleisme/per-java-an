/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ikhsan.xiirpl2.models;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author FAIZAL
 */
@Entity
@Table(name = "barang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Barang.findAll", query = "SELECT b FROM Barang b")
    , @NamedQuery(name = "Barang.findByBarangId", query = "SELECT b FROM Barang b WHERE b.barangId = :barangId")
    , @NamedQuery(name = "Barang.findByBarangNama", query = "SELECT b FROM Barang b WHERE b.barangNama = :barangNama")
    , @NamedQuery(name = "Barang.findByBarangStok", query = "SELECT b FROM Barang b WHERE b.barangStok = :barangStok")
    , @NamedQuery(name = "Barang.findByBarangHarga", query = "SELECT b FROM Barang b WHERE b.barangHarga = :barangHarga")})
public class Barang implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "barang_id")
    private String barangId;
    @Basic(optional = false)
    @Column(name = "barang_nama")
    private String barangNama;
    @Basic(optional = false)
    @Column(name = "barang_stok")
    private int barangStok;
    @Basic(optional = false)
    @Column(name = "barang_harga")
    private String barangHarga;

    public Barang() {
    }

    public Barang(String barangId) {
        this.barangId = barangId;
    }

    public Barang(String barangId, String barangNama, int barangStok, String barangHarga) {
        this.barangId = barangId;
        this.barangNama = barangNama;
        this.barangStok = barangStok;
        this.barangHarga = barangHarga;
    }

    public String getBarangId() {
        return barangId;
    }

    public void setBarangId(String barangId) {
        String oldBarangId = this.barangId;
        this.barangId = barangId;
        changeSupport.firePropertyChange("barangId", oldBarangId, barangId);
    }

    public String getBarangNama() {
        return barangNama;
    }

    public void setBarangNama(String barangNama) {
        String oldBarangNama = this.barangNama;
        this.barangNama = barangNama;
        changeSupport.firePropertyChange("barangNama", oldBarangNama, barangNama);
    }

    public int getBarangStok() {
        return barangStok;
    }

    public void setBarangStok(int barangStok) {
        int oldBarangStok = this.barangStok;
        this.barangStok = barangStok;
        changeSupport.firePropertyChange("barangStok", oldBarangStok, barangStok);
    }

    public String getBarangHarga() {
        return barangHarga;
    }

    public void setBarangHarga(String barangHarga) {
        String oldBarangHarga = this.barangHarga;
        this.barangHarga = barangHarga;
        changeSupport.firePropertyChange("barangHarga", oldBarangHarga, barangHarga);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (barangId != null ? barangId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Barang)) {
            return false;
        }
        Barang other = (Barang) object;
        if ((this.barangId == null && other.barangId != null) || (this.barangId != null && !this.barangId.equals(other.barangId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ikhsan.xiirpl2.models.Barang[ barangId=" + barangId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
