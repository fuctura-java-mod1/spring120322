package br.com.fuctura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.fuctura.repository.JogadorRepository;

@Controller
public class JogadorController {
	@Autowired
	JogadorRepository repo;
	
	@GetMapping("/jogador/cadastrar")
	public String showAddContact() {
		return "v1/jogador/cadastrar";
	}	
}
