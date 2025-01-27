/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidadMedica.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author kpam2
 */

@Entity
@Table(name = "unidad_medica_tbl")
public class UnidadMedicaTBL {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_establecimiento_seleccion")
    private Long idEstablecimiento;
    @Basic(optional = false)
    @Column(name = "nombre_establecimiento")
    private String nombreEstablecimiento;
    @Basic(optional = false)
    @Column(name = "clave_institucion")
    private boolean claveInstitucion;
    @Basic(optional = false)
    @Column(name = "clave_tipologia")
    private String claveTipologia;
    @Basic(optional = false)
    @Column(name = "clave_subtipologia")
    private short claveSubtipologia;
    @Basic(optional = false)
    @Column(name = "clues")
    private String clues;

    public UnidadMedicaTBL() {
    }

    public UnidadMedicaTBL(Long idEstablecimiento, String nombreEstablecimiento, boolean claveInstitucion, String claveTipologia, short claveSubtipologia, String clues) {
        this.idEstablecimiento = idEstablecimiento;
        this.nombreEstablecimiento = nombreEstablecimiento;
        this.claveInstitucion = claveInstitucion;
        this.claveTipologia = claveTipologia;
        this.claveSubtipologia = claveSubtipologia;
        this.clues = clues;
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
    
    
}
