/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.alomora.emd2025.catalogosDgis.repositories;

import com.alomora.emd2025.catalogosDgis.entities.TiposPersonalCTL;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author kpam2
 */
public interface TiposPersonalRepository extends JpaRepository<TiposPersonalCTL, Long>{
    
    @Query(value = "SELECT e FROM TiposPersonalCTL e WHERE e.activoTipoPersonal=:estatus")
     List<TiposPersonalCTL> getAllByEstatus(@Param("estatus") Integer estatus);
    
}
