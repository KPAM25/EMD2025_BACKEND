/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.alomora.emd2025.catalogos.repositories;

import com.alomora.emd2025.catalogos.entities.IdiomasCTL;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author kpam2
 */
public interface IdiomasRepository extends JpaRepository<IdiomasCTL, Long>{
    
    @Query(value = "SELECT e FROM IdiomasCTL e WHERE e.activoIdioma=:estatus")
     List<IdiomasCTL> getAllByEstatus(@Param("estatus") Integer estatus);
    
}
