package com.rdelattre.agregio_solutions.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class Parc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String name;

    ParcType type;
}
