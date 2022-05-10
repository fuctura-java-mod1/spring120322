package br.com.fuctura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.fuctura.service.ClubeService;

@Controller
public class ClubeController {
	
	@Autowired
	private ClubeService service;
	
	//http:localhost:9080/clube/salvar
	@GetMapping("/clube/salvar")
	public String exibirFormularioDeSave() {
		//templates/clube/cadastrar.html
		return "clube/cadastrar";
	}
}
