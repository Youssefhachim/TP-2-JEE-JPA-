package com.atelier.tp3.repositories;

import com.atelier.tp3.entites.Cours;
import com.atelier.tp3.entites.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRepository extends JpaRepository<Cours, Integer> {

}
