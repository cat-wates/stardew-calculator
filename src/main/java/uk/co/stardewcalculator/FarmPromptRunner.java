package uk.co.stardewcalculator;

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
