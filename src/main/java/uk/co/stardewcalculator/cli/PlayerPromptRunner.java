package uk.co.stardewcalculator.cli;

import uk.co.stardewcalculator.domain.Player;

public class PlayerPromptRunner {

    PlayerPrompt playerPrompt;

    public PlayerPromptRunner(PlayerPrompt playerPrompt) {
        this.playerPrompt = playerPrompt;
    }

    public Player run() {
        String username = playerPrompt.setUsername();
        double farmingLevel = playerPrompt.setFarmingLevel();
        int balance = playerPrompt.setBalance();
        boolean isTiller = playerPrompt.setTillerChoice(farmingLevel);
        boolean isAgriculturist = playerPrompt.setAgriculturistChoice(farmingLevel);
        return new Player(username, farmingLevel, balance, isTiller, isAgriculturist);
    }
}
