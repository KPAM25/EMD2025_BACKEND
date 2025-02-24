/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.catalogosDgis.controllers;

import com.alomora.emd2025.catalogosDgis.entities.GeneroCTL;
import com.alomora.emd2025.catalogosDgis.services.GeneroService;
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
@RequestMapping("/genero")
public class GeneroController {
     @Autowired
    GeneroService generoService;
    
    @GetMapping("/getAllEstatus/{estatus}")
    public ResponseEntity<List<GeneroCTL>> getAllGeneros(@PathVariable("estatus") Integer estatus){
        List<GeneroCTL> generoAux= generoService.getAllByEstatus(estatus);
        if(generoAux.isEmpty()){            
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(generoAux);
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(generoAux);
        }
    }
    
    @GetMapping("/getByKey/{key}")
    public ResponseEntity<List<GeneroCTL>> getByKey(@PathVariable("key") Integer key){
        List<GeneroCTL> generoAux= generoService.getByKey(key);
        if(generoAux.isEmpty()){            
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(generoAux);
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(generoAux);
        }
    }
}
