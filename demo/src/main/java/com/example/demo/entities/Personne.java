package com.example.demo.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Personne {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;


        private String nom;

        private String prenom;

    @Column(nullable = false, columnDefinition="DATE")
    private LocalDate DateDeNaissance;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateDeNaissance() {
        return DateDeNaissance;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        DateDeNaissance = dateDeNaissance;
    }
}
