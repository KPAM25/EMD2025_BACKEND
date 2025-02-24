/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.catalogosDgis.controllers;

import com.alomora.emd2025.catalogosDgis.entities.MunicipioCTL;
import com.alomora.emd2025.catalogosDgis.services.MunicipioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kpam2
 */

@RestController
@RequestMapping("/municipio")
public class MunicipioController {
    @Autowired
    MunicipioService municipioService;
    
    @GetMapping("/getAllEstatus/{estatus}")
    public ResponseEntity<List<MunicipioCTL>> getAllMunicipios(@PathVariable("estatus") Integer estatus){
        List<MunicipioCTL> municipioAux= municipioService.getAllByEstatus(estatus);
        if(municipioAux.isEmpty()){            
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(municipioAux);
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(municipioAux);
        }
    }
    
    @GetMapping("/getByKey/{key}")
    public ResponseEntity<List<MunicipioCTL>> getByKey(@PathVariable("key") String key){
        List<MunicipioCTL> municipioAux= municipioService.getByKey(key);
        if(municipioAux.isEmpty()){            
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(municipioAux);
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(municipioAux);
        }
    }
    
    @GetMapping("/getByEntidad/{fkEntidad}")
    public ResponseEntity<List<MunicipioCTL>> getByEntidad(@PathVariable("fkEntidad") String fkEntidad){
        List<MunicipioCTL> municipioAux= municipioService.getByEntidad(fkEntidad);
        if(municipioAux.isEmpty()){            
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(municipioAux);
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(municipioAux);
        }
    }
}
