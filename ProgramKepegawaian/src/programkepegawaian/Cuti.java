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
@Table(name = "cuti", catalog = "kepegawaian", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cuti.findAll", query = "SELECT c FROM Cuti c")
    , @NamedQuery(name = "Cuti.findByNama", query = "SELECT c FROM Cuti c WHERE c.nama = :nama")
    , @NamedQuery(name = "Cuti.findByAwalCuti", query = "SELECT c FROM Cuti c WHERE c.awalCuti = :awalCuti")
    , @NamedQuery(name = "Cuti.findByAkhirCuti", query = "SELECT c FROM Cuti c WHERE c.akhirCuti = :akhirCuti")})
public class Cuti implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "awal_cuti")
    private String awalCuti;
    @Basic(optional = false)
    @Column(name = "akhir_cuti")
    private String akhirCuti;

    public Cuti() {
    }

    public Cuti(String nama) {
        this.nama = nama;
    }

    public Cuti(String nama, String awalCuti, String akhirCuti) {
        this.nama = nama;
        this.awalCuti = awalCuti;
        this.akhirCuti = akhirCuti;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
    }

    public String getAwalCuti() {
        return awalCuti;
    }

    public void setAwalCuti(String awalCuti) {
        String oldAwalCuti = this.awalCuti;
        this.awalCuti = awalCuti;
        changeSupport.firePropertyChange("awalCuti", oldAwalCuti, awalCuti);
    }

    public String getAkhirCuti() {
        return akhirCuti;
    }

    public void setAkhirCuti(String akhirCuti) {
        String oldAkhirCuti = this.akhirCuti;
        this.akhirCuti = akhirCuti;
        changeSupport.firePropertyChange("akhirCuti", oldAkhirCuti, akhirCuti);
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
        if (!(object instanceof Cuti)) {
            return false;
        }
        Cuti other = (Cuti) object;
        if ((this.nama == null && other.nama != null) || (this.nama != null && !this.nama.equals(other.nama))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "programkepegawaian.Cuti[ nama=" + nama + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
