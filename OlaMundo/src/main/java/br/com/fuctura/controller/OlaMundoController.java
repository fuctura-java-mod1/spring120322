package br.com.fuctura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.fuctura.model.Jogador;

@Controller
public class OlaMundoController {
	
	//
	@GetMapping("/inicial")
	public String getInicial(Model model) {
		
		///instanciei 1 jogador
		Jogador j = new Jogador();
		j.setNome("Messi");
		j.setIdade(20);
		j.setPeso(90.0);
		j.setAltura(1.87);
		j.setImg("https://thumbs.dreamstime.com/b/lionel-messi-goal-celebration-celebrates-positive-emotion-reaction-thankful-pointing-poins-points-fingers-sky-god-religion-number-129917731.jpg");
		
		model.addAttribute("jogador", j);
		model.addAttribute("tituloDaPagina", "Fuctura-Model");
		
		return "inicial";
	}
	
	//localhost:9080/outra
	@GetMapping("/outra")
	public String fuctura() {
		return "outraPagina";
	}
}
