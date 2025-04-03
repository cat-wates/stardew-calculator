package uk.co.stardewcalculator.domain.season.spring;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.ReproducingCrop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;
import static uk.co.stardewcalculator.domain.types.Quality.IRIDIUM;

public class CoffeeBean extends ReproducingCrop {
    public CoffeeBean() {
        super(2500, Map.of(BASIC, 15, SILVER, 18, GOLD, 22, IRIDIUM, 30), 10, Season.SPRING, 2);
    }

    @Override
    public String toString() {
        return "Coffee Bean";
    }
}
