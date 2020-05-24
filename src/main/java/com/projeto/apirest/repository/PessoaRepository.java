package com.projeto.apirest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.apirest.models.Pessoa;

public interface PessoaRepository extends JpaRepository <Pessoa, String> {
	
	Pessoa findByDoc(String doc); //jpa já associa o retorno automaticamente
	
	Pessoa deleteByDoc(String doc);
}
