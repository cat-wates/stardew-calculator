package uk.co.stardewcalculator.cli;

import uk.co.stardewcalculator.domain.Player;

public class PlayerPromptRunner {

    PlayerPrompt playerPrompt;

    public PlayerPromptRunner(PlayerPrompt playerPrompt) {
        this.playerPrompt = playerPrompt;
    }

    public Player run() {
        double farmingLevel = playerPrompt.setFarmingLevel();
        int balance = playerPrompt.setBalance();
        boolean isTiller = playerPrompt.setTillerChoice(farmingLevel);
        boolean isAgriculturist = playerPrompt.setAgriculturistChoice(farmingLevel);
        return new Player(farmingLevel, balance, isTiller, isAgriculturist);
    }
}
