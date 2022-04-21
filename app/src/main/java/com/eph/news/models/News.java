package com.eph.news.models;

import java.sql.Timestamp;

public class News {

    private String title;
    private String description;
    private Timestamp dateAdded;
    private String index;
    private String pushId;

    public News(String title, String description, Timestamp dateAdded, String index, String pushId) {
        this.title = title;
        this.description = description;
        this.dateAdded = dateAdded;
        this.index = index;
        this.pushId = pushId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getPushId() {
        return pushId;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }
}
