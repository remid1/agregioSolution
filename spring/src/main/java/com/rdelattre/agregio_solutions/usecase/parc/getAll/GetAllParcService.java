package com.rdelattre.agregio_solutions.usecase.parc.getAll;

import com.rdelattre.agregio_solutions.domain.Parc;
import com.rdelattre.agregio_solutions.persistence.ParcRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class GetAllParcService {
    ParcRepository parcRepository;
    public List<Parc> execute() {
        return parcRepository.findAll();
    }
}
