/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author kpam2
 */

@Entity
@Table(name = "cedula_personal_tbl")
public class CedulaPersonalTBL {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cedula_personal")
    private Integer idCedulaPersonal;
    @Basic(optional = false)
    @Column(name = "cedula_profesional")
    private String cedulaProfesional;
    @Basic(optional = false)
    @Column(name = "institucion_formativa")
    private String institucionFormativa;
    @Basic(optional = false)
    @Column(name = "extranjera")
    private boolean extranjera;
    @Basic(optional = false)
    @Column(name = "fecha_registro")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaRegistro;
    @Basic(optional = false)
    @Column(name = "hora_resgistro")
    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime horaResgistro;
    @Basic(optional = false)
    @Column(name = "fk_usuario_registro")
    private Integer fkUsuarioRegistro;
    @Basic(optional = false)
    @Column(name = "activo_cedula")
    private Short activoCedula;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "fk_personal_salud", referencedColumnName = "id_personal_salud")
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    private PersonalSaludTBL fkPersonalSalud;

    public CedulaPersonalTBL() {
    }

    public CedulaPersonalTBL(Integer idCedulaPersonal, String cedulaProfesional, String institucionFormativa, boolean extranjera, LocalDate fechaRegistro, LocalTime horaResgistro, Integer fkUsuarioRegistro, Short activoCedula, PersonalSaludTBL fkPersonalSalud) {
        this.idCedulaPersonal = idCedulaPersonal;
        this.cedulaProfesional = cedulaProfesional;
        this.institucionFormativa = institucionFormativa;
        this.extranjera = extranjera;
        this.fechaRegistro = fechaRegistro;
        this.horaResgistro = horaResgistro;
        this.fkUsuarioRegistro = fkUsuarioRegistro;
        this.activoCedula = activoCedula;
        this.fkPersonalSalud = fkPersonalSalud;
    }

    public Integer getIdCedulaPersonal() {
        return idCedulaPersonal;
    }

    public void setIdCedulaPersonal(Integer idCedulaPersonal) {
        this.idCedulaPersonal = idCedulaPersonal;
    }

    public String getCedulaProfesional() {
        return cedulaProfesional;
    }

    public void setCedulaProfesional(String cedulaProfesional) {
        this.cedulaProfesional = cedulaProfesional;
    }

    public String getInstitucionFormativa() {
        return institucionFormativa;
    }

    public void setInstitucionFormativa(String institucionFormativa) {
        this.institucionFormativa = institucionFormativa;
    }

    public boolean isExtranjera() {
        return extranjera;
    }

    public void setExtranjera(boolean extranjera) {
        this.extranjera = extranjera;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public LocalTime getHoraResgistro() {
        return horaResgistro;
    }

    public void setHoraResgistro(LocalTime horaResgistro) {
        this.horaResgistro = horaResgistro;
    }

    public Integer getFkUsuarioRegistro() {
        return fkUsuarioRegistro;
    }

    public void setFkUsuarioRegistro(Integer fkUsuarioRegistro) {
        this.fkUsuarioRegistro = fkUsuarioRegistro;
    }

    public Short getActivoCedula() {
        return activoCedula;
    }

    public void setActivoCedula(Short activoCedula) {
        this.activoCedula = activoCedula;
    }

    public PersonalSaludTBL getFkPersonalSalud() {
        return fkPersonalSalud;
    }

    public void setFkPersonalSalud(PersonalSaludTBL fkPersonalSalud) {
        this.fkPersonalSalud = fkPersonalSalud;
    }
    
    
}
