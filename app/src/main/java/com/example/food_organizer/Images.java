package com.example.food_organizer;

public class Images {
    private String imageName;
    private String imageUrl;

    public Images() {
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Images(String imageName, String imageUrl) {
        this.imageName = imageName;
        this.imageUrl = imageUrl;
    }
}
