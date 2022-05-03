package br.com.fuctura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.fuctura.model.Jogador;
import br.com.fuctura.repository.JogadorRepository;
import br.com.fuctura.service.IJogadorService;

@Controller
public class JogadorController {
	
	@Autowired
	IJogadorService service;
	
	@Autowired
	JogadorRepository repo;
	
	@Value("Hello World")
	private String msg;
	
	@Value("${user.first.name}")
	private String name;
	
	@Autowired
	List<Jogador> j;
	
	//localhost:9080/jogador/listar
	//http://localhost:9080/jogador/listar/1
	@GetMapping("/jogador/listar/{id}")
	public String listar(Model model, @PathVariable String id) {
		System.out.println("id: " + id);
		j.forEach(xk -> System.out.println(xk.getNome()));
		return "/v1/jogador/listar"; 
	}
	
	//localhost:9080/jogador/cadastrar
	@GetMapping("/v1/jogador/cadastrar")
	public String cadastrar(){
		return "/v1/jogador/cadastrar";
	}
	
	//RequestParam("name que está no html"
	@PostMapping("/v1/jogador/cadastrar")
	public String cadastrar(@RequestParam("idade") int idadeDoJogador, 
			@RequestParam(name = "nome") String nomeDoJogador, @RequestParam("posicao") String posicao,
			@RequestParam("altura") double altura) {
		//este método vai receber os dados do formulario
		System.out.println("nome:" + nomeDoJogador);
		System.out.println("idade:" + idadeDoJogador);
		
		Jogador j = new Jogador();
		j.setIdade(idadeDoJogador);
		j.setNome(nomeDoJogador);
		//j.setPosicao(posicao);
		j.setAltura(altura);
		
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
}
