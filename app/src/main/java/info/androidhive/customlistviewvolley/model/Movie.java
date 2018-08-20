package info.androidhive.customlistviewvolley.model;

import java.util.ArrayList;

public class Movie {
    private String title, thumbnailUrl;

    public Movie() {
    }

    public Movie(String name, String thumbnailUrl) {
        this.title = name;
        this.thumbnailUrl = thumbnailUrl;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
}