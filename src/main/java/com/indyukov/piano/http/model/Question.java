package com.indyukov.piano.http.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Question {

    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("question_score")
    @Expose
    private Integer questionScore;
    @SerializedName("is_accepted")
    @Expose
    private Boolean isAccepted;
    @SerializedName("has_accepted_answer")
    @Expose
    private Boolean hasAcceptedAnswer;
    @SerializedName("answer_count")
    @Expose
    private Integer answerCount;
    @SerializedName("is_answered")
    @Expose
    private Boolean isAnswered;
    @SerializedName("question_id")
    @Expose
    private Integer questionId;
    @SerializedName("item_type")
    @Expose
    private String itemType;
    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("last_activity_date")
    @Expose
    private Integer lastActivityDate;
    @SerializedName("creation_date")
    @Expose
    private Integer creationDate;
    @SerializedName("body")
    @Expose
    private String body;
    @SerializedName("excerpt")
    @Expose
    private String excerpt;
    @SerializedName("title")
    @Expose
    private String title;

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Integer getQuestionScore() {
        return questionScore;
    }

    public void setQuestionScore(Integer questionScore) {
        this.questionScore = questionScore;
    }

    public Boolean getAccepted() {
        return isAccepted;
    }

    public void setAccepted(Boolean accepted) {
        isAccepted = accepted;
    }

    public Boolean getHasAcceptedAnswer() {
        return hasAcceptedAnswer;
    }

    public void setHasAcceptedAnswer(Boolean hasAcceptedAnswer) {
        this.hasAcceptedAnswer = hasAcceptedAnswer;
    }

    public Integer getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(Integer answerCount) {
        this.answerCount = answerCount;
    }

    public Boolean getAnswered() {
        return isAnswered;
    }

    public void setAnswered(Boolean answered) {
        isAnswered = answered;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(Integer lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    public Integer getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Integer creationDate) {
        this.creationDate = creationDate;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Question question = (Question) o;

        return questionId != null ? questionId.equals(question.questionId) : question.questionId == null;
    }

    @Override
    public int hashCode() {
        return questionId != null ? questionId.hashCode() : 0;
    }
}