package com.example.dao;

import com.example.domain.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rafae on 10/11/2017.
 */

@Repository
public interface TeamDao extends CrudRepository<Team,Long> {
    List<Team> findAll();
    Team findByName(String name);
}
