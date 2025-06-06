package uk.co.stardewcalculator.domain.season.fall;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.ReproducingCrop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class Grape extends ReproducingCrop {

    public Grape() {
        super(60, Map.of(BASIC, 80, SILVER, 100, GOLD, 120, IRIDIUM, 160), 10, Season.FALL, 3);
    }

    @Override
    public String toString() {
        return "Grape";
    }
}
