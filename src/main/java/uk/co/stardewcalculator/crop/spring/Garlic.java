package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.types.Crop;

public class Garlic extends Crop {
    public Garlic() {
        super(40, 60, 75, 90, 120, 4);
    }

    @Override
    public String toString() {
        return "Garlic";
    }
}
