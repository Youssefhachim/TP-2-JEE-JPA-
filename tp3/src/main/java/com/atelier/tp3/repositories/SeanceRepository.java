package com.atelier.tp3.repositories;

import com.atelier.tp3.entites.Etudiant;
import com.atelier.tp3.entites.Seance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeanceRepository extends JpaRepository<Seance, Integer> {

}
