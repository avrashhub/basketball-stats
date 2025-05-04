package avrash.source.model.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class GameStatsDto extends StatsBaseDto {

    @NotBlank
    private String gameId;

    @NotBlank
    private String teamId;

    @NotBlank
    private String playerId;


}
