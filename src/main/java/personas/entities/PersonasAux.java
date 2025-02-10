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
@Table(name = "personas_aux")
public class PersonasAux {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_persona_aux")
    private Integer idPersonaAux;
    @Basic(optional = false)
    @Column(name = "es_migrante_paciente")
    private Integer esMigrantePaciente;
    @Basic(optional = false)
    @Column(name = "es_afromexicano_paciente")
    private Short esAfromexicanoPaciente;
    @Basic(optional = false)
    @Column(name = "es_indigena_paciente")
    private Short esIndigenaPaciente;
    @Column(name = "es_desconocido")
    private Boolean esDesconocido;
    @Basic(optional = false)
    @Column(name = "sabe_leer")
    private Integer sabeLeer;
    @Basic(optional = false)
    @Column(name = "es_nacio_hospital")
    private Integer esNacioHospital;
    @Basic(optional = false)
    @Column(name = "es_escolaridad_completa")
    private boolean esEscolaridadCompleta;
    @Basic(optional = false)
    @Column(name = "fk_idioma")
    private Integer fkIdioma;
    @Basic(optional = false)
    @Column(name = "fk_tiposangre")
    private Integer fkTiposangre;
    @Column(name = "fk_escolaridad")
    private Integer fkEscolaridad;
    @Column(name = "fk_estado_conyugal")
    private Integer fkEstadoConyugal;
    @Column(name = "fk_lengua")
    private Integer fkLengua;
    @Basic(optional = false)
    @Column(name = "activo_persona")
    private Integer activoPersona;
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
    @Column(name = "habla_lengua_indigena")
    private Integer hablaLenguaIndigena;

    public PersonasAux() {
    }

    public PersonasAux(Integer idPersonaAux, Integer esMigrantePaciente, Short esAfromexicanoPaciente, Short esIndigenaPaciente, Boolean esDesconocido, Integer sabeLeer, Integer esNacioHospital, boolean esEscolaridadCompleta, Integer fkIdioma, Integer fkTiposangre, Integer fkEscolaridad, Integer fkEstadoConyugal, Integer fkLengua, Integer activoPersona, LocalDate fechaRegistro, LocalTime horaResgistro, Integer fkUsuarioRegistro, PersonasTBL fkPersona, Integer hablaLenguaIndigena) {
        this.idPersonaAux = idPersonaAux;
        this.esMigrantePaciente = esMigrantePaciente;
        this.esAfromexicanoPaciente = esAfromexicanoPaciente;
        this.esIndigenaPaciente = esIndigenaPaciente;
        this.esDesconocido = esDesconocido;
        this.sabeLeer = sabeLeer;
        this.esNacioHospital = esNacioHospital;
        this.esEscolaridadCompleta = esEscolaridadCompleta;
        this.fkIdioma = fkIdioma;
        this.fkTiposangre = fkTiposangre;
        this.fkEscolaridad = fkEscolaridad;
        this.fkEstadoConyugal = fkEstadoConyugal;
        this.fkLengua = fkLengua;
        this.activoPersona = activoPersona;
        this.fechaRegistro = fechaRegistro;
        this.horaResgistro = horaResgistro;
        this.fkUsuarioRegistro = fkUsuarioRegistro;
        this.fkPersona = fkPersona;
        this.hablaLenguaIndigena = hablaLenguaIndigena;
    }

    public Integer getIdPersonaAux() {
        return idPersonaAux;
    }

    public void setIdPersonaAux(Integer idPersonaAux) {
        this.idPersonaAux = idPersonaAux;
    }

    public Integer getEsMigrantePaciente() {
        return esMigrantePaciente;
    }

    public void setEsMigrantePaciente(Integer esMigrantePaciente) {
        this.esMigrantePaciente = esMigrantePaciente;
    }

    public Short getEsAfromexicanoPaciente() {
        return esAfromexicanoPaciente;
    }

    public void setEsAfromexicanoPaciente(Short esAfromexicanoPaciente) {
        this.esAfromexicanoPaciente = esAfromexicanoPaciente;
    }

    public Short getEsIndigenaPaciente() {
        return esIndigenaPaciente;
    }

    public void setEsIndigenaPaciente(Short esIndigenaPaciente) {
        this.esIndigenaPaciente = esIndigenaPaciente;
    }

    public Boolean getEsDesconocido() {
        return esDesconocido;
    }

    public void setEsDesconocido(Boolean esDesconocido) {
        this.esDesconocido = esDesconocido;
    }

    public Integer getSabeLeer() {
        return sabeLeer;
    }

    public void setSabeLeer(Integer sabeLeer) {
        this.sabeLeer = sabeLeer;
    }

    public Integer getEsNacioHospital() {
        return esNacioHospital;
    }

    public void setEsNacioHospital(Integer esNacioHospital) {
        this.esNacioHospital = esNacioHospital;
    }

    public boolean isEsEscolaridadCompleta() {
        return esEscolaridadCompleta;
    }

    public void setEsEscolaridadCompleta(boolean esEscolaridadCompleta) {
        this.esEscolaridadCompleta = esEscolaridadCompleta;
    }

    public Integer getFkIdioma() {
        return fkIdioma;
    }

    public void setFkIdioma(Integer fkIdioma) {
        this.fkIdioma = fkIdioma;
    }

    public Integer getFkTiposangre() {
        return fkTiposangre;
    }

    public void setFkTiposangre(Integer fkTiposangre) {
        this.fkTiposangre = fkTiposangre;
    }

    public Integer getFkEscolaridad() {
        return fkEscolaridad;
    }

    public void setFkEscolaridad(Integer fkEscolaridad) {
        this.fkEscolaridad = fkEscolaridad;
    }

    public Integer getFkEstadoConyugal() {
        return fkEstadoConyugal;
    }

    public void setFkEstadoConyugal(Integer fkEstadoConyugal) {
        this.fkEstadoConyugal = fkEstadoConyugal;
    }

    public Integer getFkLengua() {
        return fkLengua;
    }

    public void setFkLengua(Integer fkLengua) {
        this.fkLengua = fkLengua;
    }

    public Integer getActivoPersona() {
        return activoPersona;
    }

    public void setActivoPersona(Integer activoPersona) {
        this.activoPersona = activoPersona;
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

    public Integer getHablaLenguaIndigena() {
        return hablaLenguaIndigena;
    }

    public void setHablaLenguaIndigena(Integer hablaLenguaIndigena) {
        this.hablaLenguaIndigena = hablaLenguaIndigena;
    }
    
    
}
