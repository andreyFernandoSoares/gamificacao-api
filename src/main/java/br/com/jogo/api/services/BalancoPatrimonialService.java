package br.com.jogo.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.jogo.api.models.BalancoPatrimonial;
import br.com.jogo.api.repositories.BalancoPatrimonialRepository;

@Service
public class BalancoPatrimonialService {
	
	@Autowired
	BalancoPatrimonialRepository balancoRepository;

	public ResponseEntity<?> alterar(BalancoPatrimonial form) {
		BalancoPatrimonial balanco = balancoRepository.save(form);
		if (balanco != null) 
			return ResponseEntity.ok().build();
		else
			return ResponseEntity.notFound().build();
	}

	public BalancoPatrimonial buscarPorUsuarioId(Long id) {
		return balancoRepository.findAll().get(0);
	}
}
