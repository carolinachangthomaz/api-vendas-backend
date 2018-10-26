package com.carolinachang.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carolinachang.vendas.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
