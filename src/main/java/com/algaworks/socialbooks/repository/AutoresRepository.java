package com.algaworks.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.socialbooks.model.Autor;

public interface AutoresRepository extends JpaRepository<Autor, Long> {

}
