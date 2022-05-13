package br.com.fuctura.service;

import java.util.List;
import java.util.Optional;

import br.com.fuctura.model.Clube;

public interface ClubeService {
	void save(Clube clube);
	
	List<Clube> findAll();
	
	List<Clube> findPaginated(int pageNO, int pageSize);
	
	Optional<Clube> findById(Long id);
}
