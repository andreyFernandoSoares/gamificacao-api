package br.com.jogo.api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dre {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	//------------------------------------- ATIVO -----------------------------------------------//
	
	/**
	 * Circulante
	 */
	
	//Disponivel
	Double totalDisponivel;
	Double bancosComMovimento;
	
	//Creditos
	Double dublicatasReceber;
	Double duplicatasDescontadas;
	Double addFornecedor;
	Double adEmpregados;
	Double adSocios;
	Double mercadorias;
	Double materiaPrima;
	Double produtosAcabados;
	
	/**
	 * Não Circulante
	 */
	
	Double emprestimos;
	Double investimentos;
	Double dispesasAntecipadas;
	
	//Imobilizado
	Double imovel;
	Double moveisUtencilios;
	Double instalacoes;
	
	//-------------------------------------- PASSIVO ------------------------------------------------------//
	
	/**
	 * Circulante
	 */
	
	Double fornecedores;
	Double obrigacoesFiscais;
	Double outrasContas;
	
	/**
	 * Não Circulante
	 */
	
	Double fornecedoresAPagar;
	Double emprestimosBancarios;
	Double financiamentosAPagar;
	
	//Patrimonio Liquido
	Double capitalSocial;
	Double lucro;
	Double prejuizosAcumilados;
	
	Dre(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Double getTotalDisponivel() {
		return totalDisponivel;
	}
	
	public void setTotalDisponivel(Double totalDisponivel) {
		this.totalDisponivel = totalDisponivel;
	}
	
	public Double getBancosComMovimento() {
		return bancosComMovimento;
	}
	
	public void setBancosComMovimento(Double bancosComMovimento) {
		this.bancosComMovimento = bancosComMovimento;
	}
	
	public Double getDublicatasReceber() {
		return dublicatasReceber;
	}
	
	public void setDublicatasReceber(Double dublicatasReceber) {
		this.dublicatasReceber = dublicatasReceber;
	}
	
	public Double getDuplicatasDescontadas() {
		return duplicatasDescontadas;
	}
	
	public void setDuplicatasDescontadas(Double duplicatasDescontadas) {
		this.duplicatasDescontadas = duplicatasDescontadas;
	}
	
	public Double getAddFornecedor() {
		return addFornecedor;
	}
	
	public void setAddFornecedor(Double addFornecedor) {
		this.addFornecedor = addFornecedor;
	}
	
	public Double getAdEmpregados() {
		return adEmpregados;
	}
	
	public void setAdEmpregados(Double adEmpregados) {
		this.adEmpregados = adEmpregados;
	}
	
	public Double getAdSocios() {
		return adSocios;
	}
	
	public void setAdSocios(Double adSocios) {
		this.adSocios = adSocios;
	}
	
	public Double getMercadorias() {
		return mercadorias;
	}
	
	public void setMercadorias(Double mercadorias) {
		this.mercadorias = mercadorias;
	}
	
	public Double getMateriaPrima() {
		return materiaPrima;
	}
	
	public void setMateriaPrima(Double materiaPrima) {
		this.materiaPrima = materiaPrima;
	}
	
	public Double getProdutosAcabados() {
		return produtosAcabados;
	}
	
	public void setProdutosAcabados(Double produtosAcabados) {
		this.produtosAcabados = produtosAcabados;
	}
	
	public Double getEmprestimos() {
		return emprestimos;
	}
	
	public void setEmprestimos(Double emprestimos) {
		this.emprestimos = emprestimos;
	}
	
	public Double getInvestimentos() {
		return investimentos;
	}
	
	public void setInvestimentos(Double investimentos) {
		this.investimentos = investimentos;
	}
	
	public Double getDispesasAntecipadas() {
		return dispesasAntecipadas;
	}
	
	public void setDispesasAntecipadas(Double dispesasAntecipadas) {
		this.dispesasAntecipadas = dispesasAntecipadas;
	}
	
	public Double getImovel() {
		return imovel;
	}
	
	public void setImovel(Double imovel) {
		this.imovel = imovel;
	}
	
	public Double getMoveisUtencilios() {
		return moveisUtencilios;
	}
	
	public void setMoveisUtencilios(Double moveisUtencilios) {
		this.moveisUtencilios = moveisUtencilios;
	}
	
	public Double getInstalacoes() {
		return instalacoes;
	}
	
	public void setInstalacoes(Double instalacoes) {
		this.instalacoes = instalacoes;
	}
	
	public Double getFornecedores() {
		return fornecedores;
	}
	
	public void setFornecedores(Double fornecedores) {
		this.fornecedores = fornecedores;
	}
	
	public Double getObrigacoesFiscais() {
		return obrigacoesFiscais;
	}
	
	public void setObrigacoesFiscais(Double obrigacoesFiscais) {
		this.obrigacoesFiscais = obrigacoesFiscais;
	}
	
	public Double getOutrasContas() {
		return outrasContas;
	}
	
	public void setOutrasContas(Double outrasContas) {
		this.outrasContas = outrasContas;
	}
	
	public Double getFornecedoresAPagar() {
		return fornecedoresAPagar;
	}
	
	public void setFornecedoresAPagar(Double fornecedoresAPagar) {
		this.fornecedoresAPagar = fornecedoresAPagar;
	}
	
	public Double getEmprestimosBancarios() {
		return emprestimosBancarios;
	}
	
	public void setEmprestimosBancarios(Double emprestimosBancarios) {
		this.emprestimosBancarios = emprestimosBancarios;
	}
	
	public Double getFinanciamentosAPagar() {
		return financiamentosAPagar;
	}
	
	public void setFinanciamentosAPagar(Double financiamentosAPagar) {
		this.financiamentosAPagar = financiamentosAPagar;
	}
	
	public Double getCapitalSocial() {
		return capitalSocial;
	}
	
	public void setCapitalSocial(Double capitalSocial) {
		this.capitalSocial = capitalSocial;
	}
	
	public Double getLucro() {
		return lucro;
	}
	
	public void setLucro(Double lucro) {
		this.lucro = lucro;
	}
	
	public Double getPrejuizosAcumilados() {
		return prejuizosAcumilados;
	}
	
	public void setPrejuizosAcumilados(Double prejuizosAcumilados) {
		this.prejuizosAcumilados = prejuizosAcumilados;
	}
}
