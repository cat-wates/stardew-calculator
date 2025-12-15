package uk.co.stardewcalculator.domain.season.summer;

import uk.co.stardewcalculator.domain.season.SeasonName;
import uk.co.stardewcalculator.domain.types.Crop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class RedCabbage extends Crop {

    public RedCabbage() {
        super(100, Map.of(BASIC, 260, SILVER, 325, GOLD, 390, IRIDIUM, 520), 9, SeasonName.SUMMER);
    }

    @Override
    public String toString() {
        return "Red Cabbage";
    }
}
