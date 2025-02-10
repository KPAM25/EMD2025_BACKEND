package com.alomora.emd2025.catalogos.services;


import com.alomora.emd2025.catalogos.entities.RolesCTL;
import com.alomora.emd2025.catalogos.repositories.RolesRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class RolesService {
    @Autowired
    RolesRepository rolesRepository;
    
    
    public List<RolesCTL> getAllByEstatus(Integer estatus){
        return (List<RolesCTL>)this.rolesRepository.getAllByEstatus(estatus);
    }
}
