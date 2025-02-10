/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.catalogos.entities;

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
@Table(name = "tipos_sangre_ctl", schema = "catalogos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TiposSangreCTL implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tiposangre")
    private Long idTipoSangre;
    @Basic(optional = false)
    @Column(name = "nombre_tiposangre")
    private String nombreTipoSangre;   
    @Column(name = "activo_tiposangre")
    private Integer activoTipoSangre;
}
