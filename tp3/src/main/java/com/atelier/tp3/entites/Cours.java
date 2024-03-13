package com.atelier.tp3.entites;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Table(name = "Cours")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "title")
    private String titre ;
    @Column(name = "description")
    private String description;

    @OneToOne
    private Professeur professeur;

    @OneToMany(mappedBy = "cours")
    private Collection<Cours> cours_;
}
