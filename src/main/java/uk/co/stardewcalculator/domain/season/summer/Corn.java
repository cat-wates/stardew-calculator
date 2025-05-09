package uk.co.stardewcalculator.domain.season.summer;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.ReproducingCrop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class Corn extends ReproducingCrop {

    public Corn() {
        super(150, Map.of(BASIC, 50, SILVER, 62, GOLD, 75, IRIDIUM, 100), 14, Season.SUMMER, 4);
    }

    @Override
    public String toString() {
        return "Corn";
    }
}
