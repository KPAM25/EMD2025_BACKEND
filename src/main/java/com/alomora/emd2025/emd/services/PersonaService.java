/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alomora.emd2025.emd.services;

import com.alomora.emd2025.catalogosDgis.entities.EntidadCTL;
import com.alomora.emd2025.catalogosDgis.entities.PaisCTL;
import com.alomora.emd2025.catalogosDgis.entities.SexoCTL;
import com.alomora.emd2025.catalogosDgis.repositories.EntidadRepository;
import com.alomora.emd2025.catalogosDgis.repositories.PaisRepository;
import com.alomora.emd2025.catalogosDgis.repositories.SexoRepository;
import com.alomora.emd2025.emd.entities.PersonaTBL;
import com.alomora.emd2025.emd.repositories.PersonaRepository;
import jakarta.transaction.Transactional;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author kpam2
 */
@Transactional
@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;
    @Autowired
    SexoRepository sexoRepository;
    @Autowired
    PaisRepository paisRepository;
    @Autowired
    EntidadRepository entidadRepository;

    public List<PersonaTBL> getAllByEstatus(Integer estatus) {
        return (List<PersonaTBL>) this.personaRepository.getAllByEstatus(estatus);
    }

    public List<PersonaTBL> getByCurp(String curp) {
        return (List<PersonaTBL>) this.personaRepository.getByCurp(curp);
    }

    public Optional<PersonaTBL> getById(Long idPersona) {
        return this.personaRepository.findById(idPersona);
    }

    public PersonaTBL createPersona(PersonaTBL persona) throws Exception {
        // Verificar si la CURP ya existe
        List<PersonaTBL> existente = personaRepository.getByCurp(persona.getCurpPersona());
        if (!existente.isEmpty()) {
            throw new Exception("La CURP ya está registrada.");
        }
        SexoCTL sexo = sexoRepository.getByKey(persona.getFkSexoCurp().getCatalogKey()).get(0);

        PaisCTL pais = paisRepository.findById(persona.getFkPaisNac().getIdPais())
                .orElseThrow(() -> new RuntimeException("País no encontrado"));

        EntidadCTL entidad = entidadRepository.getByKey(persona.getFkEntidadNac().getCatalogKey()).get(0);
        // Registrar fecha y hora actual
        persona.setFechaRegistro(LocalDate.now());
        persona.setHoraRegistro(LocalTime.now());
        //
        persona.setFkSexoCurp(sexo);
        persona.setFkPaisNac(pais);
        persona.setFkEntidadNac(entidad);

        return personaRepository.save(persona);
    }

}
