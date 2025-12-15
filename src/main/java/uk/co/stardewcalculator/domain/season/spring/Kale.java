package uk.co.stardewcalculator.domain.season.spring;

import uk.co.stardewcalculator.domain.season.SeasonName;
import uk.co.stardewcalculator.domain.types.Crop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class Kale extends Crop {
    public Kale() {
        super(70, Map.of(BASIC, 110, SILVER, 137, GOLD, 165, IRIDIUM, 220), 6, SeasonName.SPRING);
    }

    @Override
    public String toString() {
        return "Kale";
    }
}
