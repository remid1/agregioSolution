package com.rdelattre.agregio_solutions.usecase.offre;

import com.rdelattre.agregio_solutions.domain.Offre;
import com.rdelattre.agregio_solutions.usecase.offre.creer.CreerOffreRequest;
import com.rdelattre.agregio_solutions.usecase.offre.creer.CreerOffreService;
import com.rdelattre.agregio_solutions.usecase.offre.getAll.GetAllOffreService;
import com.rdelattre.agregio_solutions.usecase.offre.getAll.OffreFilter;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("offres")
@AllArgsConstructor
public class OffreController {
    private CreerOffreService creerOffreService;
    private GetAllOffreService getAllOffreService;
    @PostMapping
    public Offre creer(@RequestBody CreerOffreRequest request) {
        return creerOffreService.execute(request);
    }

    @GetMapping
    public List<Offre> getAllOffer(OffreFilter filter) {
        return getAllOffreService.execute(filter);
    }
}
