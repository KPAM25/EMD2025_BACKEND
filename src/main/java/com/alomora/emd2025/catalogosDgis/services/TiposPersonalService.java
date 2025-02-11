/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.catalogosDgis.services;

import com.alomora.emd2025.catalogosDgis.entities.TiposPersonalCTL;
import com.alomora.emd2025.catalogosDgis.repositories.TiposPersonalRepository;
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
public class TiposPersonalService {
    @Autowired
    TiposPersonalRepository tiposPersonalRepository;
    
    public List<TiposPersonalCTL> getAllByEstatus(Integer estatus){
        return (List<TiposPersonalCTL>)this.tiposPersonalRepository.getAllByEstatus(estatus);
    }
    
}
