package uk.co.stardewcalculator.domain.types;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import uk.co.stardewcalculator.domain.season.Season;

import java.io.Serializable;

@Entity
@Table
public class CropV2 implements Serializable {

    @Id String crop;
    int costPerSeedPierre;
    int costPerSeedJojo;
    int basicSellingPrice;
    int silverSellingPrice;
    int goldSellingPrice;
    int iridiumSellingPrice;
    int timeToMaturity;
    @Nullable Integer timeToRegrow;
    Season season;

    public CropV2() {}

    //TODO simplify constructor
    public CropV2(String crop, int costPerSeedPierre, int costPerSeedJojo, int basicSellingPrice, int silverSellingPrice, int goldSellingPrice, int iridiumSellingPrice, int timeToMaturity, @Nullable Integer timeToRegrow, Season season) {
        this.crop = crop;
        this.costPerSeedPierre = costPerSeedPierre;
        this.costPerSeedJojo = costPerSeedJojo;
        this.basicSellingPrice = basicSellingPrice;
        this.silverSellingPrice = silverSellingPrice;
        this.goldSellingPrice = goldSellingPrice;
        this.iridiumSellingPrice = iridiumSellingPrice;
        this.timeToMaturity = timeToMaturity;
        this.timeToRegrow = timeToRegrow;
        this.season = season;
    }

    public int getIridiumSellingPrice() {
        return iridiumSellingPrice;
    }

    public void setIridiumSellingPrice(int iridiumSellingPrice) {
        this.iridiumSellingPrice = iridiumSellingPrice;
    }

    public String getCrop() {
        return crop;
    }

    public void setCrop(String crop) {
        this.crop = crop;
    }

    public int getCostPerSeedPierre() {
        return costPerSeedPierre;
    }

    public void setCostPerSeedPierre(int costPerSeedPierre) {
        this.costPerSeedPierre = costPerSeedPierre;
    }

    public int getCostPerSeedJojo() {
        return costPerSeedJojo;
    }

    public void setCostPerSeedJojo(int costPerSeedJojo) {
        this.costPerSeedJojo = costPerSeedJojo;
    }

    public int getBasicSellingPrice() {
        return basicSellingPrice;
    }

    public void setBasicSellingPrice(int basicSellingPrice) {
        this.basicSellingPrice = basicSellingPrice;
    }

    public int getSilverSellingPrice() {
        return silverSellingPrice;
    }

    public void setSilverSellingPrice(int silverSellingPrice) {
        this.silverSellingPrice = silverSellingPrice;
    }

    public int getGoldSellingPrice() {
        return goldSellingPrice;
    }

    public void setGoldSellingPrice(int goldSellingPrice) {
        this.goldSellingPrice = goldSellingPrice;
    }

    public int getTimeToMaturity() {
        return timeToMaturity;
    }

    public void setTimeToMaturity(int timeToMaturity) {
        this.timeToMaturity = timeToMaturity;
    }

    @Nullable
    public Integer getTimeToRegrow() {
        return timeToRegrow;
    }

    public void setTimeToRegrow(@Nullable Integer timeToRegrow) {
        this.timeToRegrow = timeToRegrow;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}
