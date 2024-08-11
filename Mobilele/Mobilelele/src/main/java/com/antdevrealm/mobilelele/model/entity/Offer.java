package com.antdevrealm.mobilelele.model.entity;

import com.antdevrealm.mobilelele.model.enums.EngineTypeEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "offers")
public class Offer extends BaseEntity {

    private String description;

    private int mileage;

    @Enumerated(EnumType.STRING)
    @Column(name = "engine_type")
    private EngineTypeEnum engineType;


    public String getDescription() {
        return description;
    }

    public Offer setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getMileage() {
        return mileage;
    }

    public Offer setMileage(int mileage) {
        this.mileage = mileage;
        return this;
    }

    public EngineTypeEnum getEngineType() {
        return engineType;
    }

    public Offer setEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
        return this;
    }

}
