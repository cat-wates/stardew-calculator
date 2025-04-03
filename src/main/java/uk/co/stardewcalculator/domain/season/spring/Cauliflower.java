package uk.co.stardewcalculator.domain.season.spring;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;
import static uk.co.stardewcalculator.domain.types.Quality.IRIDIUM;

public class Cauliflower extends Crop {
    public Cauliflower() {
        super(80, Map.of(BASIC, 175, SILVER, 218, GOLD, 262, IRIDIUM, 350), 12, Season.SPRING);
    }

    @Override
    public String toString() {
        return "Cauliflower";
    }
}
