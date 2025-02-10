/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.alomora.emd2025.catalogosDgis.repositories;

import com.alomora.emd2025.catalogosDgis.entities.EspecialidadesCTL;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author kpam2
 */
public interface EspecialidadesRepository extends JpaRepository<EspecialidadesCTL, Long>{
    
    @Query(value = "SELECT e FROM EspecialidadesCTL e WHERE e.activoEspecialidad=:estatus")
     List<EspecialidadesCTL> getAllByEstatus(@Param("estatus") Integer estatus);
    
}
