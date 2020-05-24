package com.projeto.apirest.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity //define entidade
@Table(name="PESSOA") //define table como nome 'pessoa'
public class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/*@Id
	@GeneratedValue(strategy=GenerationType.AUTO) //auto incremento de ID
	private long id;*/
	
	@Id
	private String doc;
	
	@NotNull
	private String nome;
	
	private String email, telefone;
	
	@NotNull
	private char sexo;

	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
		
}
