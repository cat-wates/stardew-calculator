package uk.co.stardewcalculator.domain.season.spring;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.ReproducingCrop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;
import static uk.co.stardewcalculator.domain.types.Quality.IRIDIUM;

public class GreenBean extends ReproducingCrop {
    public GreenBean() {
        super(60, Map.of(BASIC, 40, SILVER, 50, GOLD, 60, IRIDIUM, 80), 10, Season.SPRING,3);
    }

    @Override
    public String toString() {
        return "GreenBean";
    }
}
