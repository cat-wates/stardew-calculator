package uk.co.stardewcalculator.domain.season.spring;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

public class Tulip extends Crop {
    public Tulip() {
        super(20, 30, 37, 45, 60, 6, Season.SPRING);
    }

    @Override
    public String toString() {
        return "Tulip";
    }
}
