/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.catalogosDgis.services;

import com.alomora.emd2025.catalogosDgis.entities.EspecialidadesCTL;
import com.alomora.emd2025.catalogosDgis.repositories.EspecialidadesRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author kpam2
 */

@Transactional
@Service
public class EspecialidadesService {
    @Autowired
    EspecialidadesRepository especialidadesRepository;
    
     public List<EspecialidadesCTL> getAllByEstatus(Integer estatus){
        return (List<EspecialidadesCTL>)this.especialidadesRepository.getAllByEstatus(estatus);
    }
    
}
