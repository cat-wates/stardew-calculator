package uk.co.stardewcalculator;

import java.util.Scanner;

public class FarmPrompt {

    private final Scanner sc;

    public FarmPrompt(Scanner sc) {
        this.sc = sc;
    }

    public int setSeedCount() {
        int seedCount;
        try {
            System.out.println("How many tiles do you have to fill? ");
            seedCount = Integer.parseInt(sc.nextLine());
        }
        catch (NumberFormatException nfe){
            System.err.println("Invalid input - try again.");
            System.out.println("How many tiles do you have to fill? ");
            seedCount = Integer.parseInt(sc.nextLine());
        }
        return seedCount;
    }

    public int setFertilizerLevel() {
        int fertilizerLevel;
        try {
            System.out.println("Which fertilizer do you use? (0 - 3) ");
            System.out.println("0 - normal soil");
            System.out.println("1 - basic fertilizer");
            System.out.println("2 - quality fertilizer");
            System.out.println("3 - deluxe fertilizer");
            fertilizerLevel = Integer.parseInt(sc.nextLine());
            if (fertilizerLevel < 0 || fertilizerLevel > 3) {
                throw new NumberFormatException();
            }
        }
        catch (NumberFormatException nfe) {
            System.err.println("Invalid input - try again.");
            System.out.println("Which fertilizer do you use? (0 - 3) ");
            System.out.println("0 - normal soil");
            System.out.println("1 - basic fertilizer");
            System.out.println("2 - quality fertilizer");
            System.out.println("3 - deluxe fertilizer");
            fertilizerLevel = Integer.parseInt(sc.nextLine());
        }
        return fertilizerLevel;
    }
}
