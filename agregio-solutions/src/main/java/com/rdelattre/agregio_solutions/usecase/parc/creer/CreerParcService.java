package com.rdelattre.agregio_solutions.usecase.parc.creer;

import com.rdelattre.agregio_solutions.domain.Parc;
import com.rdelattre.agregio_solutions.persistence.ParcRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreerParcService {
    private final ParcRepository parcRepository;

    public Parc execute(ParcRequest request) {
        return parcRepository.save(
                new Parc(0L, request.getName(), request.getType())
        );
    }
}
