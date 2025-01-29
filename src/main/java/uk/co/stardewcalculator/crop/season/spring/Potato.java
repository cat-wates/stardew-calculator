package uk.co.stardewcalculator.crop.season.spring;

import uk.co.stardewcalculator.Season;
import uk.co.stardewcalculator.crop.types.Crop;

public class Potato extends Crop {
    public Potato() {
        super(50, 80, 100, 120, 160, 6, Season.SPRING);
    }

    @Override
    public String toString() {
        return "Potato";
    }
}
