package uk.co.stardewcalculator.domain.season.spring;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.Crop;

public class Cauliflower extends Crop {
    public Cauliflower() {
        super(80, 175, 218, 262, 350, 12, Season.SPRING);
    }

    @Override
    public String toString() {
        return "Cauliflower";
    }
}
