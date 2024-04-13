package uk.co.stardewcalculator;

public class Results {
    public void printResults(String cropType, int seedCount) {
        Calculator calculator = new Calculator();
        CropFactory cropFactory = new CropFactory();
        String crop = CropFactory(cropType);
        int profit = calculator.calculateProfit(seedCount, crop);
        System.out.println("Crop: " + crop);
        System.out.println("Seed amount: " + seedCount);
        System.out.println("Buying price: " + crop.costPerSeed + "g");
        System.out.println("Selling price: " + crop.sellingPrice +"g");
        System.out.println("Expected profit: " + profit + "g");
    }
}
