package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.types.ReproducingCrop;

public class GreenBean extends ReproducingCrop {
    public GreenBean() {
        super(60, 40, 50, 60, 80, 10, 3);
    }

    @Override
    public String toString() {
        return "GreenBean";
    }
}
