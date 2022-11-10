package com.spring.team.config;

import com.spring.team.model.Team;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "football-players", url = "localhost:6666")
public interface ApiCall {

    @GetMapping("/football-players/buy/{from}/player/{to}")
     Team getFootballPlayer(@PathVariable String from, @PathVariable String to);
}
