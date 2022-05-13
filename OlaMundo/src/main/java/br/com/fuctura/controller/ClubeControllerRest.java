package br.com.fuctura.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fuctura.model.Clube;
import br.com.fuctura.service.ClubeService;

@RestController
public class ClubeControllerRest {
	
	@Autowired
	@Qualifier("H2")
	private ClubeService service;
	
	@GetMapping("/v2/clube")
	public List<Clube> listarTodos() {
		System.out.println("listarTodos");
		return service.findAll();
	}
	
	@PostMapping("/v2/clube")
	public void salvar(@RequestBody Clube clube) {
		System.out.println("Nome:" + clube.getNome());
		System.out.println("Clube salvo com sucesso!");
		service.save(clube);
	}
	
	@GetMapping("/v2/clube/{pageNO}/{pageSize}")
	public List<Clube> listarComPaginacao(@PathVariable int pageNO, 
			@PathVariable int pageSize) {
		
		System.out.println("pageNO: " + pageNO);
		System.out.println("pageSize: " + pageSize);
		return service.findPaginated(pageNO, pageSize);
	
	}
	
	@GetMapping("/v2/clube/{id}")
	public ResponseEntity<Clube> detalhar(@PathVariable long id) {
		Optional<Clube> result = service.findById(id);
		if(result.isPresent()) {
		  return new ResponseEntity<Clube>(result.get(), HttpStatus.OK);
		}
		return new ResponseEntity<Clube>(HttpStatus.BAD_REQUEST);
	}
}
