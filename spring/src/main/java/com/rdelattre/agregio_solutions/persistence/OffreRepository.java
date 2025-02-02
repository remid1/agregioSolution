package com.rdelattre.agregio_solutions.persistence;

import com.rdelattre.agregio_solutions.domain.Marche;
import com.rdelattre.agregio_solutions.domain.Offre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OffreRepository extends JpaRepository<Offre, Long> {
    List<Offre> findAllByMarche(Marche marche);
}
