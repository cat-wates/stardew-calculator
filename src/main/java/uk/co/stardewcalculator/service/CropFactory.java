package uk.co.stardewcalculator.service;

import uk.co.stardewcalculator.domain.types.Crop;
import uk.co.stardewcalculator.domain.season.spring.*;

import java.util.Optional;

public class CropFactory {
    public static Optional<Crop> assignCrop(String cropType) {
        Crop crop = null;
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
            }
        return Optional.ofNullable(crop);
    }

}
