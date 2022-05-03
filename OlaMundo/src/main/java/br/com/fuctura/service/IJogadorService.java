package br.com.fuctura.service;

import java.util.List;

import br.com.fuctura.model.Jogador;

public interface IJogadorService {
	Jogador save(Jogador j);
	List<Jogador> findAll();
	Jogador findById(Long id);
	void delete(Long id);
	void update(Jogador j);
}
