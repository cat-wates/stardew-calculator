package uk.co.stardewcalculator;

public class PlayerPromptRunner {

    PlayerPrompt playerPrompt;

    public PlayerPromptRunner(PlayerPrompt playerPrompt) {
        this.playerPrompt = playerPrompt;
    }

    public Player run() {
        double farmingLevel = playerPrompt.setFarmingLevel();
        int balance = playerPrompt.setBalance();
        boolean isTiller = playerPrompt.setTillerChoice(farmingLevel);
        boolean isAgriculturalist = playerPrompt.setAgriculturalistChoice(farmingLevel);
        return new Player(farmingLevel, balance, isTiller, isAgriculturalist);
    }
}
