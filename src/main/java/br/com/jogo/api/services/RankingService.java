package br.com.jogo.api.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.jogo.api.dtos.RankingDto;
import br.com.jogo.api.models.Ranking;
import br.com.jogo.api.repositories.RankingRepository;

@Service
public class RankingService {
	
	@Autowired
	RankingRepository rankingRepository;

	public ResponseEntity<?> buscar() {
		List<Ranking> ranking = rankingRepository.findAllByOrderByDiferencaAsc();
		
		if (ranking != null) {
			List<RankingDto> listaRankingDto = new LinkedList<>();
			
			for (Ranking rank : ranking) {
				RankingDto rankingDto = new RankingDto(rank.getId(), rank.getJogador(), rank.getDiferenca());
				listaRankingDto.add(rankingDto);
			}
			
			return ResponseEntity.ok(listaRankingDto);
		}
	
		return ResponseEntity.notFound().build();
	}
}
