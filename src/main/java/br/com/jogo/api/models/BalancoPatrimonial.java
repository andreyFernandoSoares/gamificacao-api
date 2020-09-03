package br.com.jogo.api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BalancoPatrimonial {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomeAluno;
	
	private String token;
	
	//Ativo
	private Double ativo;
	private Double ativoCirculante;
	private Double disponibilidade;
	
	//Caixa
	private Double totalCaixas;
	private Double caixa;
	private Double bancoBrasil;
	
	//Aplicaçoes financeiras
	private Double totalAplicacoes;
	private Double aplicacoesBancoBrasil;
	
	//Créditos
	private Double creditos;
	private Double clientes;
	private Double totalEstoque;
	private Double estoqueMercadoria;
	private Double estoqueMaterialExp;
	
	//Ativo não circulante
	private Double ativoNCirculante;
	private Double totalImobilizado;
	private Double imobilizado;
	private Double equipInformatica;
	private Double moveisUtensilios;
	
	private Double depreciacaoAcumulada;
	private Double dpEquipInformatica;
	private Double dpMoveisUtensilios;
	
	//Passivo
	private Double passivo;
	private Double passivoCirculante;
	private Double totalfornecedores;
	private Double outrasContas;
	
	//Obrigações sociais
	private Double obrigacoesSociais;
	private Double salarioAPagar;
	private Double feriasAPagar;
	private Double decimoTerceiroSalario;
	
	//Encargos Sociais
	private Double encargosSociais;
	private Double inssAPagar;
	private Double fgtsAPagar;
	private Double irrfAPagar;
	
	//Impostos a pagar
	private Double impostosAPagar;
	private Double simplesNacional;
	
	//Provisões
	private Double provisaoDeDecimoTerceiro;
	private Double provisaoFerias;
	private Double provisaoFGTS;
	
	//Emprestimos
	private Double emprestimosAPagar;
	private Double emprestimoBancoBrasil;
	private Double patrimonioLiquido;
	private Double capitalIntegralizado;
	private Double resultadoDoExercicio;
	public Double getAtivo() {
		return ativo;
	}
	public void setAtivo(Double ativo) {
		this.ativo = ativo;
	}
	public Double getAtivoCirculante() {
		return ativoCirculante;
	}
	public void setAtivoCirculante(Double ativoCirculante) {
		this.ativoCirculante = ativoCirculante;
	}
	public Double getDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(Double disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	public Double getTotalCaixas() {
		return totalCaixas;
	}
	public void setTotalCaixas(Double totalCaixas) {
		this.totalCaixas = totalCaixas;
	}
	public Double getCaixa() {
		return caixa;
	}
	public void setCaixa(Double caixa) {
		this.caixa = caixa;
	}
	public Double getBancoBrasil() {
		return bancoBrasil;
	}
	public void setBancoBrasil(Double bancoBrasil) {
		this.bancoBrasil = bancoBrasil;
	}
	public Double getTotalAplicacoes() {
		return totalAplicacoes;
	}
	public void setTotalAplicacoes(Double totalAplicacoes) {
		this.totalAplicacoes = totalAplicacoes;
	}
	public Double getAplicacoesBancoBrasil() {
		return aplicacoesBancoBrasil;
	}
	public void setAplicacoesBancoBrasil(Double aplicacoesBancoBrasil) {
		this.aplicacoesBancoBrasil = aplicacoesBancoBrasil;
	}
	public Double getCreditos() {
		return creditos;
	}
	public void setCreditos(Double creditos) {
		this.creditos = creditos;
	}
	public Double getClientes() {
		return clientes;
	}
	public void setClientes(Double clientes) {
		this.clientes = clientes;
	}
	public Double getTotalEstoque() {
		return totalEstoque;
	}
	public void setTotalEstoque(Double totalEstoque) {
		this.totalEstoque = totalEstoque;
	}
	public Double getEstoqueMercadoria() {
		return estoqueMercadoria;
	}
	public void setEstoqueMercadoria(Double estoqueMercadoria) {
		this.estoqueMercadoria = estoqueMercadoria;
	}
	public Double getEstoqueMaterialExp() {
		return estoqueMaterialExp;
	}
	public void setEstoqueMaterialExp(Double estoqueMaterialExp) {
		this.estoqueMaterialExp = estoqueMaterialExp;
	}
	public Double getAtivoNCirculante() {
		return ativoNCirculante;
	}
	public void setAtivoNCirculante(Double ativoNCirculante) {
		this.ativoNCirculante = ativoNCirculante;
	}
	public Double getTotalImobilizado() {
		return totalImobilizado;
	}
	public void setTotalImobilizado(Double totalImobilizado) {
		this.totalImobilizado = totalImobilizado;
	}
	public Double getImobilizado() {
		return imobilizado;
	}
	public void setImobilizado(Double imobilizado) {
		this.imobilizado = imobilizado;
	}
	public Double getEquipInformatica() {
		return equipInformatica;
	}
	public void setEquipInformatica(Double equipInformatica) {
		this.equipInformatica = equipInformatica;
	}
	public Double getMoveisUtensilios() {
		return moveisUtensilios;
	}
	public void setMoveisUtensilios(Double moveisUtensilios) {
		this.moveisUtensilios = moveisUtensilios;
	}
	public Double getDepreciacaoAcumulada() {
		return depreciacaoAcumulada;
	}
	public void setDepreciacaoAcumulada(Double depreciacaoAcumulada) {
		this.depreciacaoAcumulada = depreciacaoAcumulada;
	}
	public Double getDpEquipInformatica() {
		return dpEquipInformatica;
	}
	public void setDpEquipInformatica(Double dpEquipInformatica) {
		this.dpEquipInformatica = dpEquipInformatica;
	}
	public Double getDpMoveisUtensilios() {
		return dpMoveisUtensilios;
	}
	public void setDpMoveisUtensilios(Double dpMoveisUtensilios) {
		this.dpMoveisUtensilios = dpMoveisUtensilios;
	}
	public Double getPassivo() {
		return passivo;
	}
	public void setPassivo(Double passivo) {
		this.passivo = passivo;
	}
	public Double getPassivoCirculante() {
		return passivoCirculante;
	}
	public void setPassivoCirculante(Double passivoCirculante) {
		this.passivoCirculante = passivoCirculante;
	}
	public Double getTotalfornecedores() {
		return totalfornecedores;
	}
	public void setTotalfornecedores(Double totalfornecedores) {
		this.totalfornecedores = totalfornecedores;
	}
	public Double getOutrasContas() {
		return outrasContas;
	}
	public void setOutrasContas(Double outrasContas) {
		this.outrasContas = outrasContas;
	}
	public Double getObrigacoesSociais() {
		return obrigacoesSociais;
	}
	public void setObrigacoesSociais(Double obrigacoesSociais) {
		this.obrigacoesSociais = obrigacoesSociais;
	}
	public Double getSalarioAPagar() {
		return salarioAPagar;
	}
	public void setSalarioAPagar(Double salarioAPagar) {
		this.salarioAPagar = salarioAPagar;
	}
	public Double getFeriasAPagar() {
		return feriasAPagar;
	}
	public void setFeriasAPagar(Double feriasAPagar) {
		this.feriasAPagar = feriasAPagar;
	}
	public Double getDecimoTerceiroSalario() {
		return decimoTerceiroSalario;
	}
	public void setDecimoTerceiroSalario(Double decimoTerceiroSalario) {
		this.decimoTerceiroSalario = decimoTerceiroSalario;
	}
	public Double getEncargosSociais() {
		return encargosSociais;
	}
	public void setEncargosSociais(Double encargosSociais) {
		this.encargosSociais = encargosSociais;
	}
	public Double getInssAPagar() {
		return inssAPagar;
	}
	public void setInssAPagar(Double inssAPagar) {
		this.inssAPagar = inssAPagar;
	}
	public Double getFgtsAPagar() {
		return fgtsAPagar;
	}
	public void setFgtsAPagar(Double fgtsAPagar) {
		this.fgtsAPagar = fgtsAPagar;
	}
	public Double getIrrfAPagar() {
		return irrfAPagar;
	}
	public void setIrrfAPagar(Double irrfAPagar) {
		this.irrfAPagar = irrfAPagar;
	}
	public Double getImpostosAPagar() {
		return impostosAPagar;
	}
	public void setImpostosAPagar(Double impostosAPagar) {
		this.impostosAPagar = impostosAPagar;
	}
	public Double getSimplesNacional() {
		return simplesNacional;
	}
	public void setSimplesNacional(Double simplesNacional) {
		this.simplesNacional = simplesNacional;
	}
	public Double getProvisaoDeDecimoTerceiro() {
		return provisaoDeDecimoTerceiro;
	}
	public void setProvisaoDeDecimoTerceiro(Double provisaoDeDecimoTerceiro) {
		this.provisaoDeDecimoTerceiro = provisaoDeDecimoTerceiro;
	}
	public Double getProvisaoFerias() {
		return provisaoFerias;
	}
	public void setProvisaoFerias(Double provisaoFerias) {
		this.provisaoFerias = provisaoFerias;
	}
	public Double getProvisaoFGTS() {
		return provisaoFGTS;
	}
	public void setProvisaoFGTS(Double provisaoFGTS) {
		this.provisaoFGTS = provisaoFGTS;
	}
	public Double getEmprestimosAPagar() {
		return emprestimosAPagar;
	}
	public void setEmprestimosAPagar(Double emprestimosAPagar) {
		this.emprestimosAPagar = emprestimosAPagar;
	}
	public Double getEmprestimoBancoBrasil() {
		return emprestimoBancoBrasil;
	}
	public void setEmprestimoBancoBrasil(Double emprestimoBancoBrasil) {
		this.emprestimoBancoBrasil = emprestimoBancoBrasil;
	}
	public Double getPatrimonioLiquido() {
		return patrimonioLiquido;
	}
	public void setPatrimonioLiquido(Double patrimonioLiquido) {
		this.patrimonioLiquido = patrimonioLiquido;
	}
	public Double getCapitalIntegralizado() {
		return capitalIntegralizado;
	}
	public void setCapitalIntegralizado(Double capitalIntegralizado) {
		this.capitalIntegralizado = capitalIntegralizado;
	}
	public Double getResultadoDoExercicio() {
		return resultadoDoExercicio;
	}
	public void setResultadoDoExercicio(Double resultadoDoExercicio) {
		this.resultadoDoExercicio = resultadoDoExercicio;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
}
