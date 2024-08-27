package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.ReproducingCrop;

public class CoffeeBean extends ReproducingCrop {
    public CoffeeBean() {
        super(2500, 15, 18, 22, 30, 10, true, 2);
    }

    @Override
    public String toString() {
        return "Coffee Bean";
    }
}
