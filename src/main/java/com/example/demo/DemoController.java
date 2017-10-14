package com.example.demo;

import com.example.dao.TeamDao;
import com.example.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rafae on 8/22/2017.
 */
@RestController
public class DemoController {

    @Autowired
    TeamDao teamDao;

    @RequestMapping("/hi/{teamName}")
    public Team hiThere(@PathVariable String teamName){

        return teamDao.findByName(teamName);

    }
}
