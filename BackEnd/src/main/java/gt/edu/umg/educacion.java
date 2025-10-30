/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author jayron
 */
@Entity
@Table(name = "educacion")
public class educacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "educacion_id")
    private Integer educacionId;
    @Column(name = "nivel academico")
    private NivelAcademico nivelAcademicoId;
    @Column(name = "postulante")
    private Postulante postulanteId;

    public Integer getEducacionId() {
        return educacionId;
    }

    public void setEducacionId(Integer educacionId) {
        this.educacionId = educacionId;
    }

    public NivelAcademico getNivelAcademicoId() {
        return nivelAcademicoId;
    }

    public void setNivelAcademicoId(NivelAcademico nivelAcademicoId) {
        this.nivelAcademicoId = nivelAcademicoId;
    }

    public Postulante getPostulanteId() {
        return postulanteId;
    }

    public void setPostulanteId(Postulante postulanteId) {
        this.postulanteId = postulanteId;
    }

    @Override
    public String toString() {
        return "Educacion{" + "educacionId=" + educacionId + ", nivelAcademicoId=" + nivelAcademicoId + ", postulanteId=" + postulanteId + '}';
    }
    

}
