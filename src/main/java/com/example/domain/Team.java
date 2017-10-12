package com.example.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by rafae on 10/11/2017.
 */
@Entity
public class Team {

    @Id @GeneratedValue
    private Long id;

    private String name;
    private String location;
    private String mascotte;

    @OneToMany(cascade = CascadeType.ALL) @JoinColumn(name = "teamId")
    private Set<Player> players;

    public Team() {
    }

    public Team(String name, String location, String mascotte, Set<Player> players) {

        this.name = name;
        this.location = location;
        this.mascotte = mascotte;
        this.players = players;
    }

    public Team(String name, String location, Set<Player> players) {
        this.name = name;
        this.location = location;
        this.players = players;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMascotte() {
        return mascotte;
    }

    public void setMascotte(String mascotte) {
        this.mascotte = mascotte;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}
