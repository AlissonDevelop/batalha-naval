package com.projeto.springbatalhanaval.model;

public class BattleShipGame {

    private char[][] board;
    private static final int BOARD_SIZE = 10;

    public void initializeBoard() {
        board = new char[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void placeShips() {
        // Aqui você implementaria a lógica para posicionar os navios no tabuleiro.
        // Este é apenas um exemplo simples.
        // Posiciona um navio de tamanho 3 na vertical na posição (0, 0)
        for (int i = 0; i < 3; i++) {
            board[i][0] = 'S'; // 'S' representa um navio
        }
    }
}
