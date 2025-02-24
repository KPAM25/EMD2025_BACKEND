/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.catalogosDgis.controllers;

import com.alomora.emd2025.catalogosDgis.entities.LocalidadCTL;
import com.alomora.emd2025.catalogosDgis.services.LocalidadService;
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
@RequestMapping("/localidad")
public class LocalidadController {
      @Autowired
    LocalidadService localidadService;
    
    @GetMapping("/getAllEstatus/{estatus}")
    public ResponseEntity<List<LocalidadCTL>> getAllLocalidades(@PathVariable("estatus") Integer estatus){
        List<LocalidadCTL> localidadAux= localidadService.getAllByEstatus(estatus);
        if(localidadAux.isEmpty()){            
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(localidadAux);
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(localidadAux);
        }
    }
    
    @GetMapping("/getByKey/{key}")
    public ResponseEntity<List<LocalidadCTL>> getByKey(@PathVariable("key") String key){
        List<LocalidadCTL> localidadAux= localidadService.getByKey(key);
        if(localidadAux.isEmpty()){            
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(localidadAux);
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(localidadAux);
        }
    }
    
    @GetMapping("/getByMunicipio/{fkMunicipio}/getByEntidad/{fkEntidad}")
    public ResponseEntity<List<LocalidadCTL>> getByEntidad(@PathVariable("fkMunicipio") String fkMunicipio, @PathVariable("fkEntidad") String fkEntidad){
        List<LocalidadCTL> localidadAux= localidadService.getByMunicipio(fkMunicipio, fkEntidad);
        if(localidadAux.isEmpty()){            
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(localidadAux);
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(localidadAux);
        }
    }
}
