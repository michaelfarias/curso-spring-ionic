package com.udemy.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.cursospring.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
