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
@Table(name = "usuarios_tbl")
public class UsuariosTBL {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Basic(optional = false)
    @Column(name = "activo_usuario")
    private Short activoUsuario;
    @Basic(optional = false)
    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    @Basic(optional = false)
    @Column(name = "contrasenia_usuario")
    private String contraseniaUsuario;
    @Basic(optional = false)
    @Column(name = "fk_personal_salud")
    private int fkPersonalSalud;
    @Column(name = "es_inicial")
    private Boolean esInicial;
    @Column(name = "temporal_contra")
    private String temporalContra;
    @Column(name = "cuenta_no_bloqueada")
    private Boolean cuentaNoBloqueada;
    @Column(name = "intentos")
    private Integer intentos;
    @Column(name = "fecha_contra")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaContra;
    @Column(name = "cuenta_no_expirada")
    private Boolean cuentaNoExpirada;
    @Column(name = "fk_usuario_registro")
    private Integer fkUsuarioRegistro;
    @Column(name = "fecha_registro")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaRegistro = LocalDate.now();
    @Column(name = "hora_registro")
    private LocalTime horaRegistro = LocalTime.now();

    public UsuariosTBL() {
    }

    public UsuariosTBL(Integer idUsuario, Short activoUsuario, String nombreUsuario, String contraseniaUsuario, int fkPersonalSalud, Boolean esInicial, String temporalContra, Boolean cuentaNoBloqueada, Integer intentos, LocalDate fechaContra, Boolean cuentaNoExpirada, Integer fkUsuarioRegistro) {
        this.idUsuario = idUsuario;
        this.activoUsuario = activoUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contraseniaUsuario = contraseniaUsuario;
        this.fkPersonalSalud = fkPersonalSalud;
        this.esInicial = esInicial;
        this.temporalContra = temporalContra;
        this.cuentaNoBloqueada = cuentaNoBloqueada;
        this.intentos = intentos;
        this.fechaContra = fechaContra;
        this.cuentaNoExpirada = cuentaNoExpirada;
        this.fkUsuarioRegistro = fkUsuarioRegistro;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Short getActivoUsuario() {
        return activoUsuario;
    }

    public void setActivoUsuario(Short activoUsuario) {
        this.activoUsuario = activoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseniaUsuario() {
        return contraseniaUsuario;
    }

    public void setContraseniaUsuario(String contraseniaUsuario) {
        this.contraseniaUsuario = contraseniaUsuario;
    }

    public int getFkPersonalSalud() {
        return fkPersonalSalud;
    }

    public void setFkPersonalSalud(int fkPersonalSalud) {
        this.fkPersonalSalud = fkPersonalSalud;
    }

    public Boolean getEsInicial() {
        return esInicial;
    }

    public void setEsInicial(Boolean esInicial) {
        this.esInicial = esInicial;
    }

    public String getTemporalContra() {
        return temporalContra;
    }

    public void setTemporalContra(String temporalContra) {
        this.temporalContra = temporalContra;
    }

    public Boolean getCuentaNoBloqueada() {
        return cuentaNoBloqueada;
    }

    public void setCuentaNoBloqueada(Boolean cuentaNoBloqueada) {
        this.cuentaNoBloqueada = cuentaNoBloqueada;
    }

    public Integer getIntentos() {
        return intentos;
    }

    public void setIntentos(Integer intentos) {
        this.intentos = intentos;
    }

    public LocalDate getFechaContra() {
        return fechaContra;
    }

    public void setFechaContra(LocalDate fechaContra) {
        this.fechaContra = fechaContra;
    }

    public Boolean getCuentaNoExpirada() {
        return cuentaNoExpirada;
    }

    public void setCuentaNoExpirada(Boolean cuentaNoExpirada) {
        this.cuentaNoExpirada = cuentaNoExpirada;
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
