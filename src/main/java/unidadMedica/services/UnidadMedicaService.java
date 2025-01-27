package unidadMedica.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import unidadMedica.repositories.UnidadMedicaRepository;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kpam2
 */

@Transactional
@Service
public class UnidadMedicaService {
    
    @Autowired
    private UnidadMedicaRepository unidadMedicaRepository;
    
}
