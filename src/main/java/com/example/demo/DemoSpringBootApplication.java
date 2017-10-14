package com.example.demo;

import com.example.dao.TeamDao;
import com.example.domain.Player;
import com.example.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
@EntityScan(basePackages = "com.example")
@EnableJpaRepositories(basePackages = "com.example.dao")
public class DemoSpringBootApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(DemoSpringBootApplication.class);
	}

	@PostConstruct
	public void init(){
		Set<Player> players = new HashSet<>();
		players.add(new Player("Charlie Brown", "pitcher"));
		players.add(new Player("Snoopy", "1B"));

		Team team = new Team("California", "peanuts", players);
        teamDao.save(team);
	}
	@Autowired
	TeamDao teamDao;



}
