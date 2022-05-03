package br.com.fuctura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OlaMundoController {
	// localhost:9080/outra
	@GetMapping("/olamundo")
	public String fuctura() {
		return "outraPagina";
	}
}
