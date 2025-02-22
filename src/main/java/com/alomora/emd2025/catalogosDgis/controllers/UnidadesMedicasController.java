/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.catalogosDgis.controllers;

import com.alomora.emd2025.catalogosDgis.entities.UnidadesMedicasCTL;
import com.alomora.emd2025.catalogosDgis.services.UnidadesMedicasService;
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
@RequestMapping("/unidadesMedicas")
public class UnidadesMedicasController {
    @Autowired
    UnidadesMedicasService unidadesMedicasService;
    
    @GetMapping("/getAllEstatus/{estatus}")
    public ResponseEntity<List<UnidadesMedicasCTL>> getAllEscolaridades(@PathVariable("estatus") Integer estatus){
        List<UnidadesMedicasCTL> unidadAux= unidadesMedicasService.getAllByEstatus(estatus);
        if(unidadAux.isEmpty()){            
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(unidadAux);
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(unidadAux);
        }
    }
    
    @GetMapping("/getByClues/{clues}")
    public ResponseEntity<List<UnidadesMedicasCTL>> getByClues(@PathVariable("clues") String clues){
        List<UnidadesMedicasCTL> unidadAux= unidadesMedicasService.getByClues(clues);
        if(unidadAux.isEmpty()){            
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(unidadAux);
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(unidadAux);
        }
    }
}
