package com.spring.team.controller;

import com.spring.team.model.Team;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("team-players")
public class TeamController {

    @GetMapping("/team/{from}/player/{to}")
    public ResponseEntity<Team> teamWithPlayer(@PathVariable String from, @PathVariable String to){
        Map<String, String> urlAttr = new HashMap<>();
        urlAttr.put("from", from);
        urlAttr.put("to", to);
        ResponseEntity<Team> responseEntity = new RestTemplate().getForEntity(
                "http://localhost:8888/football-players/buy/{from}/player/{to}",
                Team.class, urlAttr
        );
       Team teamResponse =   responseEntity.getBody();
        return new ResponseEntity<>(new Team(teamResponse.getId(), teamResponse.getFrom(), teamResponse.getTo(), teamResponse.getMoneyTeam(), "NONE", "50"), HttpStatus.OK);
    }

}
