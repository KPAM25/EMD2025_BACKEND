/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.alomora.emd2025.catalogosDgis.repositories;

import com.alomora.emd2025.catalogosDgis.entities.UnidadesMedicasCTL;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author kpam2
 */
public interface UnidadesMedicasRepository extends JpaRepository<UnidadesMedicasCTL, Long>{
    
    @Query(value = "SELECT e FROM UnidadesMedicasCTL e WHERE e.estatusUnidad=:estatus")
     List<UnidadesMedicasCTL> getAllByEstatus(@Param("estatus") Integer estatus);
     
     @Query(value = "SELECT e FROM UnidadesMedicasCTL e WHERE e.clues=:clues")
     List<UnidadesMedicasCTL> getByClues(@Param("clues") String clues);
    
}
