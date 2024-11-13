package com.torgan.aula1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.torgan.aula1.entities.GameList;

public interface  GameListRepository extends JpaRepository<GameList, Long> {

    
}
