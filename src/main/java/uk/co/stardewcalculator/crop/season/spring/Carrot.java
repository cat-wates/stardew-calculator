package uk.co.stardewcalculator.crop.season.spring;

import uk.co.stardewcalculator.Season;
import uk.co.stardewcalculator.crop.types.Crop;

public class Carrot extends Crop {
    public Carrot() {
        super(0, 35, 43, 52, 70, 3, Season.SPRING);
    }

    @Override
    public String toString() {
        return "Carrot";
    }
}
