package br.com.jogo.api.services;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.jogo.api.builders.BalancoBuilder;
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

}
