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
@Table(name = "especialidad_ctl", schema = "catalogosDgis")
public class EspecialidadesCTL {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_especialidad")
    private Integer idEspecialidad;
    @Basic(optional = false)
    @Column(name = "nombre_especialidad")
    private String especialidad;   
    @Column(name = "activo_especialidad")
    private Integer activoEspecialidad;
    @Column(name = "valor_esvalor_keypecialidad")
    private Integer valorEspecialidad;
    @Column(name = "activo_especialidad_unidad")
    private Integer activoUnidad;

    public EspecialidadesCTL() {
    }

    public EspecialidadesCTL(Integer idEspecialidad, String especialidad, Integer activoEspecialidad, Integer valorEspecialidad, Integer activoUnidad) {
        this.idEspecialidad = idEspecialidad;
        this.especialidad = especialidad;
        this.activoEspecialidad = activoEspecialidad;
        this.valorEspecialidad = valorEspecialidad;
        this.activoUnidad = activoUnidad;
    }

    public Integer getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(Integer idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getActivoEspecialidad() {
        return activoEspecialidad;
    }

    public void setActivoEspecialidad(Integer activoEspecialidad) {
        this.activoEspecialidad = activoEspecialidad;
    }

    public Integer getValorEspecialidad() {
        return valorEspecialidad;
    }

    public void setValorEspecialidad(Integer valorEspecialidad) {
        this.valorEspecialidad = valorEspecialidad;
    }

    public Integer getActivoUnidad() {
        return activoUnidad;
    }

    public void setActivoUnidad(Integer activoUnidad) {
        this.activoUnidad = activoUnidad;
    }
    
    
}
