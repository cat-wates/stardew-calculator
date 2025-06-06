package uk.co.stardewcalculator.domain.season.fall;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class BokChoy extends Crop {

    public BokChoy() {
        super(50, Map.of(BASIC, 80, SILVER, 100, GOLD, 120, IRIDIUM, 160), 4, Season.FALL);
    }

    @Override
    public String toString() {
        return "Bok Choy";
    }
}
