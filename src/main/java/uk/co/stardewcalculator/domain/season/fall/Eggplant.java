package uk.co.stardewcalculator.domain.season.fall;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.ReproducingCrop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class Eggplant extends ReproducingCrop {

    public Eggplant() {
        super(20, Map.of(BASIC, 60, SILVER, 75, GOLD, 90, IRIDIUM, 120), 5, Season.FALL, 5);
    }

    @Override
    public String toString() {
        return "Eggplant";
    }
}
