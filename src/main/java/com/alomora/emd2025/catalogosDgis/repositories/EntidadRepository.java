/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.alomora.emd2025.catalogosDgis.repositories;

import com.alomora.emd2025.catalogosDgis.entities.EntidadCTL;
import com.alomora.emd2025.catalogosDgis.entities.PaisCTL;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author kpam2
 */
public interface EntidadRepository extends JpaRepository<EntidadCTL, Long>{
     
    @Query(value = "SELECT e FROM EntidadCTL e WHERE e.estatusEntidad=:estatus")
    List<EntidadCTL> getAllByEstatus(@Param("estatus") Integer estatus);
     
    @Query(value = "SELECT e FROM EntidadCTL e WHERE e.catalogKey=:catalogKey")
    List<EntidadCTL> getByKey(@Param("catalogKey") String catalogKey);
    
    @Query(value = "SELECT e FROM EntidadCTL e WHERE e.fkPais.idPais=:fkPais")
    List<EntidadCTL> getByPais(@Param("fkPais") Long fkPais);
    
}
