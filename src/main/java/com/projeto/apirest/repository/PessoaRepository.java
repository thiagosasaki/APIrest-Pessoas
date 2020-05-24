package com.projeto.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.apirest.models.Pessoa;

public interface PessoaRepository extends JpaRepository <Pessoa, String> {
	
	Pessoa findByDoc(String doc); //jpa já associa o retorno automaticamente

}
