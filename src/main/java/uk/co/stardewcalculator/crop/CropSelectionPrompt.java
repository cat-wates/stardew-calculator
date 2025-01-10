package uk.co.stardewcalculator.crop;

import uk.co.stardewcalculator.crop.CropFactory;
import uk.co.stardewcalculator.crop.types.Crop;

import java.util.Optional;
import java.util.Scanner;

public class CropSelectionPrompt {

    private final Scanner sc;

    public CropSelectionPrompt(Scanner sc) {
        this.sc = sc;
    }

    public Crop setCropChoice() {
            System.out.println("Which crop? ");
            String cropChoice = sc.nextLine().toLowerCase();
            Optional<Crop> userCrop = CropFactory.assignCrop(cropChoice); //get user crop
            if (userCrop.isEmpty()) { //check if user crop is present (they've passed a suitable crop type) - if not present, try again
                System.err.println("Invalid input - try again.");
                System.out.println("Which crop? ");
                cropChoice = sc.nextLine().toLowerCase();
                userCrop = CropFactory.assignCrop(cropChoice);
            }
        return userCrop.orElseThrow(NullPointerException::new); //get the crop or else throw exception
    }

    public String retryCropChoice() {
        System.out.println("Try another crop? (Y/N) ");
        return sc.nextLine();
    }
}
