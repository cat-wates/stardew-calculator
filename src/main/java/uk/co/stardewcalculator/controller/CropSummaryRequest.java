package uk.co.stardewcalculator.controller;

import uk.co.stardewcalculator.domain.Farm;
import uk.co.stardewcalculator.domain.Player;

//{
//    "crop": "parsnip",
//    "player": {
//        "farmingLevel": 1,
//        "balance": 1000
//        }
//    "farm": {
//        "seedCount": 100,
//        "fertilizerLevel": 0
//        }
//}

public record CropSummaryRequest(String crop, Player player, Farm farm) {

}
