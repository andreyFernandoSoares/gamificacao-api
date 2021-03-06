package br.com.jogo.api.models;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Sala {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String codigo;
	
	@OneToOne
	private Usuario usuario;
	
	@OneToMany
	private List<Jogador> listaJogadores;
	
	@OneToMany
	private List<Atividade> listaAtividades;
	
	private Integer ativa;
	
	private LocalDateTime validade;
	
	public Sala() {}

	public Sala(String codigo, Usuario usuario, List<Atividade> atividades, LocalDateTime validade) {
		this.codigo = codigo;
		this.usuario = usuario;
		this.listaAtividades = atividades;
		this.ativa = 1;
		this.validade = validade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Jogador> getListaJogadores() {
		return listaJogadores;
	}

	public void setListaJogadores(List<Jogador> listaJogadores) {
		this.listaJogadores = listaJogadores;
	}

	public List<Atividade> getListaAtividades() {
		return listaAtividades;
	}

	public void setListaAtividades(List<Atividade> listaAtividades) {
		this.listaAtividades = listaAtividades;
	}
	
	public Integer getAtiva() {
		return ativa;
	}

	public void setAtiva(Integer ativa) {
		this.ativa = ativa;
	}

	public LocalDateTime getValidade() {
		return validade;
	}

	public void setValidade(LocalDateTime validade) {
		this.validade = validade;
	}

	@Override
	public String toString() {
		return "Sala [id=" + id + ", codigo=" + codigo + ", usuario=" + usuario + ", listaJogadores=" + listaJogadores
				+ ", listaAtividades=" + listaAtividades + "]";
	}
}
