package br.com.jogo.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.jogo.api.models.BalancoPatrimonial;

@Repository
public interface BalancoPatrimonialRepository extends JpaRepository<BalancoPatrimonial, Long> {
	
}
