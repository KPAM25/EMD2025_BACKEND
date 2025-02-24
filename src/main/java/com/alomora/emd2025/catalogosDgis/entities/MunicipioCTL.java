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
@Table(name = "municipios_ctl", schema = "catalogosdgis")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MunicipioCTL {
     private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_municipio")
    private Long idMunicipio;
    @Column(name = "catalog_key")
    private String catalogKey;
    @Column(name = "municipio")
    private String municipio;
    @JoinColumn(name = "efe_key", referencedColumnName = "catalog_key")
    @ManyToOne(optional = false)
    private EntidadCTL efeKey;
    @Column(name = "estatus_municipio")
    private Integer estatusMunicipio;
    @Column(name = "fuente")
    private Integer fuente;
}
