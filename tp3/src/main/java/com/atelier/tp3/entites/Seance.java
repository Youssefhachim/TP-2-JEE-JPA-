package com.atelier.tp3.entites;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "Seance")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "date")
    private Date _date;
    @Column(name = "start date")
    private Date h_date;
    @Column(name = "end date")
    private Date h_fin;

    @ManyToOne
    private Cours cours;

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Etudiant> etudiant = new ArrayList<>();



}
