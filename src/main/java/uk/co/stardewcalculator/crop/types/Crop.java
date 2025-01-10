package uk.co.stardewcalculator.crop.types;

public abstract class Crop {
    private int costPerSeed; //from Pierre
    private int basicSellingPrice; //base price
    private int silverSellingPrice;
    private int goldSellingPrice;
    private int iridiumSellingPrice;
    private int timeToMaturity; //how long it takes for the plant to grow from initial planting of seed

    public Crop() {}

    public Crop(int costPerSeed, int basicSellingPrice, int silverSellingPrice, int goldSellingPrice, int iridiumSellingPrice, int timeToMaturity) {
        this.costPerSeed = costPerSeed;
        this.basicSellingPrice = basicSellingPrice;
        this.silverSellingPrice = silverSellingPrice;
        this.goldSellingPrice = goldSellingPrice;
        this.iridiumSellingPrice = iridiumSellingPrice;
        this.timeToMaturity = timeToMaturity;
    }

    public int getHarvestsPerSeason() {
        return 28 / timeToMaturity;
    }

    public int getCostPerSeed() {
        return costPerSeed;
    }

    public int getBasicSellingPrice() {
        return basicSellingPrice;
    }

    public int getSilverSellingPrice() {
        return silverSellingPrice;
    }

    public int getGoldSellingPrice() {
        return goldSellingPrice;
    }

    public int getIridiumSellingPrice() {
        return iridiumSellingPrice;
    }

    public int getTimeToMaturity() {
        return timeToMaturity;
    }

    @Override
    public String toString() {
        return "Invalid crop!";
    }
}
