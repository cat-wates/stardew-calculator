package uk.co.stardewcalculator.domain.season.fall;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class Pumpkin extends Crop {

    public Pumpkin() {
        super(100, Map.of(BASIC, 320, SILVER, 400, GOLD, 480, IRIDIUM, 640), 13, Season.FALL);
    }

    @Override
    public String toString() {
        return "Pumpkin";
    }
}
