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

@RestController
@RequestMapping("team-players")
public class TeamController {

    @GetMapping("/team/{from}/player/{to}")
    public ResponseEntity<Team> teamWithPlayer(@PathVariable String from, @PathVariable String to){
        return new ResponseEntity<>(new Team(1, from, to, 100, "NONE", "50"), HttpStatus.OK);

    }

}
