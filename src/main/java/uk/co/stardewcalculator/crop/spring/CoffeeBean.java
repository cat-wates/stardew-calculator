package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.types.ReproducingCrop;

public class CoffeeBean extends ReproducingCrop {
    public CoffeeBean() {
        super(2500, 15, 18, 22, 30, 10, 2);
    }

    @Override
    public String toString() {
        return "Coffee Bean";
    }
}
