package uk.co.stardewcalculator.domain.season;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import uk.co.stardewcalculator.domain.types.Crop;

import java.util.List;

@Entity
@Table(name = "season")
public class Season {
    @Id
    private String id;
    @ManyToMany(mappedBy = "seasons")
    private List<Crop> crops;

    public Season() {

    }

    public List<Crop> getCrops() {
        return crops;
    }

    public void setCrops(List<Crop> crops) {
        this.crops = crops;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
