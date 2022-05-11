package br.com.fuctura.service;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import br.com.fuctura.model.Clube;

@Primary
@Service("TXT")
public class ClubeServiceTxtImpl implements ClubeService {

	@Override
	public void save(Clube clube) {
		// TODO Auto-generated method stub
		System.out.println("Salvou no TXT");
	}

	@Override
	public List<Clube> findAll() {
		System.out.println("Listar do TXT");
		return null;
	}

}
