/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfonsogalvanmadera.robot_v2.Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author MBI
 */
@Entity
@Table(name = "accion3")
@NamedQueries({
    @NamedQuery(name = "Accion3.findAll", query = "SELECT a FROM Accion3 a")})
public class Accion3 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_accion3")
    private Integer idAccion3;
    @Column(name = "tipoElemento")
    private String tipoElemento;
    @Column(name = "accion")
    private String accion;
    @Column(name = "orden")
    private Integer orden;
    @Column(name = "tiempo")
    private Integer tiempo;
    @JoinColumn(name = "id_cadena3", referencedColumnName = "id_cadena3")
    @ManyToOne
    private Cadena3 idCadena3;

    public Accion3() {
    }

    public Accion3(Integer idAccion3) {
        this.idAccion3 = idAccion3;
    }

    public Integer getIdAccion3() {
        return idAccion3;
    }

    public void setIdAccion3(Integer idAccion3) {
        this.idAccion3 = idAccion3;
    }

    public String getTipoElemento() {
        return tipoElemento;
    }

    public void setTipoElemento(String tipoElemento) {
        this.tipoElemento = tipoElemento;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    public Cadena3 getIdCadena3() {
        return idCadena3;
    }

    public void setIdCadena3(Cadena3 idCadena3) {
        this.idCadena3 = idCadena3;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAccion3 != null ? idAccion3.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accion3)) {
            return false;
        }
        Accion3 other = (Accion3) object;
        if ((this.idAccion3 == null && other.idAccion3 != null) || (this.idAccion3 != null && !this.idAccion3.equals(other.idAccion3))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alfonsogalvanmadera.robot_v2.Modelo.Accion3[ idAccion3=" + idAccion3 + " ]";
    }
    
}
