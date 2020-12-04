package br.com.jogo.api.controllers;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jogo.api.dtos.AtividadeDto;
import br.com.jogo.api.models.Jogador;
import br.com.jogo.api.services.JogadorService;

@RestController
@RequestMapping("/jogador")
public class JogadorController {
	
	@Autowired
	private JogadorService jogadorService;
	
	@PostMapping
	@Transactional
	public ResponseEntity<?> gravar(@RequestBody Jogador jogador) {
		return jogadorService.gravar(jogador);
	}
	
	@GetMapping("/{jogadorId}")
	public ResponseEntity<?> buscarBalanco(@PathVariable Long jogadorId) {
		return jogadorService.buscarBalanco(jogadorId);
	}
	
	@PutMapping("/{jogadorId}")
	public ResponseEntity<?> alteraBalanco(@PathVariable Long jogadorId, @RequestBody AtividadeDto atividadeDto) {
		return jogadorService.alteraBalanco(jogadorId, atividadeDto);
	}
}
