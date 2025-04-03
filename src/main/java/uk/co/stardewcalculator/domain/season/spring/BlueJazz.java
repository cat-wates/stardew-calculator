package uk.co.stardewcalculator.domain.season.spring;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;
import static uk.co.stardewcalculator.domain.types.Quality.IRIDIUM;

public class BlueJazz extends Crop {
    public BlueJazz() {
        super(30, Map.of(BASIC, 50, SILVER, 62, GOLD, 75, IRIDIUM, 100), 7, Season.SPRING);
    }

    @Override
    public String toString() {
        return "Blue Jazz";
    }
}
