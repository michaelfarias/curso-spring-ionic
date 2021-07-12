package com.udemy.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.cursospring.domain.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
