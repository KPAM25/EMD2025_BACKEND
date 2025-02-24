/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.alomora.emd2025.catalogosDgis.repositories;

import com.alomora.emd2025.catalogosDgis.entities.MunicipioCTL;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author kpam2
 */
public interface MunicipioRepository extends JpaRepository<MunicipioCTL, Long>{
    @Query(value = "SELECT e FROM MunicipioCTL e WHERE e.estatusMunicipio=:estatus")
    List<MunicipioCTL> getAllByEstatus(@Param("estatus") Integer estatus);
     
    @Query(value = "SELECT e FROM MunicipioCTL e WHERE e.catalogKey=:catalogKey")
    List<MunicipioCTL> getByKey(@Param("catalogKey") String catalogKey);
    
    @Query(value = "SELECT e FROM MunicipioCTL e WHERE e.efeKey.idEntidad=:fkEntidad")
    List<MunicipioCTL> getByEntidad(@Param("fkEntidad") String fkEntidad);
}
