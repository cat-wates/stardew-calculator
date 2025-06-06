package uk.co.stardewcalculator.domain.season.fall;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class FairyRose extends Crop {

    public FairyRose() {
        super(200, Map.of(BASIC, 290, SILVER, 362, GOLD, 435, IRIDIUM, 580), 12, Season.FALL);
    }

    @Override
    public String toString() {
        return "Fairy Rose";
    }
}
