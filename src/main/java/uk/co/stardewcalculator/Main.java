package uk.co.stardewcalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Stardew Valley profit calculator!");
        Scanner sc = new Scanner(System.in);
        System.out.print("How many seeds do you have? ");
        int seedCount = Integer.parseInt(sc.nextLine());
        System.out.println("Which crop? ");
        String cropType = sc.nextLine().toLowerCase();
        Calculator calculator = new Calculator();
        int profit;
        if (seedCount>0) {
            Crop crop = switch (cropType) {
                case "parsnip" -> new Parsnip();
                case "kale" -> new Kale();
                default -> {
                    System.out.println("Crop not found!");
                    yield new Crop();
                }
            };
            profit = calculator.calculateProfit(seedCount, crop);
            System.out.println("Crop: " + cropType);
            System.out.println("Seed amount: " + seedCount);
            System.out.println("Buying price: " + crop.costPerSeed + "g");
            System.out.println("Selling price: " + crop.sellingPrice +"g");
            System.out.println("Expected profit: " + profit + "g");
        }
        else {
            System.out.println("Error: Number must be greater than 0!");
        }
    }
}