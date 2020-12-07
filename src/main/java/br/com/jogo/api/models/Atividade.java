package br.com.jogo.api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Atividade {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String descricao;
	private String passivo;
	private String ativo;
	private Float valor;
	private Float valorAPrazo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getPassivo() {
		return passivo;
	}
	public void setPassivo(String passivo) {
		this.passivo = passivo;
	}
	public String getAtivo() {
		return ativo;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public Float getValorAPrazo() {
		return valorAPrazo;
	}
	public void setValorAPrazo(Float valorAPrazo) {
		this.valorAPrazo = valorAPrazo;
	}
	@Override
	public String toString() {
		return "Atividade [id=" + id + ", descricao=" + descricao + ", passivo=" + passivo + ", ativo=" + ativo
				+ ", valor=" + valor + ", valorAPrazo=" + valorAPrazo + "]";
	}
}
