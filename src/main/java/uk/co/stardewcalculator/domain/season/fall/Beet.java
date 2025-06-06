package uk.co.stardewcalculator.domain.season.fall;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class Beet extends Crop {
//TODO this crop is from Oasis - special crop?
    public Beet() {
        super(20, Map.of(BASIC, 100, SILVER, 125, GOLD, 150, IRIDIUM, 200), 6, Season.FALL);
    }

    @Override
    public String toString() {
        return "Beet";
    }
}
