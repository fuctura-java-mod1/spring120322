package br.com.fuctura.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fuctura.dto.EstatisticaDTO;
import br.com.fuctura.model.Jogador;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Long> {
	List<EstatisticaDTO> findBy();
}
