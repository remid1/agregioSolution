package com.rdelattre.agregio_solutions.usecase.offre.getAll;

import com.rdelattre.agregio_solutions.domain.Offre;
import com.rdelattre.agregio_solutions.persistence.OffreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class GetAllOffreService {
    OffreRepository repository;

    public List<Offre> execute(OffreFilter filter) {
        if(filter.marche() != null) {
            return repository.findAllByMarche(filter.marche());
        }
        return repository.findAll();
    }
}
