/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.emd.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    @NotNull(message = "El campo 'activoPersona' es obligatorio")
    @Column(name = "activo_persona")
    private Long activoPersona;

    @NotBlank(message = "El nombre no puede estar vacío")
    @Size(min = 2, max = 50, message = "El nombre debe tener entre 2 y 50 caracteres")
    @Column(name = "nombres_persona")
    private String nombresPersona;

    @NotBlank(message = "El primer apellido es obligatorio")
    @Column(name = "primer_apellido_persona")
    private String primerApellidoPersona;

    @Column(name = "segundo_apellido_persona")
    private String segundoApellidoPersona;

    @NotNull(message = "La fecha de nacimiento es obligatoria")
    @Column(name = "fecha_nacimiento_persona")
    private String fechaNacimientoPersona;

    @NotBlank(message = "La CURP es obligatoria")
    @Size(min = 18, max = 18, message = "La CURP debe tener exactamente 18 caracteres")
    @Pattern(regexp = "^[A-Z]{4}[0-9]{6}[HM]{1}[A-Z]{2}[A-Z0-9]{3}[0-9A-Z]{1}$", message = "Formato de CURP inválido")
    @Column(name = "curp_persona", unique = true)
    private String curpPersona;

    @NotNull(message = "El género es obligatorio")
    @Column(name = "fk_genero")
    private Long fkGenero;

    @NotNull(message = "Entidad de nacimiento obligatoria")
    @Column(name = "fk_entidad_nac")
    private Long fkEntidadNac;

    @NotNull(message = "País de nacimiento obligatorio")
    @Column(name = "fk_pais_nac")
    private Long fkPaisNac;

    @Column(name = "fk_sexox")
    private Long fkSexox;

    @Column(name = "fk_sexo_curp")
    private Long fkSexoCurp;

    @Column(name = "fk_unidad")
    private Long fkUnidad;

    @Column(name = "curp_valida")
    private boolean curpValida;

    @Column(name = "fecha_registro")
    private LocalDate fechaRegistro;

    @Column(name = "hora_registro")
    private LocalTime horaRegistro;

    @Column(name = "fk_usuario_registro")
    private Long fkUsuarioRegistro;
}
