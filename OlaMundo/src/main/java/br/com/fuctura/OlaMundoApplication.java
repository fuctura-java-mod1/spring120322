package br.com.fuctura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import br.com.fuctura.model.Jogador;

@SpringBootApplication
public class OlaMundoApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(OlaMundoApplication.class, args);
		
		Jogador j = context.getBean(Jogador.class);
		
		System.out.println("J:" + j.getNome());
		
	}
	
	@Bean
	
	public Jogador getBean() {
		Jogador j1 = new Jogador("Sou um Bean");
		return j1;
	}

	@Bean
	@Primary
	public Jogador getBean2() {
		Jogador j2 = new Jogador("Sou um Bean2");
		return j2;
	}
}
