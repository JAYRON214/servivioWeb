/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jayron
 */
@Entity
@Table(name = "experiencia_detalle")
public class experienciaDetalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "experiencia_detalle_id")
    private Integer experienciaDetalleId;
    @Basic(optional = false)
    @Column(name = "empresa")
    private String empresa;

    @Column(name = "cargo")
    private String cargo;
    @Lob
    @Column(name = "funcion")
    private String funcion;

    private Date fechaInicio;
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @JoinColumn(name = "experiencia_id", referencedColumnName = "experiencia_id")
    @ManyToOne
    private Experiencia experienciaId;

    public Integer getExperienciaDetalleId() {
        return experienciaDetalleId;
    }

    public void setExperienciaDetalleId(Integer experienciaDetalleId) {
        this.experienciaDetalleId = experienciaDetalleId;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
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

    public Experiencia getExperienciaId() {
        return experienciaId;
    }

    public void setExperienciaId(Experiencia experienciaId) {
        this.experienciaId = experienciaId;
    }

    @Override
    public String toString() {
        return "experienciaDetalle{" + "experienciaDetalleId=" + experienciaDetalleId + ", empresa=" + empresa + ", cargo=" + cargo + ", funcion=" + funcion + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", experienciaId=" + experienciaId + '}';
    }

}
