package com.projeto.springbatalhanaval.controller;

import com.projeto.springbatalhanaval.game.BattleShipGame;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GameController {

    private BattleShipGame battleShipGame; // Instância do jogo

    @GetMapping("/start")
    public String startGame() {
        // Inicializar o jogo
        battleShipGame = new BattleShipGame();

        // Configurar o tabuleiro, posicionar navios, etc.
        // Exemplo:
        // battleShipGame.initializeBoard();
        // battleShipGame.placeShips();

        return "Game started!";
    }
}