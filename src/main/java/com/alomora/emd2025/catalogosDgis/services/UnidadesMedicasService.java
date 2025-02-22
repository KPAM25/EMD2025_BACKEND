/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.catalogosDgis.services;

import com.alomora.emd2025.catalogosDgis.entities.UnidadesMedicasCTL;
import com.alomora.emd2025.catalogosDgis.repositories.UnidadesMedicasRepository;
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
public class UnidadesMedicasService {
    @Autowired
    UnidadesMedicasRepository unidadesMedicasRepository;
    
    public List<UnidadesMedicasCTL> getAllByEstatus(Integer estatus){
        return (List<UnidadesMedicasCTL>)this.unidadesMedicasRepository.getAllByEstatus(estatus);
    }
    
    public List<UnidadesMedicasCTL> getByClues(String clues){
        return (List<UnidadesMedicasCTL>)this.unidadesMedicasRepository.getByClues(clues);
    }
}
