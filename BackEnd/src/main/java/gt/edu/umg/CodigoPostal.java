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
@Table(name = "codigo_postal")
public class CodigoPostal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_postal_id")
    private Integer codPostalId;
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "municipio")
    private Municipio municipioId;

    public Integer getCodPostalId() {
        return codPostalId;
    }

    public void setCodPostalId(Integer codPostalId) {
        this.codPostalId = codPostalId;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Municipio getMunicipioId() {
        return municipioId;
    }

    public void setMunicipioId(Municipio municipioId) {
        this.municipioId = municipioId;
    }

    @Override
    public String toString() {
        return "CodigoPostal{" + "codPostalId=" + codPostalId + ", codigo=" + codigo + ", municipioId=" + municipioId + '}';
    }

}
