/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.catalogosDgis.controllers;

import com.alomora.emd2025.catalogosDgis.entities.PaisCTL;
import com.alomora.emd2025.catalogosDgis.services.PaisService;
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
@RequestMapping("/pais")
public class PaisController {
    @Autowired
    PaisService paisService;
    
    @GetMapping("/getAllEstatus/{estatus}")
    public ResponseEntity<List<PaisCTL>> getAllEscolaridades(@PathVariable("estatus") Integer estatus){
        List<PaisCTL> paisAux= paisService.getAllByEstatus(estatus);
        if(paisAux.isEmpty()){            
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(paisAux);
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(paisAux);
        }
    }
    
    @GetMapping("/getByKey/{key}")
    public ResponseEntity<List<PaisCTL>> getByKey(@PathVariable("key") String key){
        List<PaisCTL> paisAux= paisService.getByKey(key);
        if(paisAux.isEmpty()){            
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(paisAux);
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(paisAux);
        }
    }
}
