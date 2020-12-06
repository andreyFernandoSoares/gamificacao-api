package br.com.jogo.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.jogo.api.models.Ranking;
import br.com.jogo.api.repositories.RankingRepository;

@Service
public class RankingService {
	
	@Autowired
	RankingRepository rankingRepository;

	public ResponseEntity<?> buscar() {
		List<Ranking> ranking = rankingRepository.findAllByOrderByResultadoLiquidoExercicioDesc();
		
		System.out.println(ranking);
		if (ranking != null) 
			return ResponseEntity.ok(ranking);
	
		return ResponseEntity.notFound().build();
	}
}
