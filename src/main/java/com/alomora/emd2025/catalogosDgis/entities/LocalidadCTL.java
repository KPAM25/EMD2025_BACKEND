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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kpam2
 */

@Entity
@Table(name = "localidades_ctl", schema = "catalogosdgis")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocalidadCTL {
     private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_localidad")
    private Long idLocalidad;
    @Column(name = "cve_ent")
    private String cveEnt;
    @Column(name = "cve_mun")
    private String cveMun;
    @Column(name = "cve_loc")
    private String cveLoc;
    @Column(name = "nom_loc")
    private String nomLoc;
    @Column(name = "estatus_localidad")
    private Integer estatusLocalidad;
    @Column(name = "fuente")
    private Integer fuente;
}
