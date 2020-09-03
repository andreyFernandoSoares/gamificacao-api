package br.com.jogo.api.controllers;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@PostMapping
	@Transactional
	public BalancoPatrimonial gravar(@RequestBody BalancoPatrimonial balanco) {
		return balancoService.gravar(balanco);
	}
}
