/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.entities;

import catalogos.entities.RolesCTL;
import catalogosDGIS.entities.TiposPersonalCTL;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author kpam2
 */

@Entity
@Table(name = "perfiles_tbl")
public class PerfilesTBL {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_perfil_personal")
    private Integer idPerfilPersonal;
    @Basic(optional = false)
    @JoinColumn(name = "fk_tipo_personal", referencedColumnName = "id_tipo_personal")
    @ManyToOne(optional = false)
    private TiposPersonalCTL fkTipoPersonal;   
    @Column(name = "fk_usuario_registro")
    private Integer fkUsuarioRegistro;
    @Column(name = "fecha_registro")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaRegistro;
    @Column(name = "hora_registro")
    private LocalTime horaRegistro = LocalTime.now();
    @Basic(optional = false)
    @Column(name = "activo_perfil")
    private Short activoPerfil;
    @JoinColumn(name = "fk_cedula_personal", referencedColumnName = "id_cedula_personal")
    @ManyToOne(optional = false)
    private CedulaPersonalTBL fkCedulaPersonal;
    @Column(name = "fk_personal_salud")
    private Integer fkPersonalSalud;
    @Column(name = "fk_especialidad")
    private Integer fkEspecialidad;
    @JoinColumn(name = "fk_rol", referencedColumnName = "id_rol")
    private RolesCTL fkRol;

    public PerfilesTBL() {
    }

    public PerfilesTBL(Integer idPerfilPersonal, TiposPersonalCTL fkTipoPersonal, Integer fkUsuarioRegistro, LocalDate fechaRegistro, Short activoPerfil, CedulaPersonalTBL fkCedulaPersonal, Integer fkPersonalSalud, Integer fkEspecialidad, RolesCTL fkRol) {
        this.idPerfilPersonal = idPerfilPersonal;
        this.fkTipoPersonal = fkTipoPersonal;
        this.fkUsuarioRegistro = fkUsuarioRegistro;
        this.fechaRegistro = fechaRegistro;
        this.activoPerfil = activoPerfil;
        this.fkCedulaPersonal = fkCedulaPersonal;
        this.fkPersonalSalud = fkPersonalSalud;
        this.fkEspecialidad = fkEspecialidad;
        this.fkRol = fkRol;
    }

    public Integer getIdPerfilPersonal() {
        return idPerfilPersonal;
    }

    public void setIdPerfilPersonal(Integer idPerfilPersonal) {
        this.idPerfilPersonal = idPerfilPersonal;
    }

    public TiposPersonalCTL getFkTipoPersonal() {
        return fkTipoPersonal;
    }

    public void setFkTipoPersonal(TiposPersonalCTL fkTipoPersonal) {
        this.fkTipoPersonal = fkTipoPersonal;
    }

    public Integer getFkUsuarioRegistro() {
        return fkUsuarioRegistro;
    }

    public void setFkUsuarioRegistro(Integer fkUsuarioRegistro) {
        this.fkUsuarioRegistro = fkUsuarioRegistro;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public LocalTime getHoraRegistro() {
        return horaRegistro;
    }

    public void setHoraRegistro(LocalTime horaRegistro) {
        this.horaRegistro = horaRegistro;
    }

    public Short getActivoPerfil() {
        return activoPerfil;
    }

    public void setActivoPerfil(Short activoPerfil) {
        this.activoPerfil = activoPerfil;
    }

    public CedulaPersonalTBL getFkCedulaPersonal() {
        return fkCedulaPersonal;
    }

    public void setFkCedulaPersonal(CedulaPersonalTBL fkCedulaPersonal) {
        this.fkCedulaPersonal = fkCedulaPersonal;
    }

    public Integer getFkPersonalSalud() {
        return fkPersonalSalud;
    }

    public void setFkPersonalSalud(Integer fkPersonalSalud) {
        this.fkPersonalSalud = fkPersonalSalud;
    }

    public Integer getFkEspecialidad() {
        return fkEspecialidad;
    }

    public void setFkEspecialidad(Integer fkEspecialidad) {
        this.fkEspecialidad = fkEspecialidad;
    }

    public RolesCTL getFkRol() {
        return fkRol;
    }

    public void setFkRol(RolesCTL fkRol) {
        this.fkRol = fkRol;
    }
    
    
    
    
}
