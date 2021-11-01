package com.felipe.helptech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.helptech.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
