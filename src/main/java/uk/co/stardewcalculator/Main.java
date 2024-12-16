package uk.co.stardewcalculator;

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