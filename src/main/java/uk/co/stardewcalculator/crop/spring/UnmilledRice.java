package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class UnmilledRice extends Crop {
    public UnmilledRice() {
        super(40, 30, 37, 45, 60, 6, false);
    }

    @Override
    public String toString() {
        return "Unmilled Rice";
    }
}
