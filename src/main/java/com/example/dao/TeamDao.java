package com.example.dao;

import com.example.domain.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rafae on 10/11/2017.
 */

@Repository @RestResource(path = "teams", rel = "teams")
public interface TeamDao extends CrudRepository<Team,Long> {
    List<Team> findAll();
    Team findByName(String name);
}
