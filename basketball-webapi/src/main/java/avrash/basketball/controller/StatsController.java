package avrash.basketball.controller;

import avrash.basketball.model.dto.PlayerStatsDto;
import avrash.basketball.model.dto.TeamStatsDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("basketball/stats")
public class StatsController {

    @GetMapping("/season/{season}/player/{player}")
    public PlayerStatsDto getStatsBySeasonAndPlayer(@PathVariable String season, @PathVariable String player) {
        var stats = new PlayerStatsDto();
        stats.setSeason(season);
        stats.setPlayerId(player);
        return stats;
    }

    @GetMapping("/season/{season}/team/{team}")
    public TeamStatsDto getStatsBySeasonAndTeam(@PathVariable String season, @PathVariable String team) {
        var stats = new TeamStatsDto();
        stats.setSeason(season);
        stats.setTeamId(team);
        return stats;
    }
}
