package com.projeto.springbatalhanaval.repository;

import com.projeto.springbatalhanaval.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
