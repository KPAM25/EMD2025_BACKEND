/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author kpam2
 */

@Entity
@Table(name = "personal_salud_tbl", schema = "adminEmd")
public class PersonalSaludTBL {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_personal")
    private Integer idPersonalSalud;
    @Column(name = "fk_persona")
    private Integer fkPersona;
    @Column(name = "rfc_personal_salud")
    private String rfcPersonalSalud;
    @Column(name = "matricula")
    private String matricula;
    @Basic(optional = false)
    @Column(name = "activo_personal")
    private Short activoPersonal;
    @Column(name = "fk_usuario_registro")
    private Integer fkUsuarioRegistro;
    @Column(name = "fecha_registro")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaRegistro;
     @Basic(optional = false)
    @Column(name = "hora_resgistro")
    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime horaResgistro;

    public PersonalSaludTBL() {
    }

    public PersonalSaludTBL(Integer idPersonalSalud, Integer fkPersona, String rfcPersonalSalud, String matricula, Short activoPersonal, Integer fkUsuarioRegistro, LocalDate fechaRegistro, LocalTime horaResgistro) {
        this.idPersonalSalud = idPersonalSalud;
        this.fkPersona = fkPersona;
        this.rfcPersonalSalud = rfcPersonalSalud;
        this.matricula = matricula;
        this.activoPersonal = activoPersonal;
        this.fkUsuarioRegistro = fkUsuarioRegistro;
        this.fechaRegistro = fechaRegistro;
        this.horaResgistro = horaResgistro;
    }

    public Integer getIdPersonalSalud() {
        return idPersonalSalud;
    }

    public void setIdPersonalSalud(Integer idPersonalSalud) {
        this.idPersonalSalud = idPersonalSalud;
    }

    public Integer getFkPersona() {
        return fkPersona;
    }

    public void setFkPersona(Integer fkPersona) {
        this.fkPersona = fkPersona;
    }

    public String getRfcPersonalSalud() {
        return rfcPersonalSalud;
    }

    public void setRfcPersonalSalud(String rfcPersonalSalud) {
        this.rfcPersonalSalud = rfcPersonalSalud;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Short getActivoPersonal() {
        return activoPersonal;
    }

    public void setActivoPersonal(Short activoPersonal) {
        this.activoPersonal = activoPersonal;
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

    public LocalTime getHoraResgistro() {
        return horaResgistro;
    }

    public void setHoraResgistro(LocalTime horaResgistro) {
        this.horaResgistro = horaResgistro;
    }
     
     
}
