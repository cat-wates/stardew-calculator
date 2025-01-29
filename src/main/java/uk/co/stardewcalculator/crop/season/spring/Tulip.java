package uk.co.stardewcalculator.crop.season.spring;

import uk.co.stardewcalculator.Season;
import uk.co.stardewcalculator.crop.types.Crop;

public class Tulip extends Crop {
    public Tulip() {
        super(20, 30, 37, 45, 60, 6, Season.SPRING);
    }

    @Override
    public String toString() {
        return "Tulip";
    }
}
