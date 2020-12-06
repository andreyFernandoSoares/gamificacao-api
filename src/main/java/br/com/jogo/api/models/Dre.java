package br.com.jogo.api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dre {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Float receitaBruta;
	private Float vendaMercadorias;
	private Float deducoesReceitaBruta;
	private Float devolucoes;
	private Float impostosContribuicoes;
	private Float receitaOperacionalLiquida;
	private Float dispensasOperacionais;
	private Float despesasComVendas;
	private Float despesasAdministrativas;
	private Float resultadoAntesDoImposto;
	private Float impostoRenda;
	private Float resultadoLiquidoExercicio;
	
	public Dre() {}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Float getReceitaBruta() {
		return receitaBruta;
	}
	public void setReceitaBruta(Float receitaBruta) {
		this.receitaBruta = receitaBruta;
	}
	public Float getVendaMercadorias() {
		return vendaMercadorias;
	}
	public void setVendaMercadorias(Float vendaMercadorias) {
		this.vendaMercadorias = vendaMercadorias;
	}
	public Float getDeducoesReceitaBruta() {
		return deducoesReceitaBruta;
	}
	public void setDeducoesReceitaBruta(Float deducoesReceitaBruta) {
		this.deducoesReceitaBruta = deducoesReceitaBruta;
	}
	public Float getDevolucoes() {
		return devolucoes;
	}
	public void setDevolucoes(Float devolucoes) {
		this.devolucoes = devolucoes;
	}
	public Float getImpostosContribuicoes() {
		return impostosContribuicoes;
	}
	public void setImpostosContribuicoes(Float impostosContribuicoes) {
		this.impostosContribuicoes = impostosContribuicoes;
	}
	public Float getReceitaOperacionalLiquida() {
		return receitaOperacionalLiquida;
	}
	public void setReceitaOperacionalLiquida(Float receitaOperacionalLiquida) {
		this.receitaOperacionalLiquida = receitaOperacionalLiquida;
	}
	public Float getDispensasOperacionais() {
		return dispensasOperacionais;
	}
	public void setDispensasOperacionais(Float dispensasOperacionais) {
		this.dispensasOperacionais = dispensasOperacionais;
	}
	public Float getDespesasComVendas() {
		return despesasComVendas;
	}
	public void setDespesasComVendas(Float despesasComVendas) {
		this.despesasComVendas = despesasComVendas;
	}
	public Float getDespesasAdministrativas() {
		return despesasAdministrativas;
	}
	public void setDespesasAdministrativas(Float despesasAdministrativas) {
		this.despesasAdministrativas = despesasAdministrativas;
	}
	public Float getResultadoAntesDoImposto() {
		return resultadoAntesDoImposto;
	}
	public void setResultadoAntesDoImposto(Float resultadoAntesDoImposto) {
		this.resultadoAntesDoImposto = resultadoAntesDoImposto;
	}
	public Float getImpostoRenda() {
		return impostoRenda;
	}
	public void setImpostoRenda(Float impostoRenda) {
		this.impostoRenda = impostoRenda;
	}
	public Float getResultadoLiquidoExercicio() {
		return resultadoLiquidoExercicio;
	}
	public void setResultadoLiquidoExercicio(Float resultadoLiquidoExercicio) {
		this.resultadoLiquidoExercicio = resultadoLiquidoExercicio;
	}
	@Override
	public String toString() {
		return "Dre [id=" + id + ", receitaBruta=" + receitaBruta + ", vendaMercadorias=" + vendaMercadorias
				+ ", deducoesReceitaBruta=" + deducoesReceitaBruta + ", devolucoes=" + devolucoes
				+ ", impostosContribuicoes=" + impostosContribuicoes + ", receitaOperacionalLiquida="
				+ receitaOperacionalLiquida + ", dispensasOperacionais=" + dispensasOperacionais
				+ ", despesasComVendas=" + despesasComVendas + ", despesasAdministrativas=" + despesasAdministrativas
				+ ", resultadoAntesDoImposto=" + resultadoAntesDoImposto + ", impostoRenda=" + impostoRenda
				+ ", resultadoLiquidoExercicio=" + resultadoLiquidoExercicio + "]";
	}
}
