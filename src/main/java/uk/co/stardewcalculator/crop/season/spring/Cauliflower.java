package uk.co.stardewcalculator.crop.season.spring;

import uk.co.stardewcalculator.Season;
import uk.co.stardewcalculator.crop.types.Crop;

public class Cauliflower extends Crop {
    public Cauliflower() {
        super(80, 175, 218, 262, 350, 12, Season.SPRING);
    }

    @Override
    public String toString() {
        return "Cauliflower";
    }
}
