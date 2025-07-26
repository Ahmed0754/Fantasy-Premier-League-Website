package com.cl.Champions_zone.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/player")
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @GetMapping("/{playerName}")
    public ResponseEntity<Player> getPlayerById(@PathVariable String playerName) {
        return playerService.getPlayerById(playerName)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Player createPlayer(@RequestBody Player player) {
        return playerService.createPlayer(player);
    }

    @PutMapping("/{playerName}")
    public ResponseEntity<Player> updatePlayer(@PathVariable String playerName, @RequestBody Player player) {
        return playerService.updatePlayer(playerName, player)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{playerName}")
    public ResponseEntity<Void> deletePlayer(@PathVariable String playerName) {
        boolean deleted = playerService.deletePlayer(playerName);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
