package uk.co.stardewcalculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.stardewcalculator.domain.Player;
import uk.co.stardewcalculator.repository.PlayerRepository;

import java.util.List;

@Service
public class PlayerService {

    public PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }

    public void addNewPlayer(Player player) {
        if (player.getFarmingLevel() < 5 && player.getTiller()) {
            player.setTiller(false);
        }
        if (player.getFarmingLevel() < 10 && player.getAgriculturist()) {
            player.setAgriculturist(false);
        }
        playerRepository.save(player);
    }
}
