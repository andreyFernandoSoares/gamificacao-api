package br.com.jogo.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jogo.api.services.RankingService;

@RestController
@RequestMapping("/ranking")
public class RankingController {
	
	@Autowired
	RankingService rankingService;
	
	@GetMapping
	public ResponseEntity<?> buscar() {
		return rankingService.buscar();
	}
}
