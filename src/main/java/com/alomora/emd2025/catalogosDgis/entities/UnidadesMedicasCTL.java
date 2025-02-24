/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.catalogosDgis.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kpam2
 */

@Entity
@Table(name = "unidad_medica_ctl", schema = "catalogosdgis")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnidadesMedicasCTL implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_establecimiento")
    private Long idEstablecimiento;
    @Basic(optional = false)
    @Column(name = "clues")
    private String clues;   
    @Column(name = "nombre_entidad")
    private String nombreEntidad; 
    @Column(name = "clave_entidad")
    private String claveEntidad; 
    @Column(name = "nombre_municipio")
    private String nombreMunicipio;  
    @Column(name = "clave_municipio")
    private String claveMunicipio;  
    @Column(name = "nombre_localidad")
    private String nombreLocalidad;  
    @Column(name = "clave_localidad")
    private String claveLocalidad;  
    @Column(name = "nombre_jurisdiccion")
    private String nombreJurisdiccion;  
    @Column(name = "clave_jurisdiccion")
    private String claveJurisdiccion;  
    @Column(name = "nombre_institucion")
    private String nombreInstitucion;  
    @Column(name = "clave_institucion")
    private String claveInstitucion;  
    @Column(name = "nombre_tipo_establecimiento")
    private String nombreTipoEstablecimiento;  
    @Column(name = "clave_tipo_establecimiento")
    private String claveTipoEstablecimiento;  
    @Column(name = "nombre_tipologia")
    private String nombreTipologia;  
    @Column(name = "clave_tipologia")
    private String claveTipologia;  
    @Column(name = "nombre_subtipologia")
    private String nombreSubtipologia;  
    @Column(name = "clave_subtipologia")
    private String claveSubtipologia;  
    @Column(name = "estatus_unidad")
    private Integer estatusUnidad;    
}
