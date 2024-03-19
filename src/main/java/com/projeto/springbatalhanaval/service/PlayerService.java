package com.projeto.springbatalhanaval.service;

import com.projeto.springbatalhanaval.entity.Player;
import com.projeto.springbatalhanaval.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public Player createPlayer(Player player) {
        return playerRepository.save(player);
    }

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Optional<Player> getPlayerById(Long id) {
        return playerRepository.findById(id);
    }

    public Player updatePlayer(Long id, Player playerDetails) {
        Optional<Player> playerOptional = playerRepository.findById(id);
        if (playerOptional.isPresent()) {
            Player player = playerOptional.get();
            player.setName(playerDetails.getName());
            return playerRepository.save(player);
        } else {
            // Tratar o caso em que o jogador não é encontrado
            return null;
        }
    }

    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }
}
