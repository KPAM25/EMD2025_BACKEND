/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.catalogosDgis.controllers;

import com.alomora.emd2025.catalogosDgis.entities.EspecialidadesCTL;
import com.alomora.emd2025.catalogosDgis.services.EspecialidadesService;
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
@RequestMapping("/especialidades")
public class EspecialidadesController {
     @Autowired
     EspecialidadesService especialidadesService;
     
     @GetMapping("/getAllEstatus/{estatus}")
    public ResponseEntity<List<EspecialidadesCTL>> getAllEscolaridades(@PathVariable("estatus") Integer estatus){
        List<EspecialidadesCTL> rolesAux= especialidadesService.getAllByEstatus(estatus);
        if(rolesAux.isEmpty()){            
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(rolesAux);
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(rolesAux);
        }
    }
    
}
