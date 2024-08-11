package com.antdevrealm.mobilelele.model.dto;

import com.antdevrealm.mobilelele.model.enums.EngineTypeEnum;

public class OfferDetailsDTO {

    private long id;

    private String description;

    private int mileage;

    private EngineTypeEnum engineType;

    public long getId() {
        return id;
    }

    public OfferDetailsDTO setId(long id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public OfferDetailsDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getMileage() {
        return mileage;
    }

    public OfferDetailsDTO setMileage(int mileage) {
        this.mileage = mileage;
        return this;
    }

    public EngineTypeEnum getEngineType() {
        return engineType;
    }

    public OfferDetailsDTO setEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
        return this;
    }
}
