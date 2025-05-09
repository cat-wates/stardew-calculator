package uk.co.stardewcalculator.domain.season.summer;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.ReproducingCrop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class Tomato extends ReproducingCrop {

    public Tomato() {
        super(50, Map.of(BASIC, 60, SILVER, 75, GOLD, 90, IRIDIUM, 120), 11, Season.SUMMER, 4);
    }

    @Override
    public String toString() {
        return "Tomato";
    }
}
