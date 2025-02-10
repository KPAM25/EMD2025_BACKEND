/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.catalogos.controllers;

import com.alomora.emd2025.catalogos.entities.TiposSangreCTL;
import com.alomora.emd2025.catalogos.services.TiposSangreService;
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
@RequestMapping("/tiposSangre")
public class TiposSangreController {
    @Autowired
    TiposSangreService tiposSangreService;
    
    @GetMapping("/getAllEstatus/{estatus}")
    public ResponseEntity<List<TiposSangreCTL>> getAllEscolaridades(@PathVariable("estatus") Integer estatus){
        List<TiposSangreCTL> tiposSangresAux= tiposSangreService.getAllByEstatus(estatus);
        if(tiposSangresAux.isEmpty()){            
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(tiposSangresAux);
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(tiposSangresAux);
        }
    }
    
}
