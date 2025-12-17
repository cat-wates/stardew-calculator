package uk.co.stardewcalculator.domain.season.summer;

import uk.co.stardewcalculator.domain.season.SeasonType;
import uk.co.stardewcalculator.domain.types.Crop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class SummerSpangle extends Crop {

    public SummerSpangle() {
        super(50, Map.of(BASIC, 90, SILVER, 112, GOLD, 135, IRIDIUM, 180), 8, SeasonType.SUMMER);
    }

    @Override
    public String toString() {
        return "Summer Spangle";
    }
}
