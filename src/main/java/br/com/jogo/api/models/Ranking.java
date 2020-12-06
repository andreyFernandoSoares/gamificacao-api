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
	
	@OneToOne
	private Sala sala;
	
	private Float resultadoLiquidoExercicio;
	
	public Ranking () {}
	
	public Ranking(Jogador jogador, Float resultadoLiquidoExercicio, Sala sala) {
		this.jogador = jogador;
		this.resultadoLiquidoExercicio = resultadoLiquidoExercicio;
		this.sala = sala;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getResultadoLiquidoExercicio() {
		return resultadoLiquidoExercicio;
	}

	public void setResultadoLiquidoExercicio(Float resultadoLiquidoExercicio) {
		this.resultadoLiquidoExercicio = resultadoLiquidoExercicio;
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

	@Override
	public String toString() {
		return "Ranking [id=" + id + ", jogador=" + jogador + ", sala=" + sala + ", resultadoLiquidoExercicio="
				+ resultadoLiquidoExercicio + "]";
	}
}
