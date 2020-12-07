package br.com.jogo.api.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Jogador {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BalancoPatrimonial balanco;
	
	private String codigo;
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public BalancoPatrimonial getBalanco() {
		return balanco;
	}

	public void setBalanco(BalancoPatrimonial balanco) {
		this.balanco = balanco;
	}
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Jogador [id=" + id + ", balanco=" + balanco + ", codigo=" + codigo + ", nome=" + nome
				+ "]";
	}
}
