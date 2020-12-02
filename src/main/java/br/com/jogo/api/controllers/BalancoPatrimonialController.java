package br.com.jogo.api.controllers;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jogo.api.models.BalancoPatrimonial;
import br.com.jogo.api.services.BalancoPatrimonialService;

@RestController
@RequestMapping("/balanco")
public class BalancoPatrimonialController {
	
	@Autowired
	BalancoPatrimonialService balancoService;
	
	@PutMapping
	@Transactional
	public ResponseEntity<?> alterar(@RequestBody @Valid BalancoPatrimonial form){
		return balancoService.alterar(form);
	}
	
	@GetMapping("/{id}")
	public BalancoPatrimonial buscarPorUsuarioId(@PathVariable Long id) {
		return balancoService.buscarPorUsuarioId(id);
	}
}
