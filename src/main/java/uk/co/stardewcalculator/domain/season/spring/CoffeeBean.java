package uk.co.stardewcalculator.domain.season.spring;

import uk.co.stardewcalculator.domain.season.SeasonName;
import uk.co.stardewcalculator.domain.types.ReproducingCrop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class CoffeeBean extends ReproducingCrop {
    public CoffeeBean() {
        super(2500, Map.of(BASIC, 15, SILVER, 18, GOLD, 22, IRIDIUM, 30), 10, SeasonName.SPRING, 2);
    }

    @Override
    public String toString() {
        return "Coffee Bean";
    }
}
