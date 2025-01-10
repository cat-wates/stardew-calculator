package uk.co.stardewcalculator.farm;

import uk.co.stardewcalculator.farm.Farm;
import uk.co.stardewcalculator.farm.FarmPrompt;

public class FarmPromptRunner {

    FarmPrompt farmPrompt;

    public FarmPromptRunner(FarmPrompt farmPrompt) {
        this.farmPrompt = farmPrompt;
    }

    public Farm run() {
        int seedCount = farmPrompt.setSeedCount();
        int fertilizerLevel = farmPrompt.setFertilizerLevel();
        return new Farm(seedCount, fertilizerLevel);
    }
}
