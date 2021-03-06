package br.com.jogo.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.jogo.api.models.BalancoPatrimonial;
import br.com.jogo.api.models.Usuario;
import br.com.jogo.api.repositories.BalancoPatrimonialRepository;
import br.com.jogo.api.repositories.UsuarioRepository;

@Service
public class BalancoPatrimonialService {
	
	@Autowired
	BalancoPatrimonialRepository balancoRepository;
	
	@Autowired
	UsuarioRepository usuarioRepository;

	public ResponseEntity<?> alterar(BalancoPatrimonial form) {
		BalancoPatrimonial balanco = balancoRepository.save(form);
		if (balanco != null) 
			return ResponseEntity.ok().build();
		else
			return ResponseEntity.notFound().build();
	}

	public BalancoPatrimonial buscarPorUsuarioId(Long id) {
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		
		if (usuario.isPresent()) {
			return usuario.get().getBalacoPatrimonial();
		}
			
		return null;
	}
}
