package com.carolinachang.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carolinachang.vendas.model.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long> {

}
