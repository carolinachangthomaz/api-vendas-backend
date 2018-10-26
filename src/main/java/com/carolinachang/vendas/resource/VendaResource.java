package com.carolinachang.vendas.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carolinachang.vendas.model.Venda;
import com.carolinachang.vendas.repository.VendaRepository;
import com.carolinachang.vendas.service.VendaService;

@CrossOrigin("*")
@RestController
@RequestMapping("/vendas")
public class VendaResource {

	@Autowired
	private VendaRepository vendaRepository;
	
	@Autowired
	private VendaService vendaService;
	
	@GetMapping
	public List<Venda> listar(){
		return vendaRepository.findAll();
	}
	
	@PostMapping
	public Venda adicionar(@RequestBody @Valid Venda venda) {
		return vendaService.adicionar(venda);
	}
}
