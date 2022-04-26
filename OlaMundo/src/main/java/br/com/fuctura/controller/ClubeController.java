package br.com.fuctura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClubeController {
	
	@GetMapping("/clube/save")
	public String save() {
		return "clube/save";
	}
	
	@PostMapping("/clube/save")
	public String save(Model model, @RequestParam String nome, @RequestParam String dataFundacao) {
		System.out.println("Nome: " + nome);
		System.out.println("Nome: " + dataFundacao);
		return "clube/save";
	}
}
