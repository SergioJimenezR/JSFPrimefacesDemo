package com.sergiojimenez.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sergiojimenez.demo.model.Coche;

@Repository
public interface CocheDAO extends JpaRepository<Coche, Integer> {
}

/*
 * La tabla se crea automáticamente según @Entity de Spring JPA, y la tabla
 * temporal se rellena según data.sql con ayuda de H2 y Spring Boot.
 */