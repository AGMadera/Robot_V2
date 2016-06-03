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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author MBI
 */
@Entity
@Table(name = "cliente3")
@NamedQueries({
    @NamedQuery(name = "Cliente3.findAll", query = "SELECT c FROM Cliente3 c")})
public class Cliente3 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_cliente3")
    private Integer idCliente3;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "pass")
    private String pass;
    @OneToMany(mappedBy = "idCliente3")
    private Collection<Cadena3> cadena3Collection;

    public Cliente3() {
    }

    public Cliente3(Integer idCliente3) {
        this.idCliente3 = idCliente3;
    }

    public Integer getIdCliente3() {
        return idCliente3;
    }

    public void setIdCliente3(Integer idCliente3) {
        this.idCliente3 = idCliente3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Collection<Cadena3> getCadena3Collection() {
        return cadena3Collection;
    }

    public void setCadena3Collection(Collection<Cadena3> cadena3Collection) {
        this.cadena3Collection = cadena3Collection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente3 != null ? idCliente3.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente3)) {
            return false;
        }
        Cliente3 other = (Cliente3) object;
        if ((this.idCliente3 == null && other.idCliente3 != null) || (this.idCliente3 != null && !this.idCliente3.equals(other.idCliente3))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alfonsogalvanmadera.robot_v2.Modelo.Cliente3[ idCliente3=" + idCliente3 + " ]";
    }
    
}
