package br.com.jogo.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jogo.api.models.BalancoPatrimonial;
import br.com.jogo.api.repositories.BalancoPatrimonialRepository;

@Service
public class BalancoPatrimonialService {
	
	@Autowired
	BalancoPatrimonialRepository balancoRepository;

	public BalancoPatrimonial gravar(BalancoPatrimonial balanco) {
		return balancoRepository.save(balanco);
	}
}
