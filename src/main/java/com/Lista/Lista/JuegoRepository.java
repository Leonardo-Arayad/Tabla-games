package com.Lista.Lista;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JuegoRepository extends JpaRepository<Juego, Long> {
    // Aquí puedes definir métodos de consulta personalizados si es necesario
}
