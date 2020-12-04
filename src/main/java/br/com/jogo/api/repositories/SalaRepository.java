package br.com.jogo.api.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.jogo.api.models.Sala;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Long> {
	
	Optional<Sala> findByUsuarioId(Long id);
	
	Optional<Sala> findByCodigo(String codigo);
}
