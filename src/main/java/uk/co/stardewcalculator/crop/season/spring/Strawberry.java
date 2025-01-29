package uk.co.stardewcalculator.crop.season.spring;

import uk.co.stardewcalculator.Season;
import uk.co.stardewcalculator.crop.types.ReproducingCrop;

public class Strawberry extends ReproducingCrop {
    public Strawberry() {
        super(100, 120, 150, 180, 240, 8, Season.SPRING, 4);
    }

    @Override
    public String toString() {
        return "Strawberry";
    }
}
