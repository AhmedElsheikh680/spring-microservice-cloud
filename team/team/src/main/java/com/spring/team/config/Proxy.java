package com.spring.team.config;

import com.spring.team.model.Team;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "football-players", url = "localhost:8075")
@FeignClient(name = "football-players")
@RibbonClient(name = "football-players")
public interface Proxy {

    @GetMapping("/football-players/buy/{from}/player/{to}")
     Team getFootballPlayer(@PathVariable String from, @PathVariable String to);
}
