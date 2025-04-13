/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.catalogosDgis.services;

import com.alomora.emd2025.catalogosDgis.entities.EntidadCTL;
import com.alomora.emd2025.catalogosDgis.repositories.EntidadRepository;
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
public class EntidadServive {
    @Autowired
    EntidadRepository entidadRepository;
    
    public List<EntidadCTL> getAllByEstatus(Integer estatus){
        return (List<EntidadCTL>)this.entidadRepository.getAllByEstatus(estatus);
    }
    
    public List<EntidadCTL> getByKey(String key){
        return (List<EntidadCTL>)this.entidadRepository.getByKey(key);
    }
    
    public List<EntidadCTL> getByPais(Long fkPais){
        List<EntidadCTL> entidades = (List<EntidadCTL>)this.entidadRepository.getByPais(fkPais);
        if (entidades.isEmpty()) {
            // Si no hay resultados, regresamos la entidad NO APLICA
            return (List<EntidadCTL>)this.entidadRepository.getByKey("88");
        }
        return entidades;
    }
}
