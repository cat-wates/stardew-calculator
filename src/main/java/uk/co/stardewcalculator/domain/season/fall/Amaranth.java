package uk.co.stardewcalculator.domain.season.fall;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class Amaranth extends Crop {

    public Amaranth() {
        super(70, Map.of(BASIC, 150, SILVER, 187, GOLD, 225, IRIDIUM, 300), 7, Season.FALL);
    }

    @Override
    public String toString() {
        return "Amaranth";
    }
}
