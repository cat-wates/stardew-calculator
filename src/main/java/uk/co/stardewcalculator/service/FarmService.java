package uk.co.stardewcalculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.stardewcalculator.domain.Farm;
import uk.co.stardewcalculator.repository.FarmRepository;

import java.util.List;

@Service
public class FarmService {

    FarmRepository farmRepository;

    @Autowired
    public FarmService(FarmRepository farmRepository) {
        this.farmRepository = farmRepository;
    }

    public List<Farm> getFarms() {
        return farmRepository.findAll();
    }

    public void addNewFarm(Farm farm) {
        farmRepository.save(farm);
    }
}
