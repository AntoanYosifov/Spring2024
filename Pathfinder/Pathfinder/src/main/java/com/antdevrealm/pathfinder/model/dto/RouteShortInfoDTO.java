package com.antdevrealm.pathfinder.model.dto;

public class RouteShortInfoDTO {

    private long id;
    private String name;
    private String description;
    private String imageUrl;

    public RouteShortInfoDTO() {
    }

    public long getId() {
        return id;
    }

    public RouteShortInfoDTO setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public RouteShortInfoDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public RouteShortInfoDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public RouteShortInfoDTO setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
}
