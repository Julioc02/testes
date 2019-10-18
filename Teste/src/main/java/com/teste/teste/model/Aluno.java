package com.teste.teste.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

@Entity
public class Aluno {
	@Id
	@GeneratedValue
     private Long id;
     public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRecebeu() {
		return recebeu;
	}
	public void setRecebeu(String recebeu) {
		this.recebeu = recebeu;
	}
	public String getEntrega() {
		return entrega;
	}
	public void setEntrega(String entrega) {
		this.entrega = entrega;
	}
	private Integer numero;
     private String nome;
     private String recebeu;
     private String entrega;
}
