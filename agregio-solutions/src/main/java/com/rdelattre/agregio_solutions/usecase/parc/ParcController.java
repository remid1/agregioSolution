package com.rdelattre.agregio_solutions.usecase.parc;

import com.rdelattre.agregio_solutions.domain.Parc;
import com.rdelattre.agregio_solutions.usecase.parc.creer.CreerParcService;
import com.rdelattre.agregio_solutions.usecase.parc.creer.ParcRequest;
import com.rdelattre.agregio_solutions.usecase.parc.getAll.GetAllParcService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("parcs")
@AllArgsConstructor
public class ParcController {
    private final CreerParcService creerParcService;
    private final GetAllParcService getAllParcService;

    @PostMapping
    public Parc creerParc(@RequestBody ParcRequest request) {
        return creerParcService.execute(request);
    }

    @GetMapping
    public List<Parc> getAllParc() {
        return getAllParcService.execute();
    }
}
