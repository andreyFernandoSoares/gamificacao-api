package br.com.jogo.api.controllers;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jogo.api.services.SalaService;

@RestController
@RequestMapping("/sala")
public class SalaController {
	
	@Autowired
	SalaService salaService;
	
	@PostMapping("/{usuarioId}")
	@Transactional
	public ResponseEntity<?> gravar(@PathVariable Long usuarioId) {
		return salaService.gravar(usuarioId);
	}
	
	@GetMapping("/{usuarioId}")
	public ResponseEntity<?> buscarPorUsuarioId(@PathVariable Long usuarioId) {
		return salaService.buscarPorUsuarioId(usuarioId);
	}
}
