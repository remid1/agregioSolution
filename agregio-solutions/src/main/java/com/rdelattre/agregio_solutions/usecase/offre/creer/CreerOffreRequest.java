package com.rdelattre.agregio_solutions.usecase.offre.creer;

import com.rdelattre.agregio_solutions.domain.BlocHoraire;
import com.rdelattre.agregio_solutions.domain.Marche;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class CreerOffreRequest {
    Marche marche;
    List<BlocHoraire> blockHoraires;
}
