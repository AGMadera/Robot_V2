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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author MBI
 */
@Entity
@Table(name = "dato3")
@NamedQueries({
    @NamedQuery(name = "Dato3.findAll", query = "SELECT d FROM Dato3 d")})
public class Dato3 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_dato3")
    private Integer idDato3;
    @Column(name = "id_accion3")
    private Integer idAccion3;
    @Column(name = "urlDescarga")
    private String urlDescarga;
    @Column(name = "urlSalida")
    private String urlSalida;
    @Column(name = "campoLogin")
    private String campoLogin;
    @Column(name = "campoPass")
    private String campoPass;

    public Dato3() {
    }

    public Dato3(Integer idDato3) {
        this.idDato3 = idDato3;
    }

    public Integer getIdDato3() {
        return idDato3;
    }

    public void setIdDato3(Integer idDato3) {
        this.idDato3 = idDato3;
    }

    public Integer getIdAccion3() {
        return idAccion3;
    }

    public void setIdAccion3(Integer idAccion3) {
        this.idAccion3 = idAccion3;
    }

    public String getUrlDescarga() {
        return urlDescarga;
    }

    public void setUrlDescarga(String urlDescarga) {
        this.urlDescarga = urlDescarga;
    }

    public String getUrlSalida() {
        return urlSalida;
    }

    public void setUrlSalida(String urlSalida) {
        this.urlSalida = urlSalida;
    }

    public String getCampoLogin() {
        return campoLogin;
    }

    public void setCampoLogin(String campoLogin) {
        this.campoLogin = campoLogin;
    }

    public String getCampoPass() {
        return campoPass;
    }

    public void setCampoPass(String campoPass) {
        this.campoPass = campoPass;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDato3 != null ? idDato3.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dato3)) {
            return false;
        }
        Dato3 other = (Dato3) object;
        if ((this.idDato3 == null && other.idDato3 != null) || (this.idDato3 != null && !this.idDato3.equals(other.idDato3))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alfonsogalvanmadera.robot_v2.Modelo.Dato3[ idDato3=" + idDato3 + " ]";
    }
    
}
