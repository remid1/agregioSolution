package com.rdelattre.agregio_solutions.usecase.offre.creer;

import com.rdelattre.agregio_solutions.domain.Offre;
import com.rdelattre.agregio_solutions.persistence.OffreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CreerOffreService {
    private OffreRepository offreRepository;

    public Offre execute(CreerOffreRequest request) {
        return offreRepository.save(new Offre(null, request.getMarche(), request.getBlockHoraires()));
    }

}
