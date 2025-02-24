/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.catalogosDgis.services;

import com.alomora.emd2025.catalogosDgis.entities.MunicipioCTL;
import com.alomora.emd2025.catalogosDgis.repositories.MunicipioRepository;
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
public class MunicipioService {
    @Autowired
    MunicipioRepository municipioRepository;
    
    public List<MunicipioCTL> getAllByEstatus(Integer estatus){
        return (List<MunicipioCTL>)this.municipioRepository.getAllByEstatus(estatus);
    }
    
    public List<MunicipioCTL> getByKey(String key){
        return (List<MunicipioCTL>)this.municipioRepository.getByKey(key);
    }
    
    public List<MunicipioCTL> getByEntidad(String fkEntidad){
        return (List<MunicipioCTL>)this.municipioRepository.getByEntidad(fkEntidad);
    }
}
