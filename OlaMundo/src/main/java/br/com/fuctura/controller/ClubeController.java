package br.com.fuctura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import br.com.fuctura.model.Clube;

@Controller
public class ClubeController {
	
	
	
	@GetMapping("/clube/listar")
	public String listar() {
		System.out.println("listar");
		return "clube/listar";
	}
	
	@GetMapping("/clube/cadastrar")
	public String save(Model model) {
		System.out.println("GET");
		return "clube/cadastrar";
	}
	
	@PostMapping("/clube/cadastrar")
	public RedirectView save(Model model, @ModelAttribute Clube clube, RedirectAttributes redirectAttributes) {
		System.out.println("Nome: " + clube.getNome());
        String message="Created user <b>";
        model.addAttribute("userMessage",message);
        
        RedirectView redirectView=new RedirectView("/clube/cadastrar",true);
        redirectAttributes.addFlashAttribute("userMessage",message);
        return redirectView;        
	}
}
