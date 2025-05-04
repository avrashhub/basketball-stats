package avrash.source.model.dto;

import lombok.Data;

/**
 * Input dto of statistics of player per game.
 * For robustness, the type of ids fields is String
 */
@Data
public class StatsBaseDto {

    private String season;

    private Integer points;

    private Integer rebounds;

    private Integer assists;

    private Integer steals;

    private Integer blocks;

    private Integer fouls;

    private Integer turnovers;

    private Float minutes;
}
