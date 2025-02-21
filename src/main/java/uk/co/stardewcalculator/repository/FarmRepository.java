package uk.co.stardewcalculator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.co.stardewcalculator.domain.Farm;

@Repository
public interface FarmRepository extends JpaRepository<Farm, Long> {
}
