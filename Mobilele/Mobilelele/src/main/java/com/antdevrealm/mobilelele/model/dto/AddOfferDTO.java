package com.antdevrealm.mobilelele.model.dto;

import com.antdevrealm.mobilelele.model.enums.EngineTypeEnum;
import jakarta.validation.constraints.*;

public class AddOfferDTO {

    @NotEmpty(message = "{add.offer.description.not.empty}")
    @Size(min = 5, max = 500, message ="{add.offer.description.length}")
    private String description;

    @NotNull(message ="{add.offer.mileage.not.empty}")
    @PositiveOrZero(message ="{add.offer.mileage.positive}")
    private Integer mileage;

    @NotNull
    private EngineTypeEnum engineType;

    public AddOfferDTO() {
    }

    public String getDescription() {
        return description;
    }

    public AddOfferDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getMileage() {
        return mileage;
    }

    public AddOfferDTO setMileage(Integer mileage) {
        this.mileage = mileage;
        return this;
    }

    public EngineTypeEnum getEngineType() {
        return engineType;
    }

    public AddOfferDTO setEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
        return this;
    }
}
