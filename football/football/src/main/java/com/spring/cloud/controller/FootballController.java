package com.spring.cloud.controller;

import com.spring.cloud.model.PlayerTeam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/football-players")
public class FootballController {

    @GetMapping("/buy/{from}/player/{to}")
    public ResponseEntity<PlayerTeam> buyPlayer(@PathVariable String from, @PathVariable String to){
        return new ResponseEntity<>(new PlayerTeam(1, from, to, 500, 600), HttpStatus.OK);
    }
}
