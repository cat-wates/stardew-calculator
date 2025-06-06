package uk.co.stardewcalculator.domain.season.winter;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class Powdermelon extends Crop {

    public Powdermelon() {
        super(0, Map.of(BASIC, 60, SILVER, 75, GOLD, 90, IRIDIUM, 105), 7, Season.WINTER);
    }

    @Override
    public String toString() {
        return "Powdermelon";
    }
}
