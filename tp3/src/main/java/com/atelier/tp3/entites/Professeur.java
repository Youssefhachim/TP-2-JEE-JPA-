package com.atelier.tp3.entites;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Cours")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Professeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "name")
    private String nom;
    @Column(name = "affection date")
    private Date d_affectation;

    @OneToOne(mappedBy = "professeur")
    private Cours cours;
}
