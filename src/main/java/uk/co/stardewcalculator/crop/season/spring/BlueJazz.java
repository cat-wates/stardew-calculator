package uk.co.stardewcalculator.crop.season.spring;

import uk.co.stardewcalculator.Season;
import uk.co.stardewcalculator.crop.types.Crop;

public class BlueJazz extends Crop {
    public BlueJazz() {
        super(30, 50, 62, 75, 100, 7, Season.SPRING);
    }

    @Override
    public String toString() {
        return "Blue Jazz";
    }
}
