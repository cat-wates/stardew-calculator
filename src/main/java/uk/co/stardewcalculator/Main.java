package uk.co.stardewcalculator;

import uk.co.stardewcalculator.crop.Crop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Stardew Valley profit calculator!");
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your farming level? ");
        int farmingLevel = Integer.parseInt(sc.nextLine());
        Player player = new Player(farmingLevel);
        player.defineProfessions(farmingLevel);
        System.out.print("How many tiles do you have to fill? ");
        int seedCount = Integer.parseInt(sc.nextLine());
        System.out.println("Which crop? ");
        String cropType = sc.nextLine().toLowerCase();
        CropFactory cropfactory = new CropFactory(); //new instance of CropFactory called cropfactory
        Crop finalCrop = cropfactory.assignCrop(cropType); //finalCrop = crop (in cropfactory)
        Calculator calc = new Calculator();
        int profit = calc.calculateProfit(seedCount, finalCrop);
        Results results = new Results(finalCrop, seedCount, profit);
        results.printResults(finalCrop, seedCount);
    }
}