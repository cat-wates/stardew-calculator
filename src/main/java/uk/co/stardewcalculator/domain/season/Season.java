package uk.co.stardewcalculator.domain.season;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import uk.co.stardewcalculator.domain.types.CropV2;

import java.util.List;

@Entity
@Table(name = "season")
public class Season {
    @Id
    private String id;
    @ManyToMany(mappedBy = "seasons")
    private List<CropV2> crops;

    public Season() {

    }

    public List<CropV2> getCrops() {
        return crops;
    }

    public void setCrops(List<CropV2> crops) {
        this.crops = crops;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
