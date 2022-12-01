package com.example.demo.controllers;

import com.example.demo.dto.PersonneDto;

import com.example.demo.services.IPersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personne")
public class PersonneCtrl {

    @Autowired
    private IPersonneService personneService;

    @GetMapping(produces = "application/json")
    public List<PersonneDto> findAll() {

        return personneService.findAll();
    }

    @GetMapping(value = "sorted", produces = "application/json")
    public List<PersonneDto> findAllSorted() {
        return personneService.findAllAlphaSorted();
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<PersonneDto> save(@RequestBody PersonneDto pDto) throws Exception {

        PersonneDto personneDtoResult = personneService.saveOrUpdate(pDto);

        return ResponseEntity
                .status(HttpStatus.CREATED).body(personneDtoResult);
    }
}
