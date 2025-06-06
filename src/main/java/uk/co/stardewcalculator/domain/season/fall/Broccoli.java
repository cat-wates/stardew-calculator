package uk.co.stardewcalculator.domain.season.fall;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.ReproducingCrop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class Broccoli extends ReproducingCrop {
//TODO no cost - what to do here?
    public Broccoli() {
        super(0, Map.of(BASIC, 70, SILVER, 87, GOLD, 105, IRIDIUM, 140), 8, Season.FALL, 4);
    }

    @Override
    public String toString() {
        return "Broccoli";
    }
}
