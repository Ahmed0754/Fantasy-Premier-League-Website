package com.cl.Champions_zone.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Optional<Player> getPlayerById(String playerName) {
        return playerRepository.findById(playerName);
    }

    public Player createPlayer(Player player) {
        return playerRepository.save(player);
    }

    public Optional<Player> updatePlayer(String playerName, Player updatedPlayer) {
        return playerRepository.findById(playerName).map(player -> {
            player.setNation(updatedPlayer.getNation());
            player.setPosition(updatedPlayer.getPosition());
            player.setAge(updatedPlayer.getAge());
            player.setMatchesPlayed(updatedPlayer.getMatchesPlayed());
            player.setStarts(updatedPlayer.getStarts());
            player.setMinutes(updatedPlayer.getMinutes());
            player.setNineties(updatedPlayer.getNineties());
            player.setGoals(updatedPlayer.getGoals());
            player.setAssists(updatedPlayer.getAssists());
            player.setTeam(updatedPlayer.getTeam());
            return playerRepository.save(player);
        });
    }

    public boolean deletePlayer(String playerName) {
        if (playerRepository.existsById(playerName)) {
            playerRepository.deleteById(playerName);
            return true;
        }
        return false;
    }
}
