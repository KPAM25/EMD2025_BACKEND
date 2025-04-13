/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.emd.entities;

import com.alomora.emd2025.catalogosDgis.entities.EntidadCTL;
import com.alomora.emd2025.catalogosDgis.entities.PaisCTL;
import com.alomora.emd2025.catalogosDgis.entities.SexoCTL;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kpam2
 */
@Entity
@Table(name = "personas_tbl", schema = "emd")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonaTBL {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_persona")
    private Long idPersona;
    @Column(name = "activo_persona")
    private Integer activoPersona;
    @Column(name = "nombres_persona")
    private String nombresPersona;
    @Column(name = "primer_apellido_persona")
    private String primerApellidoPersona;
    @Column(name = "segundo_apellido_persona")
    private String segundoApellidoPersona;
    @Column(name = "fecha_nacimiento_persona")
    private String fechaNacimientoPersona;
    @Column(name = "curp_persona", unique = true)
    private String curpPersona;
    @JoinColumn(name = "fk_pais_nac", referencedColumnName = "id_pais")
    @ManyToOne(optional = false)
    private PaisCTL fkPaisNac;
    @JoinColumn(name = "fk_entidad_nac", referencedColumnName = "catalog_key")
    @ManyToOne(optional = false)
    private EntidadCTL fkEntidadNac;
    @Column(name = "fk_genero")
    private Integer fkGenero;
    @Column(name = "fk_sexox")
    private Integer fkSexox;
    @JoinColumn(name = "fk_sexo_curp", referencedColumnName = "catalog_key")
    @ManyToOne(optional = false)
    private SexoCTL fkSexoCurp;
    @Column(name = "fk_unidad")
    private Integer fkUnidad;
    @Column(name = "curp_valida")
    private boolean curpValida;
    @Column(name = "fecha_registro")
    private LocalDate fechaRegistro;
    @Column(name = "hora_registro")
    private LocalTime horaRegistro;
    @Column(name = "fk_usuario_registro")
    private Integer fkUsuarioRegistro;
}
