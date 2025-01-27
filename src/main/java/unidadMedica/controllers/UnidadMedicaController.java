/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidadMedica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unidadMedica.services.UnidadMedicaService;

/**
 *
 * @author kpam2
 */

@RequestMapping("/unidadMedica")
@RestController
public class UnidadMedicaController {
    
    @Autowired
    private UnidadMedicaService unidadMedicaService;
    
}
