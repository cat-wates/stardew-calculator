package uk.co.stardewcalculator.domain.season.spring;

import uk.co.stardewcalculator.domain.season.SeasonName;
import uk.co.stardewcalculator.domain.types.Crop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class Garlic extends Crop {
    public Garlic() {
        super(40, Map.of(BASIC, 60, SILVER, 75, GOLD, 90, IRIDIUM, 120), 4, SeasonName.SPRING);
    }

    @Override
    public String toString() {
        return "Garlic";
    }
}
