package br.com.fuctura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fuctura.model.Clube;

@Repository											  //Classe e tipo de dados do ID
public interface ClubeRepository extends JpaRepository<Clube, Long> {

}
