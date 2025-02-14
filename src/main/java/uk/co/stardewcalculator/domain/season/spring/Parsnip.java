package uk.co.stardewcalculator.domain.season.spring;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

public class Parsnip extends Crop {
    public Parsnip() {
        super(20, 35, 43, 52, 70, 4, Season.SPRING);
    }

    @Override
    public String toString() {
        return "Parsnip";
    }
}
