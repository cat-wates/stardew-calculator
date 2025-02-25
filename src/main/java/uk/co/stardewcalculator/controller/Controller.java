package uk.co.stardewcalculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uk.co.stardewcalculator.service.BalanceSummaryService;
import uk.co.stardewcalculator.service.CropFactory;
import uk.co.stardewcalculator.domain.types.Crop;
import uk.co.stardewcalculator.domain.Farm;
import uk.co.stardewcalculator.domain.Player;
import uk.co.stardewcalculator.service.FarmService;
import uk.co.stardewcalculator.service.PlayerService;

import java.util.Optional;

@RestController
public class Controller {

    public PlayerService playerService;
    public FarmService farmService;

    @Autowired
    public Controller(PlayerService playerService, FarmService farmService) {
        this.playerService = playerService;
        this.farmService = farmService;
    }

    @GetMapping(value = "/")
    public ResponseEntity test(@RequestBody CropSummaryRequest cropSummaryRequest) {
        String crop = cropSummaryRequest.crop();
        Optional<Crop> crop1 = CropFactory.assignCrop(crop);
        Player player = cropSummaryRequest.player();
        Farm farm = cropSummaryRequest.farm();
        if (player.getFarmingLevel() < 5 && player.getTiller()) {
            player.setTiller(false);
        }
        if (player.getFarmingLevel() < 10 && player.getAgriculturist()) {
            player.setAgriculturist(false);
        }
        if (crop1.isPresent()) {
            return ResponseEntity.ok(BalanceSummaryService.getResults(farm, crop1.get(), player));
        } else {
            return new ResponseEntity<>("Invalid crop", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = "/players")
    public ResponseEntity playerTest() {
        return ResponseEntity.ok(playerService.getPlayers());
    }

    @GetMapping(value = "/farms")
    public ResponseEntity farmTest() {
        return ResponseEntity.ok(farmService.getFarms());
    }

    @PostMapping
    public void registerNewPlayer(@RequestBody Player player) {
        playerService.addNewPlayer(player);
    }

    @PostMapping
    public void registerNewFarm(@RequestBody Farm farm) {
        farmService.addNewFarm(farm);
    }

//    https://www.baeldung.com/spring-data-crud-repository-save


}
