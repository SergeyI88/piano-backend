package com.indyukov.piano.http.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Page {

    @SerializedName("items")
    @Expose
    public List<Question> pages = null;

    @SerializedName("has_more")
    @Expose
    public Boolean hasMore;


    public List<Question> getItems() {
        return pages;
    }

    public void setItems(List<Question> items) {
        this.pages = items;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }
}