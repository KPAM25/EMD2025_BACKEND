/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.catalogosDgis.services;

import com.alomora.emd2025.catalogosDgis.entities.LocalidadCTL;
import com.alomora.emd2025.catalogosDgis.repositories.LocalidadRepository;
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
public class LocalidadService {
     @Autowired
    LocalidadRepository localidadRepository;
    
    public List<LocalidadCTL> getAllByEstatus(Integer estatus){
        return (List<LocalidadCTL>)this.localidadRepository.getAllByEstatus(estatus);
    }
    
    public List<LocalidadCTL> getByKey(String key){
        return (List<LocalidadCTL>)this.localidadRepository.getByKey(key);
    }
    
    public List<LocalidadCTL> getByMunicipio(String fkMunicipio, String fkEntidad){
        return (List<LocalidadCTL>)this.localidadRepository.getByMunicipio(fkMunicipio, fkEntidad);
    }
}
