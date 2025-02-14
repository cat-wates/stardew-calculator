package uk.co.stardewcalculator.domain.season.spring;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.ReproducingCrop;

public class CoffeeBean extends ReproducingCrop {
    public CoffeeBean() {
        super(2500, 15, 18, 22, 30, 10, Season.SPRING, 2);
    }

    @Override
    public String toString() {
        return "Coffee Bean";
    }
}
