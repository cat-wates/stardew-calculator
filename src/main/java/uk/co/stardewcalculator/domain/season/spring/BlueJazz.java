package uk.co.stardewcalculator.domain.season.spring;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

public class BlueJazz extends Crop {
    public BlueJazz() {
        super(30, 50, 62, 75, 100, 7, Season.SPRING);
    }

    @Override
    public String toString() {
        return "Blue Jazz";
    }
}
