package com.rinha.backend.entity;

import jakarta.persistence.Column;
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
	private Long id;
	
	@Column(nullable = false, unique = true, length = 32)
	private String apelido;
	
	@Column(nullable = false, length = 100)
	private String nome;
	
	private String data_nascimento;
	
	private String[] stack;

	public PessoaEntity(Long id, String apelido, String nome, String data_nascimento, String[] stack) {
		super();
		this.id = id;
		this.apelido = apelido;
		this.nome = nome;
		this.data_nascimento = data_nascimento;
		this.stack = stack;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String[] getStack() {
		return stack;
	}

	public void setStack(String[] stack) {
		this.stack = stack;
	}
		
		
	
	
}
