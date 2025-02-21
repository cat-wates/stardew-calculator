package uk.co.stardewcalculator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.co.stardewcalculator.domain.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long > {

}
