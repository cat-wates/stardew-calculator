package uk.co.stardewcalculator;

import uk.co.stardewcalculator.farm.FarmPrompt;
import uk.co.stardewcalculator.farm.FarmPromptRunner;
import uk.co.stardewcalculator.player.PlayerPrompt;
import uk.co.stardewcalculator.player.PlayerPromptRunner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlayerPrompt playerPrompt = new PlayerPrompt(sc);
        FarmPrompt farmPrompt = new FarmPrompt(sc);
        PlayerPromptRunner playerPromptRunner = new PlayerPromptRunner(playerPrompt);
        FarmPromptRunner farmPromptRunner = new FarmPromptRunner(farmPrompt);
        CommandLineInterface cli = new CommandLineInterface(sc, playerPromptRunner, farmPromptRunner);
        cli.runProgram();
    }
}

/*
Next steps:
- 
 */