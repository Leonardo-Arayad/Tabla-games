package com.Lista.Lista.repository;

import com.Lista.Lista.Juego;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Juego, Long> {
    // Aquí puedes definir métodos personalizados si es necesario
}
