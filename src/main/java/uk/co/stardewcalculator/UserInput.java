package uk.co.stardewcalculator;

public class UserInput {

    private int balance;
    private double farmingLevel;
    private boolean isTiller;
    private boolean isAgriculturalist;
    private int seedCount;
    private int fertilizerLevel;

    public UserInput() {
    }

//    public void promptRunner(PlayerPrompt pp) {
//        balance = pp.setBalance();
//        farmingLevel = pp.setFarmingLevel();
//        isTiller = pp.setTillerChoice(farmingLevel);
//        isAgriculturalist = pp.setAgriculturalistChoice(farmingLevel);
//        seedCount = pp.setSeedCount();
//        fertilizerLevel = pp.setFertilizerLevel();
//    }

    public int getBalance() {
        return balance;
    }

    public double getFarmingLevel() {
        return farmingLevel;
    }

    public boolean getTiller() {
        return isTiller;
    }

    public boolean getAgriculturalist() {
        return isAgriculturalist;
    }

    public int getSeedCount() {
        return seedCount;
    }

    public int getFertilizerLevel() {
        return fertilizerLevel;
    }
}
