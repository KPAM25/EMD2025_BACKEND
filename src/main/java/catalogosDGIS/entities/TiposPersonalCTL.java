/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catalogosDGIS.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author kpam2
 */

@Entity
@Table(name = "tipos_personal_ctl")
public class TiposPersonalCTL {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_personal")
    private Integer idTipoPersonal;
    @Basic(optional = false)
    @Column(name = "valorsinba_tipo_personal")
    private Integer valorsinbaTipoPersonal;   
    @Column(name = "nombre_tipo_personal")
    private String nombreTipoPersonal; 
    @Column(name = "activo_tipo_personal")
    private Integer activoTipoPersonal;
    @Column(name = "valor_dgis")
    private Integer valorDgis;

    public TiposPersonalCTL() {
    }

    public TiposPersonalCTL(Integer idTipoPersonal, Integer valorsinbaTipoPersonal, String nombreTipoPersonal, Integer activoTipoPersonal, Integer valorDgis) {
        this.idTipoPersonal = idTipoPersonal;
        this.valorsinbaTipoPersonal = valorsinbaTipoPersonal;
        this.nombreTipoPersonal = nombreTipoPersonal;
        this.activoTipoPersonal = activoTipoPersonal;
        this.valorDgis = valorDgis;
    }

    public Integer getIdTipoPersonal() {
        return idTipoPersonal;
    }

    public void setIdTipoPersonal(Integer idTipoPersonal) {
        this.idTipoPersonal = idTipoPersonal;
    }

    public Integer getValorsinbaTipoPersonal() {
        return valorsinbaTipoPersonal;
    }

    public void setValorsinbaTipoPersonal(Integer valorsinbaTipoPersonal) {
        this.valorsinbaTipoPersonal = valorsinbaTipoPersonal;
    }

    public String getNombreTipoPersonal() {
        return nombreTipoPersonal;
    }

    public void setNombreTipoPersonal(String nombreTipoPersonal) {
        this.nombreTipoPersonal = nombreTipoPersonal;
    }

    public Integer getActivoTipoPersonal() {
        return activoTipoPersonal;
    }

    public void setActivoTipoPersonal(Integer activoTipoPersonal) {
        this.activoTipoPersonal = activoTipoPersonal;
    }

    public Integer getValorDgis() {
        return valorDgis;
    }

    public void setValorDgis(Integer valorDgis) {
        this.valorDgis = valorDgis;
    }
    
    
}
