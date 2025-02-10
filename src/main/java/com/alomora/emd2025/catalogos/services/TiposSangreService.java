/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.catalogos.services;

import com.alomora.emd2025.catalogos.entities.TiposSangreCTL;
import com.alomora.emd2025.catalogos.repositories.TiposSangreRepository;
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
public class TiposSangreService {
    @Autowired
    TiposSangreRepository tiposSangreRepository;
    
    public List<TiposSangreCTL> getAllByEstatus(Integer estatus){
        return (List<TiposSangreCTL>)this.tiposSangreRepository.getAllByEstatus(estatus);
    }
    
}
