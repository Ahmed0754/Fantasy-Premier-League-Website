package com.cl.Champions_zone.player;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, String> {
    // Note: PK is String (playerName)
}
