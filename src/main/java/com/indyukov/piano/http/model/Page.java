package com.indyukov.piano.http.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Page {

    @SerializedName("items")
    @Expose
    private List<Question> questions = null;

    @SerializedName("has_more")
    @Expose
    private Boolean hasMore;


    public List<Question> getQuestions() {
        return questions;
    }

    public void setItems(List<Question> questions) {
        this.questions = questions;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }
}