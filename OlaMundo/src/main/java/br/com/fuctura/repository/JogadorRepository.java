package br.com.fuctura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fuctura.model.Jogador;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Long> {

}
