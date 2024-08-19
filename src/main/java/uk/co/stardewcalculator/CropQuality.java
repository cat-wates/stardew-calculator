package uk.co.stardewcalculator;

public class CropQuality {
    double farmingLevel;
    private double basicProbability;
    private double silverProbability;
    private double goldProbability;
    private double iridiumProbability;

    public CropQuality(double farmingLevel) {
        this.farmingLevel = farmingLevel;
    }

    public void setProbabilities() {
        goldProbability = 0.2 * (farmingLevel / 10) + (0.2 * 0) * ((farmingLevel + 2) / 12) + 0.01;
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
