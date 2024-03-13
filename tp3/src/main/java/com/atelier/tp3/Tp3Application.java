package com.atelier.tp3;

import com.atelier.tp3.entites.Cours;
import com.atelier.tp3.entites.Etudiant;
import com.atelier.tp3.entites.Seance;
import com.atelier.tp3.repositories.CoursRepository;
import com.atelier.tp3.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp3Application  implements CommandLineRunner {
    //Create Product
    @Autowired
    private EtudiantRepository etudiantRepository ;
    private CoursRepository coursRepository;
    public static void main(String[] args) {
        SpringApplication.run(Tp3Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        Cours cours1 = new Cours(1,"Spring Boot","EXCELLENT COURS");

        coursRepository.save(cours1);
        /*Seance seance = new Etudiant(1,"pc1","ttt",1);
        etudiant.getId();
        etudiant.getNom();
        etudiant.getMatricule();
        etudiant.getSeances();
        Etudiant etudiant2 = new Etudiant();*/

        Etudiant etudiant = new Etudiant(1,"pc1","ttt",1);
        etudiant.getId();
        etudiant.getNom();
        etudiant.getMatricule();
        etudiant.getSeances();
        Etudiant etudiant2 = new Etudiant();
        etudiant2.setId(2);
        etudiant2.setNom("hachim youssef");
        etudiant2.setMatricule("matricule 2");
        etudiant2.setSeances(2);

        etudiantRepository.save(etudiant);
        etudiantRepository.save(etudiant2);

}
