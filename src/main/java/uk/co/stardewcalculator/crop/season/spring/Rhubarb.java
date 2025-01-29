package uk.co.stardewcalculator.crop.season.spring;

import uk.co.stardewcalculator.Season;
import uk.co.stardewcalculator.crop.types.Crop;

public class Rhubarb extends Crop {
    public Rhubarb() {
        super(100, 220, 275, 330, 440, 13, Season.SPRING);
    }

    @Override
    public String toString() {
        return "Rhubarb";
    }
}
