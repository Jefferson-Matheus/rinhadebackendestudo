package com.rinha.backend.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rinha.backend.entity.PessoaEntity;

public interface PessoaRepository extends JpaRepository<PessoaEntity, UUID> {

}
