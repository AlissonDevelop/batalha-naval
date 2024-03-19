package com.projeto.springbatalhanaval.game;

import com.projeto.springbatalhanaval.entity.Board;

public class BattleShipGame {

    private Board player1Board;
    private Board player2Board;

    public void initializeBoards() {
        // Lógica para inicializar os tabuleiros dos jogadores
        // Por exemplo, criando os tabuleiros vazios
        this.player1Board = new Board();
        this.player2Board = new Board();
    }

    public void placeShips() {
        // Lógica para posicionar os navios nos tabuleiros
    }

    // Outros métodos para a lógica do jogo
}
