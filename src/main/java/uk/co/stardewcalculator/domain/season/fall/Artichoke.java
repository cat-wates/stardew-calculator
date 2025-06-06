package uk.co.stardewcalculator.domain.season.fall;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class Artichoke extends Crop {

    public Artichoke() {
        super(30, Map.of(BASIC, 160, SILVER, 200, GOLD, 240, IRIDIUM, 320), 8, Season.FALL);
    }

    @Override
    public String toString() {
        return "Artichoke";
    }
}
