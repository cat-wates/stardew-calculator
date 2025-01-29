package uk.co.stardewcalculator.crop.season.spring;

import uk.co.stardewcalculator.Season;
import uk.co.stardewcalculator.crop.types.Crop;

public class Parsnip extends Crop {
    public Parsnip() {
        super(20, 35, 43, 52, 70, 4, Season.SPRING);
    }

    @Override
    public String toString() {
        return "Parsnip";
    }
}
