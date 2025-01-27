/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.entities;

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
@Table(name = "horarios_tbl")
public class HorariosTBL {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_horario_atencion")
    private Integer idHorarioAtencion;
    @Basic(optional = false)
    @JoinColumn(name = "fk_perfil", referencedColumnName = "id_perfil_personal")
    @ManyToOne(optional = false)
    private PerfilesTBL fkPerfil;   
    @Column(name = "dia_semana")
    private Integer diaSemana;
    @Column(name = "hora_inicio")
    private LocalTime horaInicio;
    @Column(name = "hora_termino")
    private LocalTime horaTermino;
    @Basic(optional = false)
    @Column(name = "activo_horario_atencion")
    private Integer activoHorarioAtencion;
    @Column(name = "fk_usuario_registro")
    private Integer fkUsuarioRegistro;
     @Column(name = "fecha_registro")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaRegistro;
    @Column(name = "hora_registro")
    private LocalTime horaRegistro = LocalTime.now();

    public HorariosTBL() {
    }

    public HorariosTBL(Integer idHorarioAtencion, PerfilesTBL fkPerfil, Integer diaSemana, LocalTime horaInicio, LocalTime horaTermino, Integer activoHorarioAtencion, Integer fkUsuarioRegistro, LocalDate fechaRegistro) {
        this.idHorarioAtencion = idHorarioAtencion;
        this.fkPerfil = fkPerfil;
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.activoHorarioAtencion = activoHorarioAtencion;
        this.fkUsuarioRegistro = fkUsuarioRegistro;
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getIdHorarioAtencion() {
        return idHorarioAtencion;
    }

    public void setIdHorarioAtencion(Integer idHorarioAtencion) {
        this.idHorarioAtencion = idHorarioAtencion;
    }

    public PerfilesTBL getFkPerfil() {
        return fkPerfil;
    }

    public void setFkPerfil(PerfilesTBL fkPerfil) {
        this.fkPerfil = fkPerfil;
    }

    public Integer getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(Integer diaSemana) {
        this.diaSemana = diaSemana;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(LocalTime horaTermino) {
        this.horaTermino = horaTermino;
    }

    public Integer getActivoHorarioAtencion() {
        return activoHorarioAtencion;
    }

    public void setActivoHorarioAtencion(Integer activoHorarioAtencion) {
        this.activoHorarioAtencion = activoHorarioAtencion;
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
    
    
}
