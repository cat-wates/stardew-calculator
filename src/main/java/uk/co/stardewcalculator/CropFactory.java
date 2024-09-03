package uk.co.stardewcalculator;

import uk.co.stardewcalculator.crop.*;
import uk.co.stardewcalculator.crop.spring.*;

public class CropFactory {
    public static Crop assignCrop(String cropType) { //how do I do a try/catch here without it repeating?
        Crop crop;
            switch (cropType) {
//            spring
                case "blue jazz", "bluejazz" -> crop = new BlueJazz();
                case "carrot" -> crop = new Carrot();
                case "cauliflower" -> crop = new Cauliflower();
                case "coffee bean", "coffeebean", "coffee" -> crop = new CoffeeBean();
                case "garlic" -> crop = new Garlic();
                case "green bean", "greenbean" -> crop = new GreenBean();
                case "kale" -> crop = new Kale();
                case "parsnip" -> crop = new Parsnip();
                case "potato" -> crop = new Potato();
                case "rhubarb" -> crop = new Rhubarb();
                case "strawberry" -> crop = new Strawberry();
                case "tulip" -> crop = new Tulip();
                case "unmilled rice", "unmilledrice", "rice" -> crop = new UnmilledRice();
                default -> {
                    throw new IllegalArgumentException("Crop not found! Start again.");
                }
            }
        return crop;
    }

}
