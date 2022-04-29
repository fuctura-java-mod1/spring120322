package br.com.fuctura.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	//localhost:9080/jogador/cadastrar
	@GetMapping("/v1/jogador/cadastrar")
	public String cadastrar(){
		return "/v1/jogador/cadastrar";
		//templates/jogador/cadastrar.html
	}
	
	//RequestParam("name que está no html"
	@PostMapping("/v1/jogador/cadastrar")
	public String cadastrar(@RequestParam("idade") int idadeDoJogador, @RequestParam(name = "nome") String nomeDoJogador) {
		//este método vai receber os dados do formulario
		System.out.println("nome:" + nomeDoJogador);
		System.out.println("idade:" + idadeDoJogador);
		
		Jogador j = new Jogador();
		j.setIdade(idadeDoJogador);
		j.setNome(nomeDoJogador);
		
		//salvar no banco de dados
		repo.save(j);

		return "/v1/jogador/cadastrar";
	}
	
	@GetMapping("/v2/jogador/cadastrar")
	public String cadastrarV2(Model model) {
		Jogador jogador = new Jogador();
		model.addAttribute("jogador", jogador);
		return "/v2/jogador/cadastrar";
	}
	
	@PostMapping("/v2/jogador/cadastrar")
	public String cadastrarV2(@ModelAttribute("jogador") Jogador j) {
		System.out.println(j.getNome());
		return "/v2/jogador/cadastrar";
	}
	
	public String remover() {
		return "/v1/jogador/remover";
	}
	
	public String atualizar() {
		return "/v1/jogador/atualizar";
	}
	
	@GetMapping("/teste")
	public String testeDeBean() {
		
		System.out.println( j.getNome() );//eu sou um bean
		
		return "/v1/jogador/atualizar";
	}
	
	
}
