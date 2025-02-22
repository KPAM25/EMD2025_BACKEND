/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.catalogosDgis.controllers;

import com.alomora.emd2025.catalogosDgis.entities.SexoCTL;
import com.alomora.emd2025.catalogosDgis.services.SexoService;
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
@RequestMapping("/sexo")
public class SexoController {
    @Autowired
    SexoService sexoService;
    
    @GetMapping("/getAllEstatus/{estatus}")
    public ResponseEntity<List<SexoCTL>> getAllEscolaridades(@PathVariable("estatus") Integer estatus){
        List<SexoCTL> sexoAux= sexoService.getAllByEstatus(estatus);
        if(sexoAux.isEmpty()){            
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(sexoAux);
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(sexoAux);
        }
    }
    
    @GetMapping("/getByKey/{key}")
    public ResponseEntity<List<SexoCTL>> getByKey(@PathVariable("key") String key){
        List<SexoCTL> sexoAux= sexoService.getByKey(key);
        if(sexoAux.isEmpty()){            
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(sexoAux);
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(sexoAux);
        }
    }
}
