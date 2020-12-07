package br.com.jogo.api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ranking {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	private Jogador jogador;
	
	private Float diferenca;
	
	@OneToOne
	private Sala sala;
	
	public Ranking () {}
	
	public Ranking(Jogador jogador, Sala sala, Float diferenca) {
		this.jogador = jogador;
		this.sala = sala;
		this.diferenca = diferenca;
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

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Float getDiferenca() {
		return diferenca;
	}

	public void setDiferenca(Float diferenca) {
		this.diferenca = diferenca;
	}

	@Override
	public String toString() {
		return "Ranking [id=" + id + ", jogador=" + jogador + ", diferenca=" + diferenca + ", sala=" + sala + "]";
	}
}
