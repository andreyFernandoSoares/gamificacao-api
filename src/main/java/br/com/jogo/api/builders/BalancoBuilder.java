package br.com.jogo.api.builders;

import br.com.jogo.api.models.BalancoPatrimonial;
import br.com.jogo.api.models.Jogador;

public class BalancoBuilder {

	public BalancoPatrimonial constroi(BalancoPatrimonial balanco, Jogador jogadorCriado) {
		BalancoPatrimonial novoBalanco = new BalancoPatrimonial();
		novoBalanco.setAtivo(balanco.getAtivo());
		novoBalanco.setPassivo(balanco.getPassivo());
		novoBalanco.setAtivoCirculante(balanco.getAtivoCirculante());
		novoBalanco.setPassivoCirculante(balanco.getPassivoCirculante());
		novoBalanco.setCaixa(balanco.getCaixa());
		novoBalanco.setFornecedores(balanco.getFornecedores());
		novoBalanco.setContasAReceber(balanco.getContasAReceber());
		novoBalanco.setSalarios(balanco.getSalarios());
		novoBalanco.setEstoque(balanco.getEstoque());
		novoBalanco.setImpostos(balanco.getImpostos());
		novoBalanco.setAtivoNaoCirculante(balanco.getAtivoNaoCirculante());
		novoBalanco.setAluguel(balanco.getAluguel());
		novoBalanco.setImobilizados(balanco.getImobilizados());
		novoBalanco.setPassivoNaoCirculante(balanco.getPassivoNaoCirculante());
		novoBalanco.setEquipamentos(balanco.getEquipamentos());
		novoBalanco.setFinanciamentos(balanco.getFinanciamentos());
		novoBalanco.setMoveisUtensilios(balanco.getMoveisUtensilios());
		novoBalanco.setEmprestimos(balanco.getEmprestimos());
		novoBalanco.setVeiculo(balanco.getVeiculo());
		novoBalanco.setPatrimonioLiquido(balanco.getPatrimonioLiquido());
		novoBalanco.setCapitalSocial(balanco.getCapitalSocial());
		return novoBalanco;
	}

}
