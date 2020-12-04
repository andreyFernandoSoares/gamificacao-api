package br.com.jogo.api.services;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.jogo.api.builders.BalancoBuilder;
import br.com.jogo.api.dtos.AtividadeDto;
import br.com.jogo.api.models.BalancoPatrimonial;
import br.com.jogo.api.models.Dre;
import br.com.jogo.api.models.Jogador;
import br.com.jogo.api.models.Sala;
import br.com.jogo.api.repositories.BalancoPatrimonialRepository;
import br.com.jogo.api.repositories.DreRepository;
import br.com.jogo.api.repositories.JogadorRepository;
import br.com.jogo.api.repositories.SalaRepository;

@Service
public class JogadorService {
	
	@Autowired
	private JogadorRepository jogadorRepository;
	
	@Autowired
	private SalaRepository salaRepository;
	
	@Autowired
	private DreRepository dreRepository;
	
	@Autowired
	private BalancoPatrimonialRepository balancoRepository;

	public ResponseEntity<?> gravar(Jogador jogador) {
		
		try {
			Optional<Sala> sala = salaRepository.findByCodigo(jogador.getCodigo());
			
			if (sala.isPresent()) {
				Sala salaJogador = sala.get();

				if (salaJogador.getAtiva() > 0) {
					Jogador jogadorCriado = criaJogador(jogador);
					montaBalancoPatrimonial(salaJogador, jogadorCriado);
					adicionaJogadorASala(salaJogador, jogadorCriado);
					return ResponseEntity.ok(jogadorCriado.getId());
				} else {
					return ResponseEntity.notFound().build();
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.notFound().build();
	}

	private void adicionaJogadorASala(Sala salaJogador, Jogador jogadorCriado) {
		List<Jogador> listaJogadores = salaJogador.getListaJogadores();
		
		if (listaJogadores != null)
			listaJogadores.add(jogadorCriado);
		else {
			listaJogadores = new LinkedList<>();
			listaJogadores.add(jogadorCriado);
		}
		
		salaRepository.save(salaJogador);
	}

	private void montaBalancoPatrimonial(Sala salaJogador, Jogador jogadorCriado) {
		BalancoPatrimonial balanco = salaJogador.getUsuario().getBalacoPatrimonial();
		BalancoBuilder balancoBuilder = new BalancoBuilder();
		BalancoPatrimonial novoBalanco = balancoBuilder.constroi(balanco, jogadorCriado);
		BalancoPatrimonial balancoCriado = balancoRepository.save(novoBalanco);
		jogadorCriado.setBalanco(balancoCriado);
		jogadorRepository.save(jogadorCriado);
		
	}

	private Jogador criaJogador(Jogador jogador) {
		Dre dre = dreRepository.save(new Dre());
		jogador.setDre(dre);
		Jogador jogadorCriado = jogadorRepository.save(jogador);
		return jogadorCriado;
	}

	public ResponseEntity<?> buscarBalanco(Long jogadorId) {
		Optional<Jogador> jogador = jogadorRepository.findById(jogadorId);
		
		if (jogador.isPresent())
			return ResponseEntity.ok(jogador.get().getBalanco());
		
		return ResponseEntity.notFound().build();
	}

	public ResponseEntity<?> alteraBalanco(Long jogadorId, AtividadeDto atividadeDto) {
		Optional<Jogador> jogador = jogadorRepository.findById(jogadorId);
		
		if (jogador.isPresent()) {
			BalancoPatrimonial balanco = jogador.get().getBalanco();
			calculaAtivos(atividadeDto, balanco);
			calculaPassivos(atividadeDto, balanco); 
			balancoRepository.save(balanco);
			return ResponseEntity.ok().build();
		}
		
		return ResponseEntity.notFound().build();
	}

	private void calculaAtivos(AtividadeDto atividadeDto, BalancoPatrimonial balanco) {
		Float valorAtual;
		switch(atividadeDto.getAtivo()) {
			case "CAIXA":
				valorAtual = balanco.getCaixa();
				balanco.setCaixa(valorAtual + atividadeDto.getValor());
				break;
			case "CONTASRECEBER":
				valorAtual = balanco.getContasAReceber();
				balanco.setContasAReceber(valorAtual + atividadeDto.getValor()); 
				break;
			case "ESTOQUE":
				valorAtual = balanco.getEstoque();
				balanco.setEstoque(valorAtual + atividadeDto.getValor()); 
				break;
			case "EQUIPAMENTOS":
				valorAtual = balanco.getEquipamentos();
				balanco.setEquipamentos(valorAtual + atividadeDto.getValor());
				break;
			case "MOVEISUTENSILIOS":
				valorAtual = balanco.getMoveisUtensilios();
				balanco.setMoveisUtensilios(valorAtual + atividadeDto.getValor());
				break;
			case "VEICULOS":
				valorAtual = balanco.getVeiculo();
				balanco.setVeiculo(valorAtual + atividadeDto.getValor());
				break;
		}
		
		balanco.setAtivoCirculante(
			balanco.getCaixa() + balanco.getContasAReceber() + balanco.getEstoque()
		);
		
		balanco.setAtivoNaoCirculante(
			balanco.getEquipamentos() + balanco.getMoveisUtensilios() + balanco.getVeiculo()
		);
		
		balanco.setImobilizados(balanco.getAtivoNaoCirculante());
		
		balanco.setAtivo(
			balanco.getAtivoCirculante() + balanco.getAtivoNaoCirculante()
		);
	}

	private void calculaPassivos(AtividadeDto atividadeDto, BalancoPatrimonial balanco) {
		Float valorAtual;
		
		switch(atividadeDto.getPassivo()) {
			case "FORNECEDORES":
				valorAtual = balanco.getFornecedores();
				balanco.setFornecedores(valorAtual + atividadeDto.getValor());
				break;
			case "SALARIOS":
				valorAtual = balanco.getSalarios();
				balanco.setSalarios(valorAtual + atividadeDto.getValor());
				break;
			case "IMPOSTOS":
				valorAtual = balanco.getImpostos();
				balanco.setImpostos(valorAtual + atividadeDto.getValor());
				break;
			case "ALUGUEL":
				valorAtual = balanco.getAluguel();
				balanco.setAluguel(valorAtual + atividadeDto.getValor());
				break;
			case "FINANCIAMENTOS":
				valorAtual = balanco.getFinanciamentos();
				balanco.setFinanciamentos(valorAtual + atividadeDto.getValor());
				break;
			case "EMPRESTIMOS":
				valorAtual = balanco.getEmprestimos();
				balanco.setEmprestimos(valorAtual + atividadeDto.getValor());
				break;
		}
		
		balanco.setPassivoCirculante(
			balanco.getFornecedores() + balanco.getSalarios() +
			balanco.getImpostos() + balanco.getAluguel()
		);
		
		balanco.setPassivoNaoCirculante(
		    balanco.getFinanciamentos() + balanco.getEmprestimos()
		);
		
		balanco.setPassivo(
			balanco.getPassivoCirculante() + balanco.getPassivoNaoCirculante()	
		);
	}
}