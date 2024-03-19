package com.projeto.springbatalhanaval.entity;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;

@Entity
@Getter
@Setter
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Game game;

    @Lob
    private String gridAsString;

    @Transient
    private int[][] grid;

    @PrePersist
    @PreUpdate
    private void updateGridAsString() {
        if (grid != null) {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                this.gridAsString = objectMapper.writeValueAsString(grid);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @PostLoad
    private void updateGrid() {
        if (gridAsString != null && !gridAsString.isEmpty()) {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                this.grid = objectMapper.readValue(gridAsString, int[][].class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
