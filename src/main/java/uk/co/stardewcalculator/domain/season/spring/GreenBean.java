package uk.co.stardewcalculator.domain.season.spring;

import uk.co.stardewcalculator.domain.season.SeasonName;
import uk.co.stardewcalculator.domain.types.ReproducingCrop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class GreenBean extends ReproducingCrop {
    public GreenBean() {
        super(60, Map.of(BASIC, 40, SILVER, 50, GOLD, 60, IRIDIUM, 80), 10, SeasonName.SPRING,3);
    }

    @Override
    public String toString() {
        return "GreenBean";
    }
}
