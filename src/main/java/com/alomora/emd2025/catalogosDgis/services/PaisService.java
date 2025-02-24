/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.catalogosDgis.services;

import com.alomora.emd2025.catalogosDgis.entities.PaisCTL;
import com.alomora.emd2025.catalogosDgis.repositories.PaisRepository;
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
public class PaisService {
    @Autowired
    PaisRepository paisRepository;
    
    public List<PaisCTL> getAllByEstatus(Integer estatus){
        return (List<PaisCTL>)this.paisRepository.getAllByEstatus(estatus);
    }
    
    public List<PaisCTL> getByKey(String key){
        return (List<PaisCTL>)this.paisRepository.getByKey(key);
    }
}
