package com.example.demo.services;

import com.example.demo.dto.PersonneDto;
import com.example.demo.entities.Personne;

import java.util.List;

public interface IPersonneService {

    List<PersonneDto> findAll();
    PersonneDto saveOrUpdate(PersonneDto p) throws Exception;
    List<PersonneDto> findAllAlphaSorted();
}
