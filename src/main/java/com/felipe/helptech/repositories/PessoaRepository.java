package com.felipe.helptech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.helptech.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
