package br.com.fuctura.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Posicao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String descricao;
	
	//construtor com os parametros -->@AllArgsConstructor
	/*
	public Posicao(Long id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}*/
	
	//construtor default -> @NoArgsConstructor
	//public Posicao() {}
}