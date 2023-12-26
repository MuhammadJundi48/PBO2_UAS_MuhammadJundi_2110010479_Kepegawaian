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
@Table(name = "identitas", catalog = "kepegawaian", schema = "")
@NamedQueries({
    @NamedQuery(name = "Identitas.findAll", query = "SELECT i FROM Identitas i")
    , @NamedQuery(name = "Identitas.findById", query = "SELECT i FROM Identitas i WHERE i.id = :id")
    , @NamedQuery(name = "Identitas.findByNama", query = "SELECT i FROM Identitas i WHERE i.nama = :nama")
    , @NamedQuery(name = "Identitas.findByJenisKelamin", query = "SELECT i FROM Identitas i WHERE i.jenisKelamin = :jenisKelamin")
    , @NamedQuery(name = "Identitas.findByAgama", query = "SELECT i FROM Identitas i WHERE i.agama = :agama")
    , @NamedQuery(name = "Identitas.findByAlamat", query = "SELECT i FROM Identitas i WHERE i.alamat = :alamat")})
public class Identitas implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
    @Basic(optional = false)
    @Column(name = "agama")
    private String agama;
    @Basic(optional = false)
    @Column(name = "alamat")
    private String alamat;

    public Identitas() {
    }

    public Identitas(String id) {
        this.id = id;
    }

    public Identitas(String id, String nama, String jenisKelamin, String agama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.agama = agama;
        this.alamat = alamat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        String oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        String oldJenisKelamin = this.jenisKelamin;
        this.jenisKelamin = jenisKelamin;
        changeSupport.firePropertyChange("jenisKelamin", oldJenisKelamin, jenisKelamin);
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        String oldAgama = this.agama;
        this.agama = agama;
        changeSupport.firePropertyChange("agama", oldAgama, agama);
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        String oldAlamat = this.alamat;
        this.alamat = alamat;
        changeSupport.firePropertyChange("alamat", oldAlamat, alamat);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Identitas)) {
            return false;
        }
        Identitas other = (Identitas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "programkepegawaian.Identitas[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
