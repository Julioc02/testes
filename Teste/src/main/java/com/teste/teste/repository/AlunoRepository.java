package com.teste.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.teste.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
