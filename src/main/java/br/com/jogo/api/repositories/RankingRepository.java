package br.com.jogo.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jogo.api.models.Ranking;

@Repository
public interface RankingRepository extends JpaRepository<Ranking, Long> {
	
	public List<Ranking> findAllByOrderByDiferencaAsc();
}
