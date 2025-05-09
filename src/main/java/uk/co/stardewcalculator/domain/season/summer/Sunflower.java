package uk.co.stardewcalculator.domain.season.summer;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class Sunflower extends Crop {

    public Sunflower() {
        super(200, Map.of(BASIC, 80, SILVER, 100, GOLD, 120, IRIDIUM, 160), 8, Season.SUMMER);
    }

    @Override
    public String toString() {
        return "Sunflower";
    }
}
