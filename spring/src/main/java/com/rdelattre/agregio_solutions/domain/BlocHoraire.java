package com.rdelattre.agregio_solutions.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BlocHoraire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    LocalDateTime dateDebut;
    LocalDateTime dateFin;
    int quantiteEnergieProduiteMW;
    float prixPlancherEuro;

   // List<ProductionElectriciteHistorique> productionElectriciteHistoriques;
}


