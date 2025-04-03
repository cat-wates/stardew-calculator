package uk.co.stardewcalculator.domain.season.spring;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;
import static uk.co.stardewcalculator.domain.types.Quality.IRIDIUM;

public class Tulip extends Crop {
    public Tulip() {
        super(20, Map.of(BASIC, 30, SILVER, 37, GOLD, 45, IRIDIUM, 60), 6, Season.SPRING);
    }

    @Override
    public String toString() {
        return "Tulip";
    }
}
