package br.com.jogo.api.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jogo.api.models.Atividade;
import br.com.jogo.api.services.AtividadeService;

@RestController
@RequestMapping("/atividade")
public class AtividadeController {
	
	@Autowired
	AtividadeService atividadeService;
	
	@PostMapping
	@Transactional
	public Atividade gravar(@RequestBody Atividade atividade) {
		return atividadeService.gravar(atividade);
	}
	
	@GetMapping
	public List<Atividade> buscar() {
		return atividadeService.buscar();
	}
	
	@DeleteMapping
	@Transactional
	public ResponseEntity<?> deletar(@RequestBody List<Atividade> listaAtividades) {
		return atividadeService.deletar(listaAtividades);
	}

}
