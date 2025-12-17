package uk.co.stardewcalculator.domain.season.spring;

import uk.co.stardewcalculator.domain.season.SeasonType;
import uk.co.stardewcalculator.domain.types.ReproducingCrop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class Strawberry extends ReproducingCrop {
    public Strawberry() {
        super(100, Map.of(BASIC, 120, SILVER, 150, GOLD, 180, IRIDIUM, 240), 8, SeasonType.SPRING, 4);
    }

    @Override
    public String toString() {
        return "Strawberry";
    }
}
