package uk.co.stardewcalculator.domain.season.spring;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;
import static uk.co.stardewcalculator.domain.types.Quality.IRIDIUM;

public class Rhubarb extends Crop {
    public Rhubarb() {
        super(100, Map.of(BASIC, 220, SILVER, 275, GOLD, 330, IRIDIUM, 440), 13, Season.SPRING);
    }

    @Override
    public String toString() {
        return "Rhubarb";
    }
}
