package br.com.fuctura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fuctura.model.Clube;
import br.com.fuctura.repository.ClubeRepository;

@Service("H2")
public class ClubeServiceImpl implements ClubeService {

	private final ClubeRepository repo;
	
	//construtor
	@Autowired
	public ClubeServiceImpl(ClubeRepository repositorioInjetado) {
		this.repo = repositorioInjetado;
	}
	
	@Override
	public void save(Clube clube) {
		this.repo.save(clube);
	}

	@Override
	public List<Clube> findAll() {
		return this.repo.findAll();
	}
}
