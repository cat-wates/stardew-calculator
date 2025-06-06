package uk.co.stardewcalculator.domain.season.spring;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class UnmilledRice extends Crop {
    public UnmilledRice() {
        super(40, Map.of(BASIC, 30, SILVER, 37, GOLD, 45, IRIDIUM, 60), 6, Season.SPRING);
    }

    @Override
    public String toString() {
        return "Unmilled Rice";
    }
}
