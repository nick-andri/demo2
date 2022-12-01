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

    @Column(nullable = false, columnDefinition="DATE")
    private LocalDate DateDeNaissance;

}
