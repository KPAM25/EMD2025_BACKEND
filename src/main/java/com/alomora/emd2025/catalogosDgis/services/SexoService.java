/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.catalogosDgis.services;

import com.alomora.emd2025.catalogosDgis.entities.SexoCTL;
import com.alomora.emd2025.catalogosDgis.repositories.SexoRepository;
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
public class SexoService {
    @Autowired
    SexoRepository sexoRepository;
    
    public List<SexoCTL> getAllByEstatus(Integer estatus){
        return (List<SexoCTL>)this.sexoRepository.getAllByEstatus(estatus);
    }
    
    public List<SexoCTL> getByKey(Integer key){
        return (List<SexoCTL>)this.sexoRepository.getByKey(key);
    }
}
