package uk.co.stardewcalculator;

public class Farm {

    private final int seedCount;
    private final int fertilizerLevel;

    public Farm(int seedCount, int fertilizerLevel) {
        this.seedCount = seedCount;
        this.fertilizerLevel = fertilizerLevel;
    }

    public int getFertilizerLevel() {
        return fertilizerLevel;
    }

    public int getSeedCount() {
        return seedCount;
    }
}
