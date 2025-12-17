package uk.co.stardewcalculator.domain.types;

public class PlantedCrop {

    CropV2 crop;
    private final int seedCount;
    private final int fertilizerLevel;

    public PlantedCrop(CropV2 crop, int seedCount, int fertilizerLevel) {
        this.crop = crop;
        this.seedCount = seedCount;
        this.fertilizerLevel = fertilizerLevel;
    }

    public CropV2 getCrop() {
        return crop;
    }

    public int getSeedCount() {
        return seedCount;
    }

    public int getFertilizerLevel() {
        return fertilizerLevel;
    }

    public int getBasicSellingPrice() {
        return crop.getBasicSellingPrice() * seedCount;
    }

    public int getSilverSellingPrice() {
        return crop.getSilverSellingPrice() * seedCount;
    }

    public int getGoldSellingPrice() {
        return crop.getGoldSellingPrice() * seedCount;
    }

    public int getIridiumSellingPrice() {
        return crop.getIridiumSellingPrice() * seedCount;
    }
}
