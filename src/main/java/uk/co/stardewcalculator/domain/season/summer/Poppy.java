package uk.co.stardewcalculator.domain.season.summer;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class Poppy extends Crop {

    public Poppy() {
        super(100, Map.of(BASIC, 140, SILVER, 175, GOLD, 210, IRIDIUM, 280), 7, Season.SUMMER);
    }

    @Override
    public String toString() {
        return "Poppy";
    }
}
