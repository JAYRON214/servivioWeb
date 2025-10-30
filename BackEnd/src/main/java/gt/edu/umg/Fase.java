/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jayron
 */
@Entity
@Table(name = "fase")
public class Fase implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "fase_id")
    private Integer faseId;
    @Basic(optional = false)
    @Column(name = "nombre_fase")
    private String nombreFase;
    @OneToMany(mappedBy = "faseId")
    private List<Proceso> procesoList;

    public Fase() {
    }

    public Fase(Integer faseId) {
        this.faseId = faseId;
    }

    public Fase(Integer faseId, String nombreFase) {
        this.faseId = faseId;
        this.nombreFase = nombreFase;
    }

    public Integer getFaseId() {
        return faseId;
    }

    public void setFaseId(Integer faseId) {
        this.faseId = faseId;
    }

    public String getNombreFase() {
        return nombreFase;
    }

    public void setNombreFase(String nombreFase) {
        this.nombreFase = nombreFase;
    }

    public List<Proceso> getProcesoList() {
        return procesoList;
    }

    public void setProcesoList(List<Proceso> procesoList) {
        this.procesoList = procesoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (faseId != null ? faseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fase)) {
            return false;
        }
        Fase other = (Fase) object;
        if ((this.faseId == null && other.faseId != null) || (this.faseId != null && !this.faseId.equals(other.faseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.people.com.Models.Fase[ faseId=" + faseId + " ]";
    }
    
}
