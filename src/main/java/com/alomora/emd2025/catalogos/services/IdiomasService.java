/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.catalogos.services;

import com.alomora.emd2025.catalogos.entities.IdiomasCTL;
import com.alomora.emd2025.catalogos.repositories.IdiomasRepository;
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
public class IdiomasService {
    @Autowired
    IdiomasRepository idiomasRepository;
    
    public List<IdiomasCTL> getAllByEstatus(Integer estatus){
        return (List<IdiomasCTL>)this.idiomasRepository.getAllByEstatus(estatus);
    }
    
}
