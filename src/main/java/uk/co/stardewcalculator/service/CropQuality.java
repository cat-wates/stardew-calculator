package uk.co.stardewcalculator.service;

public class CropQuality {

    private final double silverProbabilityLimit = 0.75;

    public CropQuality() {
    }

    public double getBasicProbability(double farmingLevel, int fertilizerLevel) {
        double goldProbability = getGoldProbability(farmingLevel, fertilizerLevel);
        double silverProbability = getSilverProbability(farmingLevel, fertilizerLevel);
        double iridiumProbability = getIridiumProbability(farmingLevel, fertilizerLevel);
        return 1 - (silverProbability + goldProbability + iridiumProbability);
    }

    public double getSilverProbability(double farmingLevel, int fertilizerLevel) {
        double goldProbability = getGoldProbability(farmingLevel, fertilizerLevel);
        double silverProbability = 2 * goldProbability;
        if (silverProbability > silverProbabilityLimit) {
            silverProbability = silverProbabilityLimit;
        }
        return silverProbability;
    }

    public double getGoldProbability(double farmingLevel, int fertilizerLevel) {
        return 0.2 * (farmingLevel / 10) + (0.2 * fertilizerLevel) * ((farmingLevel + 2) / 12) + 0.01;
    }

    public double getIridiumProbability(double farmingLevel, int fertilizerLevel) {
        double goldProbability = getGoldProbability(farmingLevel, fertilizerLevel);
        return goldProbability / 2;
    }


}
