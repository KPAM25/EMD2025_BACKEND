/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.emd.controllers;

import com.alomora.emd2025.emd.entities.PersonaTBL;
import com.alomora.emd2025.emd.services.PersonaService;
import jakarta.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kpam2
 */

@RestController
@RequestMapping("/persona")
public class PersonaController {
     @Autowired
    PersonaService personaService;
    
    @GetMapping("/getAllEstatus/{estatus}")
    public ResponseEntity<List<PersonaTBL>> getAll(@PathVariable("estatus") Integer estatus){
        List<PersonaTBL> personaAux= personaService.getAllByEstatus(estatus);
        if(personaAux.isEmpty()){            
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(personaAux);
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(personaAux);
        }
    }
    
    @GetMapping("/getByCurp/{curp}")
    public ResponseEntity<List<PersonaTBL>> getByKey(@PathVariable("curp") String curp){
        List<PersonaTBL> personaAux= personaService.getByCurp(curp);
        if(personaAux.isEmpty()){            
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(personaAux);
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(personaAux);
        }
    }
    
    @GetMapping("/getById/{idPersona}")
    public ResponseEntity<Optional<PersonaTBL>> getByKey(@PathVariable("idPersona") Long idPersona){
        Optional<PersonaTBL> personaAux= personaService.getById(idPersona);
        if(personaAux.isEmpty()){            
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(personaAux);
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(personaAux);
        }
    }
    
     @PostMapping("/create")
    public ResponseEntity<?> createPersona(@Valid @RequestBody PersonaTBL persona) {
        try {
            PersonaTBL nuevaPersona = personaService.createPersona(persona);
            return ResponseEntity.status(HttpStatus.CREATED).body(nuevaPersona);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    // Captura validaciones fallidas
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error -> 
            errors.put(error.getField(), error.getDefaultMessage()));
        return ResponseEntity.badRequest().body(errors);
    }
}
