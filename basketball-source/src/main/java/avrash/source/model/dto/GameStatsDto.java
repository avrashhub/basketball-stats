package avrash.source.model.dto;

import lombok.Data;

@Data
public class GameStatsDto extends StatsBaseDto {

    private String season;

    private String gameId;

    private String teamId;

    private String playerId;

    private Integer points;

    private Integer rebounds;

    private Integer assists;

    private Integer steals;

    private Integer blocks;

    private Integer fouls;

    private Integer turnovers;

    private Float minutes;

}
