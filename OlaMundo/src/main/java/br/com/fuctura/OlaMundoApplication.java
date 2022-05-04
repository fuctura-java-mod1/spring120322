package br.com.fuctura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

import br.com.fuctura.model.Jogador;
import br.com.fuctura.model.Posicao;
import br.com.fuctura.repository.JogadorRepository;
import br.com.fuctura.repository.PosicaoRepository;

@SpringBootApplication
public class OlaMundoApplication {

	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OlaMundoApplication.class, args);
	}
	
	@Bean
	public Jogador getBean() {
		Jogador j1 = new Jogador("Sou um Bean");
		return j1;
	}

	@Bean
	public Jogador getBean2() {
		Jogador j2 = new Jogador("Sou um Bean2");
		return j2;
	}
	
	@Autowired
	@Bean
	//injecao via metodo
	public CommandLineRunner salvar1Jogador(JogadorRepository repo) {
		System.out.println("Inserir os jogadores na inicialização da aplicacao");
		
		return (String[] args) -> {
			Jogador j1 = new Jogador();
			j1.setNome("Salah");
			j1.setAltura(1.90);
			j1.setIdade(30);
			j1.setPeso(79.0);
			repo.save(j1);
			
			Jogador j = new Jogador();
			j.setNome("Ronaldo");
			j.setAltura(1.98);
			j.setPeso(75.0);
			j1.setIdade(29);
			repo.save(j);
			
		};
	}
	
	@Bean
	@Autowired
	//injecao via metodo
	public CommandLineRunner salvarPosicoes(PosicaoRepository repo) {
		System.out.println("Inserir as posicoes na inicialização da aplicacao");
		
		return (String[] args) -> {
			Posicao p1 = new Posicao();	
			p1.setDescricao("Atacante");
			
			Posicao p2 = new Posicao();	
			p2.setDescricao("Zagueiro");
			
			repo.save(p1);
			repo.save(p2);
		};
	}
	
	
}
