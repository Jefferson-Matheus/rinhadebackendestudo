package com.rinha.backend.entity;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_pessoa")
public class PessoaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@Column(nullable = false, unique = true, length = 32)
	private String apelido;
	
	@Column(nullable = false, length = 100)
	private String nome;
	
	private String data_nascimento;
	
	@ElementCollection
	private List<String> stack;

	public PessoaEntity(UUID id, String apelido, String nome, String data_nascimento, List<String> stack) {
		super();
		this.id = id;
		this.apelido = apelido;
		this.nome = nome;
		this.data_nascimento = data_nascimento;
		this.stack = stack;
	}
	

	public PessoaEntity() {
	}



	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public List<String> getStack() {
		return stack;
	}

	public void setStack(List<String> stack) {
		this.stack = stack;
	}
		
		
	
	
}
