package com.Lista.Lista.controller;

import com.Lista.Lista.Juego;
import com.Lista.Lista.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/games")
public class GameController {

    @Autowired
    private GameRepository gameRepository;

    @GetMapping
public ResponseEntity<List<Juego>> getAllGames() {
    List<Juego> games = gameRepository.findAll();
    games.forEach(game -> System.out.println(game)); // Imprime cada juego para depuración
    return ResponseEntity.ok(games); // Usa la lista de juegos ya recuperada
}
}
