package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class GreenBean extends Crop {
    public GreenBean() {
        super(60, 40, 50, 60, 80, 10, true, 3);
    }

    @Override
    public String toString() {
        return "GreenBean";
    }
}
