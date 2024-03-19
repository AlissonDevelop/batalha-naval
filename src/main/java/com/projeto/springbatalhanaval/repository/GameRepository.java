package com.projeto.springbatalhanaval.repository;

import com.projeto.springbatalhanaval.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}