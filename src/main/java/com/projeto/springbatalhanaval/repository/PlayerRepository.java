package com.projeto.springbatalhanaval.repository;

import com.projeto.springbatalhanaval.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
