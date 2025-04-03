package uk.co.stardewcalculator.domain.season.spring;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;
import static uk.co.stardewcalculator.domain.types.Quality.IRIDIUM;

public class Potato extends Crop {
    public Potato() {
        super(50, Map.of(BASIC, 80, SILVER, 100, GOLD, 120, IRIDIUM, 160), 6, Season.SPRING);
    }

    @Override
    public String toString() {
        return "Potato";
    }
}
