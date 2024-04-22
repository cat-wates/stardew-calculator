package uk.co.stardewcalculator;

public class CropFactory {
    public Crop assignCrop(String cropType) {
        Crop crop;

        switch (cropType) {
            case "parsnip" -> crop = new Parsnip();
            case "kale" -> crop = new Kale();
            default -> {
                System.out.println("Crop not found!");
                crop = new Crop();
            }
        }

        return crop;
    }
}
