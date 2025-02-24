/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.alomora.emd2025.emd.repositories;

import com.alomora.emd2025.emd.entities.PersonaTBL;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author kpam2
 */
public interface PersonaRepository extends JpaRepository<PersonaTBL, Long>{
    @Query(value = "SELECT e FROM PersonaTBL e WHERE e.activoPersona=:estatus")
    List<PersonaTBL> getAllByEstatus(@Param("estatus") Integer estatus);
    
    @Query(value = "SELECT e FROM PersonaTBL e WHERE e.curpPersona=:curpPersona")
    List<PersonaTBL> getByCurp(@Param("curpPersona") String curpPersona);
}
