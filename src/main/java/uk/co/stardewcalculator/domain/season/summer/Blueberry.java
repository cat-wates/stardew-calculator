package uk.co.stardewcalculator.domain.season.summer;

import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.ReproducingCrop;

import java.util.Map;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class Blueberry extends ReproducingCrop {

        public Blueberry() {
            super(80, Map.of(BASIC, 50, SILVER, 62, GOLD, 75, IRIDIUM, 100), 13, Season.SUMMER, 4);
        }

        @Override
        public String toString() {
            return "Blueberry";
        }
}
