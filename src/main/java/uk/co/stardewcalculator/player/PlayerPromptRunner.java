package uk.co.stardewcalculator.player;

import uk.co.stardewcalculator.player.Player;
import uk.co.stardewcalculator.player.PlayerPrompt;

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
