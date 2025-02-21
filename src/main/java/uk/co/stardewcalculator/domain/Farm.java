package uk.co.stardewcalculator.domain;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table
public class Farm implements Serializable {

    @Id
    @SequenceGenerator(
            name = "farm_sequence",
            sequenceName = "farm_sequence",
            allocationSize = 1)

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "farm_sequence"
    )

    private long id;
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
