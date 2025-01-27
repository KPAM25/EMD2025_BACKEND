/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidadMedica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unidadMedica.entities.UnidadMedicaTBL;

/**
 *
 * @author kpam2
 */
public interface UnidadMedicaRepository extends JpaRepository<UnidadMedicaTBL, Long> {
    
}
