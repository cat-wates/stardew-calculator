package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.types.Crop;

public class Potato extends Crop {
    public Potato() {
        super(50, 80, 100, 120, 160, 6);
    }

    @Override
    public String toString() {
        return "Potato";
    }
}
