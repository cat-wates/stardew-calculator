package uk.co.stardewcalculator.service;

public class CropQuality {
    private final double basicProbability;
    private double silverProbability;
    private final double goldProbability;
    private final double iridiumProbability;

    public CropQuality(double farmingLevel, int fertilizerLevel) {
        goldProbability = 0.2 * (farmingLevel / 10) + (0.2 * fertilizerLevel) * ((farmingLevel + 2) / 12) + 0.01;
        silverProbability = 2 * goldProbability;
        iridiumProbability = goldProbability / 2;
        basicProbability = 1 - (silverProbability + goldProbability + iridiumProbability);
        if (silverProbability > 0.75) {
            silverProbability = 0.75;
        }
    }

    public double getBasicProbability() {
        return basicProbability;
    }

    public double getSilverProbability() {
        return silverProbability;
    }

    public double getGoldProbability() {
        return goldProbability;
    }

    public double getIridiumProbability() {
        return iridiumProbability;
    }


}
