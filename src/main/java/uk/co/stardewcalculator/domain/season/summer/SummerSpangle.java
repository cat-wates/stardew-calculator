package uk.co.stardewcalculator.domain.season.summer;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class SummerSpangle extends Crop {

    public SummerSpangle() {
        super(50, Map.of(BASIC, 90, SILVER, 112, GOLD, 135, IRIDIUM, 180), 8, Season.SUMMER);
    }

    @Override
    public String toString() {
        return "Summer Spangle";
    }
}
