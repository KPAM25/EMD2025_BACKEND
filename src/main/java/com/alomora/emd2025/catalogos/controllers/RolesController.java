/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.catalogos.controllers;

import com.alomora.emd2025.catalogos.entities.RolesCTL;
import com.alomora.emd2025.catalogos.services.RolesService;
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
@RequestMapping("/roles")
public class RolesController {
    @Autowired
    RolesService rolesService;
    
    @GetMapping("/getAllEstatus/{estatus}")
    public ResponseEntity<List<RolesCTL>> getAllEscolaridades(@PathVariable("estatus") Integer estatus){
        List<RolesCTL> rolesAux= rolesService.getAllByEstatus(estatus);
        if(rolesAux.isEmpty()){            
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(rolesAux);
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(rolesAux);
        }
    }
}
