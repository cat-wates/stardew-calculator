package uk.co.stardewcalculator.domain.season.summer;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.ReproducingCrop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class Hops extends ReproducingCrop {

    public Hops() {
        super(60, Map.of(BASIC, 25, SILVER, 31, GOLD, 37, IRIDIUM, 50), 11, Season.SUMMER, 1);
    }

    @Override
    public String toString() {
        return "Hops";
    }
}
