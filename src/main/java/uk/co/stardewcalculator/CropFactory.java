package uk.co.stardewcalculator;

public class CropFactory {
    public CropFactory(String cropType) {
        Crop crop = switch (cropType) {
            case "parsnip" -> new Parsnip();
            case "kale" -> new Kale();
            default -> {
                System.out.println("Crop not found!");
                yield new Crop();
            }
        };
    }
}

