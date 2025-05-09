package uk.co.stardewcalculator.domain.season.summer;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class Wheat extends Crop {

    public Wheat() {
        super(10, Map.of(BASIC, 25, SILVER, 31, GOLD, 37, IRIDIUM, 50), 4, Season.SUMMER);
    }

    @Override
    public String toString() {
        return "Wheat";
    }
}
