package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.types.ReproducingCrop;

public class Strawberry extends ReproducingCrop {
    public Strawberry() {
        super(100, 120, 150, 180, 240, 8, 4);
    }

    @Override
    public String toString() {
        return "Strawberry";
    }
}
