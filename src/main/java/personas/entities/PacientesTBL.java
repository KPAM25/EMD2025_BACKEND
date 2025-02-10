/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author kpam2
 */

@Entity
@Table(name = "pacientes_tbl")
public class PacientesTBL {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_paciente")
    private Integer idPaciente;
    @Basic(optional = false)
    @Column(name = "expediente_fisico_paciente")
    private String expedienteFisicoPaciente;
    @Basic(optional = false)
    @Column(name = "gratuida")
    private Integer gratuida;
    @Basic(optional = false)
    @Column(name = "activo_paciente")
    private Short activoPaciente;
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
    @JoinColumn(name = "fk_persona", referencedColumnName = "id_persona")
    @OneToOne(optional = false)
    private PersonasTBL fkPersona;

    public PacientesTBL() {
    }

    public PacientesTBL(Integer idPaciente, String expedienteFisicoPaciente, Integer gratuida, Short activoPaciente, LocalDate fechaRegistro, LocalTime horaResgistro, Integer fkUsuarioRegistro, PersonasTBL fkPersona) {
        this.idPaciente = idPaciente;
        this.expedienteFisicoPaciente = expedienteFisicoPaciente;
        this.gratuida = gratuida;
        this.activoPaciente = activoPaciente;
        this.fechaRegistro = fechaRegistro;
        this.horaResgistro = horaResgistro;
        this.fkUsuarioRegistro = fkUsuarioRegistro;
        this.fkPersona = fkPersona;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getExpedienteFisicoPaciente() {
        return expedienteFisicoPaciente;
    }

    public void setExpedienteFisicoPaciente(String expedienteFisicoPaciente) {
        this.expedienteFisicoPaciente = expedienteFisicoPaciente;
    }

    public Integer getGratuida() {
        return gratuida;
    }

    public void setGratuida(Integer gratuida) {
        this.gratuida = gratuida;
    }

    public Short getActivoPaciente() {
        return activoPaciente;
    }

    public void setActivoPaciente(Short activoPaciente) {
        this.activoPaciente = activoPaciente;
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

    public PersonasTBL getFkPersona() {
        return fkPersona;
    }

    public void setFkPersona(PersonasTBL fkPersona) {
        this.fkPersona = fkPersona;
    }
    
    
}
