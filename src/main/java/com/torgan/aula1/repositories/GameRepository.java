package com.torgan.aula1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.torgan.aula1.entities.Game;

public interface  GameRepository extends JpaRepository<Game, Long> {

    
}
