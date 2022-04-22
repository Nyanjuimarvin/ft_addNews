package com.eph.news.models;

import org.parceler.Parcel;

import java.sql.Timestamp;

@Parcel
public class News {

    private String title;
    private String description;
    private Timestamp dateAdded;
    private String pushId;

    public News(){

    }

    public News(String title, String description, Timestamp dateAdded, String pushId) {
        this.title = title;
        this.description = description;
        this.dateAdded = dateAdded;
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

    public String getPushId() {
        return pushId;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }
}
