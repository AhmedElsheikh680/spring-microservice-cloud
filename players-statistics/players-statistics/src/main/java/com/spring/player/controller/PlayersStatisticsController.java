package com.spring.player.controller;

import com.spring.player.config.PlayersStatisticsConfig;
import com.spring.player.model.PlayersStatistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players")
public class PlayersStatisticsController {

    @Autowired
    private PlayersStatisticsConfig playersStatisticsConfig;

    @GetMapping("/statistics")
    public PlayersStatistics getPlayersStatistics(){
//        return new PlayersStatistics(100, 50,"ALEX");
        return new PlayersStatistics(playersStatisticsConfig.getNumberTeams(), playersStatisticsConfig.getNumberPlayers(), playersStatisticsConfig.getCountry());

    }

}
