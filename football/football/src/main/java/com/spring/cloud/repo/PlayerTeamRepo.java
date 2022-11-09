package com.spring.cloud.repo;

import com.spring.cloud.model.PlayerTeam;
import javafx.print.PageLayout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerTeamRepo extends JpaRepository<PlayerTeam, Long> {

    PlayerTeam findByFromAndTo(String from, String to);
}
