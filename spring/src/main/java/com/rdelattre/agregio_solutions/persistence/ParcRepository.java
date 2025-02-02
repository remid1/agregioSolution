package com.rdelattre.agregio_solutions.persistence;

import com.rdelattre.agregio_solutions.domain.Parc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParcRepository extends JpaRepository<Parc, Long> {
}
