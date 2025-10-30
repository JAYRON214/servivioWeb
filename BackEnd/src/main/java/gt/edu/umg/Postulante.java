/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg;

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
@Table(name = "postulante")

public class Postulante {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postulante_id;
     
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "dpi")
    private String dpi;
    @Column(name = "nit")
    private String nit;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "telefono adicional")
    private String telefono_adicional;
    @Column(name = "nacionalidad")
    private String nacionalidad;
    @Column(name = "usuario id")
    private int usuario_id;
    @Column(name = "genero id")
    private int genero_id;
    @Column(name = "cod postal id")
    private int cod_postal_id;

    public Long getPostulante_id() {
        return postulante_id;
    }

    public void setPostulante_id(Long postulante_id) {
        this.postulante_id = postulante_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono_adicional() {
        return telefono_adicional;
    }

    public void setTelefono_adicional(String telefono_adicional) {
        this.telefono_adicional = telefono_adicional;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public int getGenero_id() {
        return genero_id;
    }

    public void setGenero_id(int genero_id) {
        this.genero_id = genero_id;
    }

    public int getCod_postal_id() {
        return cod_postal_id;
    }

    public void setCod_postal_id(int cod_postal_id) {
        this.cod_postal_id = cod_postal_id;
    }

    @Override
    public String toString() {
        return "Postulante{" + "postulante_id=" + postulante_id + ", nombre=" + nombre + ", apellido=" + apellido + ", dpi=" + dpi + ", nit=" + nit + ", telefono=" + telefono + ", telefono_adicional=" + telefono_adicional + ", nacionalidad=" + nacionalidad + ", usuario_id=" + usuario_id + ", genero_id=" + genero_id + ", cod_postal_id=" + cod_postal_id + '}';
    }

    
}
