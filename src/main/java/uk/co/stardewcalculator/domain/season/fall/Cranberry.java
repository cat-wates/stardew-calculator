package uk.co.stardewcalculator.domain.season.fall;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.ReproducingCrop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class Cranberry extends ReproducingCrop {

    public Cranberry() {
        super(240, Map.of(BASIC, 75, SILVER, 93, GOLD, 112, IRIDIUM, 150), 7, Season.FALL, 5);
    }

    @Override
    public String toString() {
        return "Cranberry";
    }
}
