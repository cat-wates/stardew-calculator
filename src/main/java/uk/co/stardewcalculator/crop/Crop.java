package uk.co.stardewcalculator.crop;

public class Crop {
    public int costPerSeed; //from Pierre
    public int basicSellingPrice; //base price
    public int silverSellingPrice;
    public int goldSellingPrice;
    public int iridiumSellingPrice;
    public int timeToMaturity;

    public Crop() {
        costPerSeed = 0;
        basicSellingPrice = 0;
        silverSellingPrice = 0;
        goldSellingPrice = 0;
        iridiumSellingPrice = 0;
        timeToMaturity = 0;
    }

    @Override
    public String toString() {
        return "Invalid crop!";
    }
}
