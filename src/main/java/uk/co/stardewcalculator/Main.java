package uk.co.stardewcalculator;

import uk.co.stardewcalculator.crop.Crop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Stardew Valley profit calculator!");
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your current balance? ");
        int balance = Integer.parseInt(sc.nextLine());
        System.out.println("What is your farming level? ");
        double farmingLevel = Integer.parseInt(sc.nextLine());
        Player player = new Player(farmingLevel, balance);
        player.defineProfessions(farmingLevel);
        System.out.println("How many tiles do you have to fill? ");
        int seedCount = Integer.parseInt(sc.nextLine());
        //while loop
        System.out.println("Which crop? ");
        String cropType = sc.nextLine().toLowerCase();
        CropFactory cropfactory = new CropFactory(); //new instance of CropFactory called cropfactory
        Crop finalCrop = cropfactory.assignCrop(cropType); //finalCrop = crop (in cropfactory)
        Calculator calc = new Calculator(balance, farmingLevel);
        calc.setProbabilities(farmingLevel);
        int minimumBalance = calc.calculateMinimumBalance(seedCount, finalCrop);
        int potentialBalance = calc.calculatePotentialBalance(seedCount, finalCrop);
        Results results = new Results(finalCrop, seedCount, balance, minimumBalance, potentialBalance);
        results.printResults(finalCrop, seedCount);
    }
}