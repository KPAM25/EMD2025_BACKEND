/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.catalogosDgis.services;

import com.alomora.emd2025.catalogosDgis.entities.GeneroCTL;
import com.alomora.emd2025.catalogosDgis.repositories.GeneroRepository;
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
public class GeneroService {
    @Autowired
    GeneroRepository generoRepository;
    
    public List<GeneroCTL> getAllByEstatus(Integer estatus){
        return (List<GeneroCTL>)this.generoRepository.getAllByEstatus(estatus);
    }
    
    public List<GeneroCTL> getByKey(Integer key){
        return (List<GeneroCTL>)this.generoRepository.getByKey(key);
    }
}
