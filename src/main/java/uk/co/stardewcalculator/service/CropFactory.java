package uk.co.stardewcalculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.co.stardewcalculator.domain.types.Crop;
import uk.co.stardewcalculator.repository.CropRepository;

import java.util.Optional;

@Component
public class CropFactory {

    @Autowired
    CropRepository cropRepository;

    public Optional<Crop> assignCrop(String cropType) {
        Crop crop = null;
            switch (cropType) {
//            spring
                case "blue jazz", "bluejazz" -> crop = cropRepository.findByCrop("blue jazz");
                case "carrot" -> crop = cropRepository.findByCrop("carrot");
                case "cauliflower" -> crop = cropRepository.findByCrop("cauliflower");
                case "coffee bean", "coffeebean", "coffee" -> crop = cropRepository.findByCrop("coffee bean");
                case "garlic" -> crop = cropRepository.findByCrop("garlic");
                case "green bean", "greenbean" -> crop = cropRepository.findByCrop("green bean");
                case "kale" -> crop = cropRepository.findByCrop("kale");
                case "parsnip" -> crop = cropRepository.findByCrop("parsnip");
                case "potato" -> crop = cropRepository.findByCrop("potato");
                case "rhubarb" -> crop = cropRepository.findByCrop("rhubarb");
                case "strawberry" -> crop = cropRepository.findByCrop("strawberry");
                case "tulip" -> crop = cropRepository.findByCrop("tulip");
                case "unmilled rice", "unmilledrice", "rice" -> crop = cropRepository.findByCrop("unmilled rice");
            }
        return Optional.ofNullable(crop);
    }

}
