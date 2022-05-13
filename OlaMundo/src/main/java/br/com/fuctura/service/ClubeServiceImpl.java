package br.com.fuctura.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

	@Override
	public List<Clube> findPaginated(int pageNO, int pageSize) {

		Pageable paging = PageRequest.of(pageNO, pageSize);
		
		Page<Clube> resultado = repo.findAll(paging);
		
		return resultado.toList();
	}
//import org.springframework.data.domain.Pageable;

	@Override
	public Optional<Clube> findById(Long id) {
		return repo.findById(id);
	}

	

}
