package com.torgan.aula1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.torgan.aula1.dto.GameMinDTO;
import com.torgan.aula1.entities.Game;
import com.torgan.aula1.repositories.GameRepository;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

   @Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(GameMinDTO::new).toList();
	}
   
}
