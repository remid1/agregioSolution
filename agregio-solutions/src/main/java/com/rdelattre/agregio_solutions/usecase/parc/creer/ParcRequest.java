package com.rdelattre.agregio_solutions.usecase.parc.creer;

import com.rdelattre.agregio_solutions.domain.ParcType;
import lombok.Value;


@Value
public class ParcRequest {
    String name;

    ParcType type;
}
