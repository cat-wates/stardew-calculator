package uk.co.stardewcalculator.domain.season.spring;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

public class Carrot extends Crop {
    public Carrot() {
        super(0, 35, 43, 52, 70, 3, Season.SPRING);
    }

    @Override
    public String toString() {
        return "Carrot";
    }
}
