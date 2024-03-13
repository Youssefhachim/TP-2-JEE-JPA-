package com.atelier.tp1_couplage_fort_couplage_faible.dao;

import java.util.List;

public interface IEtudiant {

    public Etudiant addEtudiant(Etudiant etudiant);

    public List<Etudiant> getAllEtudiants();
}
