package uk.co.stardewcalculator.domain.season.spring;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;
import static uk.co.stardewcalculator.domain.types.Quality.IRIDIUM;

public class Carrot extends Crop {
    public Carrot() {
        super(0, Map.of(BASIC, 35, SILVER, 43, GOLD, 52, IRIDIUM, 70), 3, Season.SPRING);
    }

    @Override
    public String toString() {
        return "Carrot";
    }
}
