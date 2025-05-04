package avrash.source.controller;

import avrash.source.model.dto.GameStatsDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("basketball/stats")

public class SourceController {

    @PostMapping("insert/bulk")
    public void postBulk(@RequestBody List<GameStatsDto> gameStatsDto) {

    }


}
