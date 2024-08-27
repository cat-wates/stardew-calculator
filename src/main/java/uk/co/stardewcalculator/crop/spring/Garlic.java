package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class Garlic extends Crop {
    public Garlic() {
        super(40, 60, 75, 90, 120, 4, false);
    }

    @Override
    public String toString() {
        return "Garlic";
    }
}
