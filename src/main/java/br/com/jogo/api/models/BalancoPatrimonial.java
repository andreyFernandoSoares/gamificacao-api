package br.com.jogo.api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BalancoPatrimonial {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	private Usuario usuario;
	
	private Float ativo;
	private Float passivo;
	
	private Float ativoCirculante;
	private Float passivoCirculante;
	
	private Float caixa;
	private Float fornecedores;
	
	private Float contasAReceber;
	private Float salarios;
	
	private Float estoque;
	private Float impostos;
	
	private Float ativoNaoCirculante;
	private Float aluguel;
	
	private Float imobilizados;
	private Float passivoNaoCirculante;
	
	private Float equipamentos;
	private Float financiamentos;
	
	private Float moveisUtensilios;
	private Float emprestimos;
	
	private Float veiculo;
	private Float patrimonioLiquido;
	
	private Float capitalSocial;
	
	public BalancoPatrimonial() {

	}

	public BalancoPatrimonial(Usuario usuario) {
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getAtivo() {
		return ativo;
	}

	public void setAtivo(Float ativo) {
		this.ativo = ativo;
	}

	public Float getPassivo() {
		return passivo;
	}

	public void setPassivo(Float passivo) {
		this.passivo = passivo;
	}

	public Float getAtivoCirculante() {
		return ativoCirculante;
	}

	public void setAtivoCirculante(Float ativoCirculante) {
		this.ativoCirculante = ativoCirculante;
	}

	public Float getPassivoCirculante() {
		return passivoCirculante;
	}

	public void setPassivoCirculante(Float passivoCirculante) {
		this.passivoCirculante = passivoCirculante;
	}

	public Float getCaixa() {
		return caixa;
	}

	public void setCaixa(Float caixa) {
		this.caixa = caixa;
	}

	public Float getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(Float fornecedores) {
		this.fornecedores = fornecedores;
	}

	public Float getContasAReceber() {
		return contasAReceber;
	}

	public void setContasAReceber(Float contasAReceber) {
		this.contasAReceber = contasAReceber;
	}

	public Float getSalarios() {
		return salarios;
	}

	public void setSalarios(Float salarios) {
		this.salarios = salarios;
	}

	public Float getEstoque() {
		return estoque;
	}

	public void setEstoque(Float estoque) {
		this.estoque = estoque;
	}

	public Float getImpostos() {
		return impostos;
	}

	public void setImpostos(Float impostos) {
		this.impostos = impostos;
	}

	public Float getAtivoNaoCirculante() {
		return ativoNaoCirculante;
	}

	public void setAtivoNaoCirculante(Float ativoNaoCirculante) {
		this.ativoNaoCirculante = ativoNaoCirculante;
	}

	public Float getAluguel() {
		return aluguel;
	}

	public void setAluguel(Float aluguel) {
		this.aluguel = aluguel;
	}

	public Float getImobilizados() {
		return imobilizados;
	}

	public void setImobilizados(Float imobilizados) {
		this.imobilizados = imobilizados;
	}

	public Float getPassivoNaoCirculante() {
		return passivoNaoCirculante;
	}

	public void setPassivoNaoCirculante(Float passivoNaoCirculante) {
		this.passivoNaoCirculante = passivoNaoCirculante;
	}

	public Float getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamentos(Float equipamentos) {
		this.equipamentos = equipamentos;
	}

	public Float getFinanciamentos() {
		return financiamentos;
	}

	public void setFinanciamentos(Float financiamentos) {
		this.financiamentos = financiamentos;
	}

	public Float getMoveisUtensilios() {
		return moveisUtensilios;
	}

	public void setMoveisUtensilios(Float moveisUtensilios) {
		this.moveisUtensilios = moveisUtensilios;
	}

	public Float getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(Float emprestimos) {
		this.emprestimos = emprestimos;
	}

	public Float getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Float veiculo) {
		this.veiculo = veiculo;
	}

	public Float getPatrimonioLiquido() {
		return patrimonioLiquido;
	}

	public void setPatrimonioLiquido(Float patrimonioLiquido) {
		this.patrimonioLiquido = patrimonioLiquido;
	}

	public Float getCapitalSocial() {
		return capitalSocial;
	}

	public void setCapitalSocial(Float capitalSocial) {
		this.capitalSocial = capitalSocial;
	}
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
