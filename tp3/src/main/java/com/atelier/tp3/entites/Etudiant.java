package com.atelier.tp3.entites;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "Etudiant")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    @Column(name = "name")
    private String nom;
    @Column(name = "matricule")
    private String matricule;

    @ManyToMany(mappedBy = "etudiant", fetch = FetchType.EAGER)
    private Collection<Seance> seances = new ArrayList<>();
}
