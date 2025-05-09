package uk.co.stardewcalculator.domain.season.summer;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class Radish extends Crop {

    public Radish() {
        super(40, Map.of(BASIC, 90, SILVER, 112, GOLD, 135, IRIDIUM, 180), 6, Season.SUMMER);
    }

    @Override
    public String toString() {
        return "Radish";
    }
}
