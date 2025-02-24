/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.catalogosDgis.controllers;

import com.alomora.emd2025.catalogosDgis.entities.EntidadCTL;
import com.alomora.emd2025.catalogosDgis.services.EntidadServive;
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
@RequestMapping("/entidad")
public class EntidadController {
     @Autowired
    EntidadServive entidadServive;
    
    @GetMapping("/getAllEstatus/{estatus}")
    public ResponseEntity<List<EntidadCTL>> getAllEscolaridades(@PathVariable("estatus") Integer estatus){
        List<EntidadCTL> entidadAux= entidadServive.getAllByEstatus(estatus);
        if(entidadAux.isEmpty()){            
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(entidadAux);
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(entidadAux);
        }
    }
    
    @GetMapping("/getByKey/{key}")
    public ResponseEntity<List<EntidadCTL>> getByKey(@PathVariable("key") String key){
        List<EntidadCTL> entidadAux= entidadServive.getByKey(key);
        if(entidadAux.isEmpty()){            
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(entidadAux);
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(entidadAux);
        }
    }
    
    @GetMapping("/getByPais/{fkPais}")
    public ResponseEntity<List<EntidadCTL>> getByPais(@PathVariable("fkPais") Long fkPais){
        List<EntidadCTL> entidadAux= entidadServive.getByPais(fkPais);
        if(entidadAux.isEmpty()){            
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(entidadAux);
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(entidadAux);
        }
    }
}
