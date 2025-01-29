package uk.co.stardewcalculator.crop.season.spring;

import uk.co.stardewcalculator.Season;
import uk.co.stardewcalculator.crop.types.Crop;

public class Garlic extends Crop {
    public Garlic() {
        super(40, 60, 75, 90, 120, 4, Season.SPRING);
    }

    @Override
    public String toString() {
        return "Garlic";
    }
}
