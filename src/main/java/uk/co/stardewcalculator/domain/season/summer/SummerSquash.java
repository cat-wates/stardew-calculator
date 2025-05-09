package uk.co.stardewcalculator.domain.season.summer;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.ReproducingCrop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class SummerSquash extends ReproducingCrop {

    public SummerSquash() {
        super(0, Map.of(BASIC, 45, SILVER, 56, GOLD, 67, IRIDIUM, 90), 6, Season.SUMMER, 3);
    }

    @Override
    public String toString() {
        return "Summer Squash";
    }
}
