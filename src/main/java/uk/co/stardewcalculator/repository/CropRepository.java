package uk.co.stardewcalculator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import uk.co.stardewcalculator.domain.types.Crop;

@Repository
public interface CropRepository extends JpaRepository<Crop, String> {

    @NonNull
    Crop findByCrop(String crop);
}
