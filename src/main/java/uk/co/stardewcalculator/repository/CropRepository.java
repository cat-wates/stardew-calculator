package uk.co.stardewcalculator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import uk.co.stardewcalculator.domain.types.CropV2;

@Repository
public interface CropRepository extends JpaRepository<CropV2, String> {

    @NonNull
    CropV2 getReferenceById(@NonNull String crop);
}
