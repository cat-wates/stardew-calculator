package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class Cauliflower extends Crop {
    public Cauliflower() {
        super(80, 175, 218, 262, 350, 12, false, 0);
    }

    @Override
    public String toString() {
        return "Cauliflower";
    }
}
