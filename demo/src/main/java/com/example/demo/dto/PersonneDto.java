package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

public class PersonneDto {

    private long id;


    private String nom;

    private String prenom;

    private String DateDeNaissance;

    public String getDateDeNaissance() {
        return DateDeNaissance;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        DateDeNaissance = dateDeNaissance;
    }

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
}
