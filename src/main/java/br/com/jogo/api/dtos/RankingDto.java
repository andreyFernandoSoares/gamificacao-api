package br.com.jogo.api.dtos;

import br.com.jogo.api.models.Jogador;

public class RankingDto {
	
	private Long id;
	private Jogador jogador;
	private Integer pontos;
	
	public RankingDto() {}
	
	public RankingDto(Long id, Jogador jogador, Integer pontos) {
		this.id = id;
		this.jogador = jogador;
		this.pontos = pontos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public Integer getPontos() {
		return pontos;
	}

	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}
}
