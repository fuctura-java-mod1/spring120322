package br.com.fuctura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.fuctura.model.Clube;
import br.com.fuctura.service.ClubeService;

@Controller
public class ClubeController {
	
	@Autowired
	@Qualifier("H2")
	private ClubeService service;
	
	//http:localhost:9080/clube/salvar
	@GetMapping("/clube/salvar")
	public String exibirFormularioDeSave() {
		//templates/clube/cadastrar.html
		System.out.println("GET");
		return "clube/cadastrar";
	}
	
	@GetMapping("/clube/listar")
	public String listarTodos(Model model) {
		System.out.println("listarTodos");
		List<Clube> result = service.findAll();
		model.addAttribute("clubes", result);
		return "clube/listar";
	}
	
	/*
	 * name="nome" -> setNome("Arruda")
	 * name="dataFundacao" -> setDataFundacao("10/05/2022")
	 */
	
	@PostMapping("/clube/salvar")
	public String salvarClube(@ModelAttribute Clube clube) {
		service.save(clube); 
		return "redirect:/clube/listar";
	}
	
}
