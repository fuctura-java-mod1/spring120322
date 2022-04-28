package br.com.fuctura.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.fuctura.model.Jogador;
import br.com.fuctura.repository.JogadorRepository;

@Controller
public class JogadorController {
	
	@Autowired
	JogadorRepository repo;
	
	@Autowired
	Jogador j;
	
	//localhost:9080/jogador/listar
	@GetMapping("/jogador/listar")
	public String listar(Model model) {
		
		//String tituloDaPagina = "Minha Página de Jogadores";
		model.addAttribute("tituloDaPagina", "Minha Página de Jogadores");
		model.addAttribute("altura", 1.90);
		
		//consultar na base todos os jogadores
		Optional<Jogador> umJogador = repo.findById(40L);
		if(umJogador.isPresent()) {
			model.addAttribute("jogadorEncontrado", umJogador.get());
		}
				
		List<Jogador> l = repo.findAll();
		
		model.addAttribute("jogadores", l);
		
		// foreach java
		
		return "/jogador/listar"; 
	}
	
	public String cadastrar(){
		return "/jogador/cadastrar";
	}
	
	public String remover() {
		return "/jogador/remover";
	}
	
	public String atualizar() {
		return "/jogador/atualizar";
	}
	
	@GetMapping("/teste")
	public String testeDeBean() {
		
		System.out.println( j.getNome() );//eu sou um bean
		
		return "/jogador/atualizar";
	}
	
	
}
