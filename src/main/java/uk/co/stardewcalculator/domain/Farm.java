package uk.co.stardewcalculator.domain;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table
public class Farm implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private int seedCount;
    private int fertilizerLevel;

    @OneToOne(mappedBy = "farm")
    private Player player;

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
