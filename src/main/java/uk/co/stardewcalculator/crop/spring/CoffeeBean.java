package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class CoffeeBean extends Crop {
    public CoffeeBean() {
        super(2500, 15, 18, 22, 30, 10, true, 2);
    }

    @Override
    public String toString() {
        return "Coffee Bean";
    }
}
