package uk.co.stardewcalculator.crop;

public class Crop {
    public int costPerSeed; //from Pierre
    public int sellingPrice; //base price
    public Crop() {
        costPerSeed = 0;
        sellingPrice = 0;
    }

    @Override
    public String toString() {
        return "Invalid crop!";
    }
}
