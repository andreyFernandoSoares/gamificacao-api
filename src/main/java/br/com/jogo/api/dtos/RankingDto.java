package br.com.jogo.api.dtos;

import br.com.jogo.api.models.Jogador;

public class RankingDto {
	
	private Long id;
	private Jogador jogador;
	private Float diferenca;
	
	public RankingDto() {}
	
	public RankingDto(Long id, Jogador jogador, Float diferenca) {
		this.id = id;
		this.jogador = jogador;
		this.setDiferenca(diferenca);
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

	public Float getDiferenca() {
		return diferenca;
	}

	public void setDiferenca(Float diferenca) {
		this.diferenca = diferenca;
	}
}
