package uk.co.stardewcalculator.domain.season.spring;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.ReproducingCrop;

public class GreenBean extends ReproducingCrop {
    public GreenBean() {
        super(60, 40, 50, 60, 80, 10, Season.SPRING,3);
    }

    @Override
    public String toString() {
        return "GreenBean";
    }
}
