package avrash.source.model.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * Input dto of statistics of player per game.
 * For robustness, the type of ids fields is String
 */
@Data
public class StatsBaseDto {

    @NotBlank
    private String season;

    @Min(value = 0, message = "Points must be zero or a positive number.")
    private Integer points;

    @Min(value = 0, message = "Rebounds must be zero or a positive number.")
    private Integer rebounds;

    @Min(value = 0, message = "Assists must be zero or a positive number.")
    private Integer assists;

    @Min(value = 0, message = "Steals must be zero or a positive number.")
    private Integer steals;

    @Min(value = 0, message = "Blocks must be zero or a positive number.")
    private Integer blocks;

    @Min(value = 0, message = "Fouls must be zero or a positive number.")
    @Max(value = 6, message = "Fouls cannot exceed the limit of 6 per game.")
    private Integer fouls;

    @Min(value = 0, message = "Turnovers must be zero or a positive number.")
    private Integer turnovers;

    @Min(value = 0, message = "Minutes played must be zero or a positive number.")
    @Max(value = 48, message = "Minutes played cannot exceed 48 in a regulation game.")
    private Float minutes;
}
