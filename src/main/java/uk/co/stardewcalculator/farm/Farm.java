package uk.co.stardewcalculator.farm;

import java.io.Serializable;

public class Farm implements Serializable {

    private int seedCount;
    private int fertilizerLevel;

    public Farm(int seedCount, int fertilizerLevel) {
        this.seedCount = seedCount;
        this.fertilizerLevel = fertilizerLevel;
    }

    public Farm() {}

    public int getFertilizerLevel() {
        return fertilizerLevel;
    }

    public int getSeedCount() {
        return seedCount;
    }

    public void setFertilizerLevel(int fertilizerLevel) {
        this.fertilizerLevel = fertilizerLevel;
    }

    public void setSeedCount(int seedCount) {
        this.seedCount = seedCount;
    }
}
