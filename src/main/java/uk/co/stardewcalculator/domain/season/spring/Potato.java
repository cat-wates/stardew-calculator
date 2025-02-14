package uk.co.stardewcalculator.domain.season.spring;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

public class Potato extends Crop {
    public Potato() {
        super(50, 80, 100, 120, 160, 6, Season.SPRING);
    }

    @Override
    public String toString() {
        return "Potato";
    }
}
