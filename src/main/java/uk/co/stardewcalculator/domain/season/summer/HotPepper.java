package uk.co.stardewcalculator.domain.season.summer;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.ReproducingCrop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class HotPepper extends ReproducingCrop {
    public HotPepper() {
        super(40, Map.of(BASIC, 40, SILVER, 50, GOLD, 60, IRIDIUM, 80), 5, Season.SUMMER, 3);
    }

    @Override
    public String toString() {
        return "Hot Pepper";
    }
}
