package com.spring.team.controller;

import com.spring.team.config.Proxy;
import com.spring.team.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("team-players")
public class TeamController {

    @Autowired
    private Proxy proxy;

    //Call Api Using RestTemplate
//    @GetMapping("/team/{from}/player/{to}")
//    public ResponseEntity<Team> teamWithPlayer(@PathVariable String from, @PathVariable String to){
////        Map<String, String> urlAttr = new HashMap<>();
////        urlAttr.put("from", from);
////        urlAttr.put("to", to);
////        ResponseEntity<Team> responseEntity = new RestTemplate().getForEntity(
////                "http://localhost:6666/football-players/buy/{from}/player/{to}",
////                Team.class, urlAttr
////        );
////       Team teamResponse =   responseEntity.getBody();
////        return new ResponseEntity<>(new Team(teamResponse.getId(),
////                teamResponse.getFrom(), teamResponse.getTo(), teamResponse.getMoneyTeam(), "NONE", "50"), HttpStatus.OK);
//        Map<String, String> urlAttr = new HashMap<>();
//        urlAttr.put("from", from);
//        urlAttr.put("to", to);
//        ResponseEntity<Team> teamResponseEntity = new RestTemplate().getForEntity(
//                "http://localhost:6666/football-players/buy/{from}/player/{to}",
//                Team.class, urlAttr
//        );
//        Team team = teamResponseEntity.getBody();
//        return new ResponseEntity<>(new Team(team.getId(), team.getFrom(), team.getTo(), team.getMoneyTeam(), "NONE", "50"), HttpStatus.OK);
//    }


    //Call Api Usin FeignClient
    @GetMapping("/team/{from}/player/{to}")
    public ResponseEntity<Team> teamWithPlayer(@PathVariable String from, @PathVariable String to){

        Team team = proxy.getFootballPlayer(from, to);
        team.setNote("NONE");
        team.setNumberTeam("200");
        return new ResponseEntity<>(
                team, HttpStatus.OK);

    }




















}
