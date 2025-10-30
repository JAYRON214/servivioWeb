/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class EducacionDetalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    // Asocia este atributo con la columna "educacion_detalle_id" en la base de datos
    @Column(name = "educacion_detalle_id")
    // Campo que representa el ID del registro en la tabla (clave primaria)
    private Integer educacionDetalleId;

    @Column(name = "centro_educativo")
    private String centroEducativo;

    @Column(name = "fecha_inicio")
    private Date fechaInicio;

    @Column(name = "fecha_fin")
    private Date fechaFin;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "nivel_estudio")
    private String nivelEstudio;
    
    @Column(name = "educacion id")
    private educacion educacionId;

    public Integer getEducacionDetalleId() {
        return educacionDetalleId;
    }

    public void setEducacionDetalleId(Integer educacionDetalleId) {
        this.educacionDetalleId = educacionDetalleId;
    }

    public String getCentroEducativo() {
        return centroEducativo;
    }

    public void setCentroEducativo(String centroEducativo) {
        this.centroEducativo = centroEducativo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public educacion getEducacionId() {
        return educacionId;
    }

    public void setEducacionId(educacion educacionId) {
        this.educacionId = educacionId;
    }

    @Override
    public String toString() {
        return "EducacionDetalle{" + "educacionDetalleId=" + educacionDetalleId + ", centroEducativo=" + centroEducativo + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", titulo=" + titulo + ", nivelEstudio=" + nivelEstudio + ", educacionId=" + educacionId + '}';
    }

}
