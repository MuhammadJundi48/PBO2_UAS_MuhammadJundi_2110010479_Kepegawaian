/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programkepegawaian;

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

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "gaji", catalog = "kepegawaian", schema = "")
@NamedQueries({
    @NamedQuery(name = "Gaji.findAll", query = "SELECT g FROM Gaji g")
    , @NamedQuery(name = "Gaji.findByNama", query = "SELECT g FROM Gaji g WHERE g.nama = :nama")
    , @NamedQuery(name = "Gaji.findByGajiPokok", query = "SELECT g FROM Gaji g WHERE g.gajiPokok = :gajiPokok")
    , @NamedQuery(name = "Gaji.findByBonus", query = "SELECT g FROM Gaji g WHERE g.bonus = :bonus")
    , @NamedQuery(name = "Gaji.findByPotongan", query = "SELECT g FROM Gaji g WHERE g.potongan = :potongan")})
public class Gaji implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "gaji_pokok")
    private String gajiPokok;
    @Basic(optional = false)
    @Column(name = "bonus")
    private String bonus;
    @Basic(optional = false)
    @Column(name = "potongan")
    private String potongan;

    public Gaji() {
    }

    public Gaji(String nama) {
        this.nama = nama;
    }

    public Gaji(String nama, String gajiPokok, String bonus, String potongan) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.bonus = bonus;
        this.potongan = potongan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
    }

    public String getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(String gajiPokok) {
        String oldGajiPokok = this.gajiPokok;
        this.gajiPokok = gajiPokok;
        changeSupport.firePropertyChange("gajiPokok", oldGajiPokok, gajiPokok);
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        String oldBonus = this.bonus;
        this.bonus = bonus;
        changeSupport.firePropertyChange("bonus", oldBonus, bonus);
    }

    public String getPotongan() {
        return potongan;
    }

    public void setPotongan(String potongan) {
        String oldPotongan = this.potongan;
        this.potongan = potongan;
        changeSupport.firePropertyChange("potongan", oldPotongan, potongan);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nama != null ? nama.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gaji)) {
            return false;
        }
        Gaji other = (Gaji) object;
        if ((this.nama == null && other.nama != null) || (this.nama != null && !this.nama.equals(other.nama))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "programkepegawaian.Gaji[ nama=" + nama + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
