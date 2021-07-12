package com.udemy.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.cursospring.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
