/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg;

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
@Table(name = "nivel_academico")
class NivelAcademico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "nivel_academico_id")
    private Integer nivelAcademicoId;
    @Column(name = "nombre")
    private String nombre;

    public Integer getNivelAcademicoId() {
        return nivelAcademicoId;
    }

    public void setNivelAcademicoId(Integer nivelAcademicoId) {
        this.nivelAcademicoId = nivelAcademicoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "NivelAcademico{" + "nivelAcademicoId=" + nivelAcademicoId + ", nombre=" + nombre + '}';
    }

}
