package uk.co.stardewcalculator.domain.season.spring;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

public class Kale extends Crop {
    public Kale() {
        super(70, 110, 137, 165, 220, 6, Season.SPRING);
    }

    @Override
    public String toString() {
        return "Kale";
    }
}
