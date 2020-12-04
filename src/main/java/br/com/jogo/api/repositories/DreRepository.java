package br.com.jogo.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jogo.api.models.Dre;

@Repository
public interface DreRepository extends JpaRepository<Dre, Long> {

}
