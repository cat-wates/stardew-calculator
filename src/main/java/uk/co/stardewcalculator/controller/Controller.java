package uk.co.stardewcalculator.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import uk.co.stardewcalculator.Calculator;
import uk.co.stardewcalculator.Results;
import uk.co.stardewcalculator.crop.CropFactory;
import uk.co.stardewcalculator.crop.CropProfit;
import uk.co.stardewcalculator.crop.CropQuality;
import uk.co.stardewcalculator.crop.season.spring.BlueJazz;
import uk.co.stardewcalculator.crop.types.Crop;
import uk.co.stardewcalculator.farm.Farm;
import uk.co.stardewcalculator.player.Player;

import java.util.Optional;

@RestController
public class Controller {

    @GetMapping(value = "/",
    produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Results> test(@RequestBody CropSummaryRequest cropSummaryRequest) {
            String crop = cropSummaryRequest.crop();
            Optional<Crop> crop1 = CropFactory.assignCrop(crop);
            int fertilizerLevel = cropSummaryRequest.fertilizerLevel();
            int seedCount = cropSummaryRequest.seedCount();
            Farm farm = new Farm(seedCount, fertilizerLevel);
            double farmingLevel = cropSummaryRequest.farmingLevel();
            int balance = cropSummaryRequest.balance();
            Player player = new Player(farmingLevel, balance, false, false);
            if (crop1.isPresent()){
                return ResponseEntity.ok(Controller.getResults(farm, crop1.get(), player));
            } else {
                return ResponseEntity.ok(Controller.getResults(farm, new BlueJazz(), player));
            }
//        return "hello";
    }

    private static Results getResults(Farm farm, Crop finalCrop, Player player) {
        CropQuality cropQuality = new CropQuality(player.getFarmingLevel(), farm.getFertilizerLevel());
        CropProfit cropProfit = new CropProfit(cropQuality, finalCrop, farm.getSeedCount());
        Calculator calc = new Calculator(player, finalCrop, cropProfit);
        int minimumBalance = calc.calculateMinimumBalance();
        int potentialBalance = calc.calculatePotentialBalance();
        return new Results(finalCrop, farm.getSeedCount(), player.getBalance(), minimumBalance, potentialBalance);
    }


}
