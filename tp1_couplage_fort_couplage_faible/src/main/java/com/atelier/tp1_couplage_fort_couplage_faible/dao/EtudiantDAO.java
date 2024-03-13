package com.atelier.tp1_couplage_fort_couplage_faible.dao;

import java.util.ArrayList;
import java.util.List;

public class EtudiantDAO {

    List<Etudiant> etudiantList=new ArrayList<>();


    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiantList.add(etudiant);
        return etudiant;
    }
}
