/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.alomora.emd2025.catalogosDgis.repositories;

import com.alomora.emd2025.catalogosDgis.entities.LocalidadCTL;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author kpam2
 */
public interface LocalidadRepository extends JpaRepository<LocalidadCTL, Long>{
    
    @Query(value = "SELECT e FROM LocalidadCTL e WHERE e.estatusLocalidad=:estatus")
    List<LocalidadCTL> getAllByEstatus(@Param("estatus") Integer estatus);
     
    @Query(value = "SELECT e FROM LocalidadCTL e WHERE e.cveLoc=:cveLoc")
    List<LocalidadCTL> getByKey(@Param("cveLoc") String cveLoc);
    
    @Query(value = "SELECT e FROM LocalidadCTL e WHERE e.cveMun=:fkMunicipio AND e.cveEnt = :fkEntidad")
    List<LocalidadCTL> getByMunicipio(@Param("fkMunicipio") String fkMunicipio, @Param("fkEntidad") String fkEntidad);
}
