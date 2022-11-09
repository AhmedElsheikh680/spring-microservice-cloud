package com.spring.cloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerTeam {

    private long id;

    private String from;

    private String to;

    private int moneyPlayer;

    private int moneyTeam;
}
