/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfonsogalvanmadera.robot_v2.Modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author MBI
 */
@Entity
@Table(name = "cadena3")
@NamedQueries({
    @NamedQuery(name = "Cadena3.findAll", query = "SELECT c FROM Cadena3 c")})
public class Cadena3 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_cadena3")
    private Integer idCadena3;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "url")
    private String url;
    @OneToMany(mappedBy = "idCadena3")
    private Collection<Accion3> accion3Collection;
    @JoinColumn(name = "id_cliente3", referencedColumnName = "id_cliente3")
    @ManyToOne
    private Cliente3 idCliente3;

    public Cadena3() {
    }

    public Cadena3(Integer idCadena3) {
        this.idCadena3 = idCadena3;
    }

    public Integer getIdCadena3() {
        return idCadena3;
    }

    public void setIdCadena3(Integer idCadena3) {
        this.idCadena3 = idCadena3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Collection<Accion3> getAccion3Collection() {
        return accion3Collection;
    }

    public void setAccion3Collection(Collection<Accion3> accion3Collection) {
        this.accion3Collection = accion3Collection;
    }

    public Cliente3 getIdCliente3() {
        return idCliente3;
    }

    public void setIdCliente3(Cliente3 idCliente3) {
        this.idCliente3 = idCliente3;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCadena3 != null ? idCadena3.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cadena3)) {
            return false;
        }
        Cadena3 other = (Cadena3) object;
        if ((this.idCadena3 == null && other.idCadena3 != null) || (this.idCadena3 != null && !this.idCadena3.equals(other.idCadena3))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alfonsogalvanmadera.robot_v2.Modelo.Cadena3[ idCadena3=" + idCadena3 + " ]";
    }
    
}
