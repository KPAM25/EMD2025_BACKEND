package personas.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "personas_tbl", schema = "emd")
public class PersonasTBL {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_persona")
    private Integer idPersona;
    @Basic(optional = false)
    @Column(name = "curp_persona")
    private String curpPersona;
    @Basic(optional = false)
    @Column(name = "nombres_persona")
    private String nombresPersona;
    @Basic(optional = false)
    @Column(name = "primer_apellido_persona")
    private String primerApellidoPersona;
    @Column(name = "segundo_apellido_persona")
    private String segundoApellidoPersona;
    @Basic(optional = false)
    @Column(name = "fecha_nacimiento_persona")
    private String fechaNacimientoPersona;
    @Column(name = "fk_unidad")
    private Integer fkEstablecimiento;
    @Column(name = "fk_pais_nac")
    private Integer fkPaisNac;
    @Column(name = "fk_entidad_nac")
    private Integer fkEntidadNac;
    @Column(name = "fk_sexo_curp")
    private Integer fkSexo;
    @Basic(optional = false)
    @Column(name = "fk_genero")
    private Short fkGenero;
    @Basic(optional = false)
    @Column(name = "activo_persona")
    private Integer activoPersona;
    @Basic(optional = true)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha_registro")
    @JsonIgnore
    private LocalDate fechaRegistro = LocalDate.now();
    @Column(name = "hora_resgistro")
    @JsonFormat(pattern = "HH:mm:ss")
    @Basic(optional = true)
    @JsonIgnore
    private LocalTime horaResgistro = LocalTime.now();
    @Basic(optional = false)
    @Column(name = "fk_usuario_registro")
    private Integer fkUsuarioRegistro;    
    @Basic(optional = true)
    @Column(name = "curp_valida")
    private Boolean curpValida;    

    public PersonasTBL() {
    }

    public PersonasTBL(Integer idPersona, String curpPersona, String nombresPersona, String primerApellidoPersona, String segundoApellidoPersona, String fechaNacimientoPersona, Integer fkEstablecimiento, Integer fkPaisNac, Integer fkEntidadNac, Integer fkSexo, Short fkGenero, Integer activoPersona, Integer fkUsuarioRegistro, Boolean curpValida) {
        this.idPersona = idPersona;
        this.curpPersona = curpPersona;
        this.nombresPersona = nombresPersona;
        this.primerApellidoPersona = primerApellidoPersona;
        this.segundoApellidoPersona = segundoApellidoPersona;
        this.fechaNacimientoPersona = fechaNacimientoPersona;
        this.fkEstablecimiento = fkEstablecimiento;
        this.fkPaisNac = fkPaisNac;
        this.fkEntidadNac = fkEntidadNac;
        this.fkSexo = fkSexo;
        this.fkGenero = fkGenero;
        this.activoPersona = activoPersona;
        this.fkUsuarioRegistro = fkUsuarioRegistro;
        this.curpValida = curpValida;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getCurpPersona() {
        return curpPersona;
    }

    public void setCurpPersona(String curpPersona) {
        this.curpPersona = curpPersona;
    }

    public String getNombresPersona() {
        return nombresPersona;
    }

    public void setNombresPersona(String nombresPersona) {
        this.nombresPersona = nombresPersona;
    }

    public String getPrimerApellidoPersona() {
        return primerApellidoPersona;
    }

    public void setPrimerApellidoPersona(String primerApellidoPersona) {
        this.primerApellidoPersona = primerApellidoPersona;
    }

    public String getSegundoApellidoPersona() {
        return segundoApellidoPersona;
    }

    public void setSegundoApellidoPersona(String segundoApellidoPersona) {
        this.segundoApellidoPersona = segundoApellidoPersona;
    }

    public String getFechaNacimientoPersona() {
        return fechaNacimientoPersona;
    }

    public void setFechaNacimientoPersona(String fechaNacimientoPersona) {
        this.fechaNacimientoPersona = fechaNacimientoPersona;
    }

    public Integer getFkEstablecimiento() {
        return fkEstablecimiento;
    }

    public void setFkEstablecimiento(Integer fkEstablecimiento) {
        this.fkEstablecimiento = fkEstablecimiento;
    }

    public Integer getFkPaisNac() {
        return fkPaisNac;
    }

    public void setFkPaisNac(Integer fkPaisNac) {
        this.fkPaisNac = fkPaisNac;
    }

    public Integer getFkEntidadNac() {
        return fkEntidadNac;
    }

    public void setFkEntidadNac(Integer fkEntidadNac) {
        this.fkEntidadNac = fkEntidadNac;
    }

    public Integer getFkSexo() {
        return fkSexo;
    }

    public void setFkSexo(Integer fkSexo) {
        this.fkSexo = fkSexo;
    }

    public Short getFkGenero() {
        return fkGenero;
    }

    public void setFkGenero(Short fkGenero) {
        this.fkGenero = fkGenero;
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

    public Boolean getCurpValida() {
        return curpValida;
    }

    public void setCurpValida(Boolean curpValida) {
        this.curpValida = curpValida;
    }

   
    
}
