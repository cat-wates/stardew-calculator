package uk.co.stardewcalculator.domain.season.spring;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

public class Rhubarb extends Crop {
    public Rhubarb() {
        super(100, 220, 275, 330, 440, 13, Season.SPRING);
    }

    @Override
    public String toString() {
        return "Rhubarb";
    }
}
