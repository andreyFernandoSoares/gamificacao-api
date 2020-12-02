package br.com.jogo.api.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jogo.api.models.BalancoPatrimonial;

@Repository
public interface BalancoPatrimonialRepository extends JpaRepository<BalancoPatrimonial, Long> {
	
	Optional<BalancoPatrimonial> findByUsuarioId(Long id);
}
