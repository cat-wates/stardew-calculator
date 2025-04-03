package uk.co.stardewcalculator.domain.types;

public class PlantedCrop {

    Crop crop;
    private final int seedCount;
    private final int fertilizerLevel;

    public PlantedCrop(Crop crop, int seedCount, int fertilizerLevel) {
        this.crop = crop;
        this.seedCount = seedCount;
        this.fertilizerLevel = fertilizerLevel;
    }

    public Crop getCrop() {
        return crop;
    }

    public int getSeedCount() {
        return seedCount;
    }

    public int getFertilizerLevel() {
        return fertilizerLevel;
    }

    public int getSellingPrice(Quality quality) {
        return crop.getSellingPrice(quality) * seedCount;
    }
}
