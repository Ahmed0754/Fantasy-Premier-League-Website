package com.cl.Champions_zone.player;

import jakarta.persistence.*;

@Entity
@Table(name = "player_statistic")
public class Player {

    @Id
    @Column(name = "player")
    private String playerName;  // used as ID (unique player name)

    @Column(name = "nation")
    private String nation;

    @Column(name = "pos")
    private String position;

    @Column(name = "age")
    private Integer age;

    @Column(name = "mp")
    private Integer matchesPlayed;

    @Column(name = "starts")
    private Integer starts;

    @Column(name = "minutes")
    private Integer minutes;

    @Column(name = "nineties")
    private Double nineties;

    @Column(name = "goals")
    private Integer goals;

    @Column(name = "assists")
    private Integer assists;

    @Column(name = "team")
    private String team;

    // Constructors
    public Player() {}

    // Optional: Full constructor
    public Player(String playerName, String nation, String position, Integer age,
                  Integer matchesPlayed, Integer starts, Integer minutes, Double nineties,
                  Integer goals, Integer assists, String team) {
        this.playerName = playerName;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.matchesPlayed = matchesPlayed;
        this.starts = starts;
        this.minutes = minutes;
        this.nineties = nineties;
        this.goals = goals;
        this.assists = assists;
        this.team = team;
    }

    // Getters and Setters
    public String getPlayerName() { return playerName; }
    public void setPlayerName(String playerName) { this.playerName = playerName; }

    public String getNation() { return nation; }
    public void setNation(String nation) { this.nation = nation; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public Integer getMatchesPlayed() { return matchesPlayed; }
    public void setMatchesPlayed(Integer matchesPlayed) { this.matchesPlayed = matchesPlayed; }

    public Integer getStarts() { return starts; }
    public void setStarts(Integer starts) { this.starts = starts; }

    public Integer getMinutes() { return minutes; }
    public void setMinutes(Integer minutes) { this.minutes = minutes; }

    public Double getNineties() { return nineties; }
    public void setNineties(Double nineties) { this.nineties = nineties; }

    public Integer getGoals() { return goals; }
    public void setGoals(Integer goals) { this.goals = goals; }

    public Integer getAssists() { return assists; }
    public void setAssists(Integer assists) { this.assists = assists; }

    public String getTeam() { return team; }
    public void setTeam(String team) { this.team = team; }
}
