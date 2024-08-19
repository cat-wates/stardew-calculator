package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class Kale extends Crop {
    public Kale() {
        super(70, 110, 137, 165, 220, 6, false, 0);
    }

    @Override
    public String toString() {
        return "Kale";
    }
}
