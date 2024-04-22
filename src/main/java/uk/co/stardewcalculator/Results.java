package uk.co.stardewcalculator;

public class Results {
    public void printResults(String cropType, int seedCount) {
        Calculator calculator = new Calculator();
        CropFactory cropfactory = new CropFactory();
        Crop finalCrop = cropfactory.assignCrop(cropType); //finalCrop = crop
        int profit = calculator.calculateProfit(seedCount, finalCrop);
        System.out.println("Crop: " + finalCrop);
        System.out.println("Seed amount: " + seedCount);
        System.out.println("Buying price: " + finalCrop.costPerSeed + "g");
        System.out.println("Selling price: " + finalCrop.sellingPrice + "g");
        System.out.println("Expected profit: " + profit + "g");
    }
}
