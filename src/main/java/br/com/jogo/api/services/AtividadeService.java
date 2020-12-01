package br.com.jogo.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import br.com.jogo.api.models.Atividade;
import br.com.jogo.api.repositories.AtividadeRepository;

@Service
public class AtividadeService {
	
	@Autowired
	private AtividadeRepository atividadeRepository;

	public Atividade gravar(Atividade atividade) {
		return atividadeRepository.save(atividade);
	}

	public List<Atividade> buscar() {
		return atividadeRepository.findAll();
	}

	public ResponseEntity<?> deletar(List<Atividade> listaAtividades) {
		try {
			atividadeRepository.deleteAll(listaAtividades);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}

}
