/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catalogos.entities;

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
@Table(name = "roles_ctl", schema = "catalogos")
public class RolesCTL {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_rol")
    private Long idRol;
    @Basic(optional = false)
    @Column(name = "nombre_rol")
    private String nombreRol; //PersonalSaludTbl fkTipoPersonal;    
    @Column(name = "activo_rol")
    private Integer activoRol;

    public RolesCTL() {
    }

    public RolesCTL(Long idRol, String nombreRol, Integer activoRol) {
        this.idRol = idRol;
        this.nombreRol = nombreRol;
        this.activoRol = activoRol;
    }

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public Integer getActivoRol() {
        return activoRol;
    }

    public void setActivoRol(Integer activoRol) {
        this.activoRol = activoRol;
    }
    
    
}
