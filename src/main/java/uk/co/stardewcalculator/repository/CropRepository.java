package uk.co.stardewcalculator.repository;

import org.jdbi.v3.core.Jdbi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import uk.co.stardewcalculator.domain.types.Crop;

@Repository
public class CropRepository {

    public static final String SELECT_CROP_DETAILS_SQL = """
            SELECT crop,
             cost_per_seed_pierre,
             cost_per_seed_jojo,
             basic_selling_price,
             silver_selling_price,
             gold_selling_price,
             iridium_selling_price,
             time_to_maturity,
             time_to_regrow,
             season
            FROM <tableName>;
            WHERE crop = :crop
        """;

    private static final String CROP_TABLE_NAME = "crop";

    private final Jdbi jdbi;

    @Autowired
    CropRepository(Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    public Crop findCropAndReturnNewPopulatedCrop(String crop) {
        return jdbi.withHandle(handle -> handle.createQuery(SELECT_CROP_DETAILS_SQL)
                .define("tableName", CROP_TABLE_NAME)
                .bind("crop", crop)
                .mapTo(Crop.class)
                .one());
    }
    }



//if crop is in crop table:
//return string of crop
//use sql to bind table values to Crop class
