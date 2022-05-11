package br.com.fuctura.service;

import java.util.List;

import br.com.fuctura.model.Clube;

public interface ClubeService {
	void save(Clube clube);
	List<Clube> findAll();
}
