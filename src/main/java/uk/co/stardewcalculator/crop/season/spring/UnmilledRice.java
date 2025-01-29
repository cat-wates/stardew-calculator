package uk.co.stardewcalculator.crop.season.spring;

import uk.co.stardewcalculator.Season;
import uk.co.stardewcalculator.crop.types.Crop;

public class UnmilledRice extends Crop {
    public UnmilledRice() {
        super(40, 30, 37, 45, 60, 6, Season.SPRING);
    }

    @Override
    public String toString() {
        return "Unmilled Rice";
    }
}
