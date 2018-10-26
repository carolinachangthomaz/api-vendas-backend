package com.carolinachang.vendas.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carolinachang.vendas.model.Venda;
import com.carolinachang.vendas.repository.ProdutoRepository;
import com.carolinachang.vendas.repository.VendaRepository;

@Service
public class VendaService {

	@Autowired
	private VendaRepository vendaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	
	public Venda adicionar(Venda venda) {
		venda.setCadastro(LocalDateTime.now());
		venda.getItens().forEach(i -> {
			i.setVenda(venda);
			i.setProduto(produtoRepository.findById(i.getProduto().getId()).get());
		});
		
		BigDecimal totalItens = venda.getItens().stream()
				.map(i -> i.getProduto().getValor().multiply(new BigDecimal(i.getQuantidade())))
				.reduce(BigDecimal.ZERO, BigDecimal :: add);
		
		venda.setTotal(totalItens.add(venda.getFrete()));
		return vendaRepository.save(venda);
	}
}
