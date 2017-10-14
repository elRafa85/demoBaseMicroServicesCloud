package com.example.dao;

import com.example.domain.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "players", rel = "jugaroritossodas")
public interface PlayerDao extends CrudRepository<Player,Long> {

}
