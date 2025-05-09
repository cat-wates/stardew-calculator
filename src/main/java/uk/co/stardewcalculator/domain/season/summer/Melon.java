package uk.co.stardewcalculator.domain.season.summer;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class Melon extends Crop {

    public Melon() {
        super(80, Map.of(BASIC, 250, SILVER, 312, GOLD, 375, IRIDIUM, 500), 12, Season.SUMMER);
    }

    @Override
    public String toString() {
        return "Melon";
    }
}
