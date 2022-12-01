package com.example.demo.services;

import com.example.demo.dto.PersonneDto;
import com.example.demo.entities.Personne;
import com.example.demo.repositories.IPersonneRepo;
import com.example.demo.tools.DtoTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonneServiceImpl implements IPersonneService {

    @Autowired
    IPersonneRepo PersonneRepo;

    @Override
    public List<PersonneDto> findAll() {
        return PersonneRepo.findAll().stream()
                .map(personne -> DtoTools.convert(personne, PersonneDto.class)).collect(Collectors.toList());
    }

    @Override
    public PersonneDto saveOrUpdate(PersonneDto p) throws Exception{
        Personne epers = DtoTools.convert( p,Personne.class);

        if(Period.between(epers.getDateDeNaissance(),LocalDate.now()).getYears() < 150){
            epers = PersonneRepo.saveAndFlush(epers);
        }else{
            throw new Exception("personne de plus de 150 an");
        }

        return DtoTools.convert(epers,PersonneDto.class);
    }

    @Override
    public List<PersonneDto> findAllAlphaSorted() {
        return PersonneRepo.findAllByOrderByNomAsc().stream().
                map(personne -> DtoTools.convert(personne, PersonneDto.class)).collect(Collectors.toList());
    }

}
