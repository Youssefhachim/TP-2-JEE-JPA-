package com.atelier.tp1_couplage_fort_couplage_faible.dao;

public class Etudiant {
    private int id;

    private String nom;

    private String prenoom;

    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenoom() {
        return prenoom;
    }

    public void setPrenoom(String prenoom) {
        this.prenoom = prenoom;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenoom='" + prenoom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Etudiant() {
    }

    public Etudiant(int id, String nom, String prenoom, String email) {
        this.id = id;
        this.nom = nom;
        this.prenoom = prenoom;
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
