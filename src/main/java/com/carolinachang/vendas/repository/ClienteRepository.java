package com.carolinachang.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carolinachang.vendas.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
