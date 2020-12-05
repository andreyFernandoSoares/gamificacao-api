package br.com.jogo.api.services;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.jogo.api.models.Atividade;
import br.com.jogo.api.models.Sala;
import br.com.jogo.api.models.Usuario;
import br.com.jogo.api.repositories.AtividadeRepository;
import br.com.jogo.api.repositories.SalaRepository;
import br.com.jogo.api.repositories.UsuarioRepository;

@Service
public class SalaService {
	
	@Autowired 
	UsuarioRepository usuarioRepository;
	
	@Autowired
	AtividadeRepository atividadeRepository;
	
	@Autowired
	SalaRepository salaRepository;

	public ResponseEntity<?> gravar(Long usuarioId) {
		Optional<Sala> usuarioSala = salaRepository.findByUsuarioId(usuarioId);
		
		Integer ativa = 0;
		
		if (usuarioSala.isPresent()) 
			ativa = usuarioSala.get().getAtiva();
		
		if (ativa == 0) {
			String codigo = geraCodigo();
			Usuario usuario = geraUsuario(usuarioId);
			List<Atividade> atividades = geraListaAtividades();
			
			if (atividades.size() == 10) {
				Sala sala = new Sala(codigo, usuario, atividades, LocalDateTime.now());
				Sala salaCriada = salaRepository.save(sala);
				return ResponseEntity.ok(salaCriada.getCodigo());
			} else {
				return ResponseEntity.notFound().build();
			}
		}
		
		return ResponseEntity.notFound().build();
	}

	private Usuario geraUsuario(Long usuarioId) {
		Optional<Usuario> usuario = usuarioRepository.findById(usuarioId);
		
		if (usuario.isPresent()) 
			return usuario.get();
		
		return null;
	}

	private List<Atividade> geraListaAtividades() {
		List<Atividade> atividades = atividadeRepository.findAll();
		List<Atividade> atividadesDaSala = new LinkedList<>();
		Integer indexAuxiliar = 0;
		
		for (Atividade atividade : atividades) {
			atividadesDaSala.add(atividade);
			indexAuxiliar++;
			
			if (indexAuxiliar > 10) 
				break;
		}
		
		return atividadesDaSala;
	}

	private String geraCodigo() {
		UUID uuid = UUID.randomUUID();
		String codigo = uuid.toString();
		return codigo.substring(0,6);
	}

	public ResponseEntity<?> buscarPorUsuarioId(Long usuarioId) {
		Optional<Sala> sala = salaRepository.findByUsuarioId(usuarioId);
		
		if (sala.isPresent()) 
			return ResponseEntity.ok(sala.get().getCodigo());
		
		return ResponseEntity.notFound().build();
	}

	public ResponseEntity<?> buscarListaAtividades(String codigo) {
		Optional<Sala> sala = salaRepository.findByCodigo(codigo);
		
		if (sala.isPresent())
			return ResponseEntity.ok(sala.get().getListaAtividades());
		
		return ResponseEntity.notFound().build();
	}
}