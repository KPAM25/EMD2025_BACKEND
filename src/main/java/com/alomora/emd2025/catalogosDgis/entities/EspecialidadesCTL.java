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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kpam2
 */

@Entity
@Table(name = "especialidad_ctl", schema = "catalogosdgis")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EspecialidadesCTL {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_especialidad")
    private Long idEspecialidad;
    @Basic(optional = false)
    @Column(name = "nombre_especialidad")
    private String especialidad;   
    @Column(name = "activo_especialidad")
    private Integer activoEspecialidad;
    @Column(name = "valor_key")
    private Integer valorEspecialidad;
    @Column(name = "activo_especialidad_unidad")
    private Integer activoUnidad;
}
