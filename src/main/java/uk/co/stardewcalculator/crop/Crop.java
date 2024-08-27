package uk.co.stardewcalculator.crop;

public abstract class Crop {
    public int costPerSeed; //from Pierre
    public int basicSellingPrice; //base price
    public int silverSellingPrice;
    public int goldSellingPrice;
    public int iridiumSellingPrice;
    public int timeToMaturity; //how long it takes for the plant to grow from initial planting of seed
    public boolean isReproducing;

    public Crop() {}
    public Crop(int costPerSeed, int basicSellingPrice, int silverSellingPrice, int goldSellingPrice, int iridiumSellingPrice, int timeToMaturity, boolean isReproducing) {
        this.costPerSeed = costPerSeed;
        this.basicSellingPrice = basicSellingPrice;
        this.silverSellingPrice = silverSellingPrice;
        this.goldSellingPrice = goldSellingPrice;
        this.iridiumSellingPrice = iridiumSellingPrice;
        this.timeToMaturity = timeToMaturity;
        this.isReproducing = isReproducing;
    }

    @Override
    public String toString() {
        return "Invalid crop!";
    }
}
