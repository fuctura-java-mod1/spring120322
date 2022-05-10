package br.com.fuctura.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import br.com.fuctura.model.Clube;

@Primary
@Service
public class ClubeServiceTxtImpl implements ClubeService {

	@Override
	public void save(Clube clube) {
		// TODO Auto-generated method stub
		System.out.println("Salvou no TXT");
	}

}
