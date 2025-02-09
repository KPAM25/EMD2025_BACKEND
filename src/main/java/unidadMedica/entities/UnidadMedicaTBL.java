/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidadMedica.entities;

import catalogosDGIS.entities.UnidadMedicaCTL;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 *
 * @author kpam2
 */

@Entity
@Table(name = "configuracion_unidad_tbl", schema = "adminEmd")
public class UnidadMedicaTBL {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long idEstablecimiento;
    @Basic(optional = false)
    @Column(name = "nombre_unidad")
    private String nombreEstablecimiento;
    @Basic(optional = false)
    @Column(name = "tipo_establecimineto_clave")
    private boolean claveInstitucion;
    @Basic(optional = false)
    @Column(name = "tipologia_clave")
    private String claveTipologia;
    @Basic(optional = false)
    @Column(name = "subtipologia_clave")
    private short claveSubtipologia;
    @Basic(optional = false)
    @Column(name = "clues")
    private String clues;
    @JoinColumn(name = "fk_establecimiento_salud", referencedColumnName = "id_establecimiento")
    @ManyToOne
    private UnidadMedicaCTL fkUnidad;
    @Basic(optional = false)
    @Column(name = "primeravez")
    private Integer primeraVez;
    @Basic(optional = false)
    @Column(name = "subsecuente")
    private Integer subsecuente;
     @Column(name = "es_uma_unidad")
    private boolean esUmaUnidad;

    public UnidadMedicaTBL() {
    }

    public UnidadMedicaTBL(Long idEstablecimiento, String nombreEstablecimiento, boolean claveInstitucion, String claveTipologia, short claveSubtipologia, String clues, UnidadMedicaCTL fkUnidad, Integer primeraVez, Integer subsecuente, boolean esUmaUnidad) {
        this.idEstablecimiento = idEstablecimiento;
        this.nombreEstablecimiento = nombreEstablecimiento;
        this.claveInstitucion = claveInstitucion;
        this.claveTipologia = claveTipologia;
        this.claveSubtipologia = claveSubtipologia;
        this.clues = clues;
        this.fkUnidad = fkUnidad;
        this.primeraVez = primeraVez;
        this.subsecuente = subsecuente;
        this.esUmaUnidad = esUmaUnidad;
    }

    

    public Long getIdEstablecimiento() {
        return idEstablecimiento;
    }

    public void setIdEstablecimiento(Long idEstablecimiento) {
        this.idEstablecimiento = idEstablecimiento;
    }

    public String getNombreEstablecimiento() {
        return nombreEstablecimiento;
    }

    public void setNombreEstablecimiento(String nombreEstablecimiento) {
        this.nombreEstablecimiento = nombreEstablecimiento;
    }

    public boolean isClaveInstitucion() {
        return claveInstitucion;
    }

    public void setClaveInstitucion(boolean claveInstitucion) {
        this.claveInstitucion = claveInstitucion;
    }

    public String getClaveTipologia() {
        return claveTipologia;
    }

    public void setClaveTipologia(String claveTipologia) {
        this.claveTipologia = claveTipologia;
    }

    public short getClaveSubtipologia() {
        return claveSubtipologia;
    }

    public void setClaveSubtipologia(short claveSubtipologia) {
        this.claveSubtipologia = claveSubtipologia;
    }

    public String getClues() {
        return clues;
    }

    public void setClues(String clues) {
        this.clues = clues;
    }

    public UnidadMedicaCTL getFkUnidad() {
        return fkUnidad;
    }

    public void setFkUnidad(UnidadMedicaCTL fkUnidad) {
        this.fkUnidad = fkUnidad;
    }

    public Integer getPrimeraVez() {
        return primeraVez;
    }

    public void setPrimeraVez(Integer primeraVez) {
        this.primeraVez = primeraVez;
    }

    public Integer getSubsecuente() {
        return subsecuente;
    }

    public void setSubsecuente(Integer subsecuente) {
        this.subsecuente = subsecuente;
    }

    public boolean isEsUmaUnidad() {
        return esUmaUnidad;
    }

    public void setEsUmaUnidad(boolean esUmaUnidad) {
        this.esUmaUnidad = esUmaUnidad;
    }
    
    
}
