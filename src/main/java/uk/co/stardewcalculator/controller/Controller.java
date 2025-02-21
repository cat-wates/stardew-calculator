package uk.co.stardewcalculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uk.co.stardewcalculator.service.BalanceSummaryService;
import uk.co.stardewcalculator.service.CropFactory;
import uk.co.stardewcalculator.domain.types.Crop;
import uk.co.stardewcalculator.domain.Farm;
import uk.co.stardewcalculator.domain.Player;
import uk.co.stardewcalculator.service.PlayerService;

import java.util.Optional;

@RestController
public class Controller {

    public PlayerService playerService;

    @Autowired
    public Controller(PlayerService playerService) {
        this.playerService = playerService;
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


}
