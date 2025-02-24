/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.alomora.emd2025.catalogosDgis.repositories;

import com.alomora.emd2025.catalogosDgis.entities.GeneroCTL;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author kpam2
 */
public interface GeneroRepository extends JpaRepository<GeneroCTL, Long>{
     
    @Query(value = "SELECT e FROM GeneroCTL e WHERE e.activoGenero=:estatus")
    List<GeneroCTL> getAllByEstatus(@Param("estatus") Integer estatus);
     
    @Query(value = "SELECT e FROM GeneroCTL e WHERE e.catalogKey=:catalogKey")
    List<GeneroCTL> getByKey(@Param("catalogKey") Integer catalogKey);
}
