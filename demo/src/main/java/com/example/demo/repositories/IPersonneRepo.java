package com.example.demo.repositories;

import com.example.demo.entities.Personne;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPersonneRepo extends JpaRepository<Personne,String> {


    List<Personne> findAllByOrderByNomAsc();
}
