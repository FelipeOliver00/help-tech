package com.felipe.helptech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.helptech.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
