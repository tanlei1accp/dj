package com.example.csdj.committee.entity;

public class Issue {
    private int id;
    private String name;
    private String aanswer;
    private String banswer;
    private String canswer;
    private String danswer;
    private int surveyId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAanswer() {
        return aanswer;
    }

    public void setAanswer(String aanswer) {
        this.aanswer = aanswer;
    }

    public String getBanswer() {
        return banswer;
    }

    public void setBanswer(String banswer) {
        this.banswer = banswer;
    }

    public String getCanswer() {
        return canswer;
    }

    public void setCanswer(String canswer) {
        this.canswer = canswer;
    }

    public String getDanswer() {
        return danswer;
    }

    public void setDanswer(String danswer) {
        this.danswer = danswer;
    }

    public int getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", aanswer='" + aanswer + '\'' +
                ", banswer='" + banswer + '\'' +
                ", canswer='" + canswer + '\'' +
                ", danswer='" + danswer + '\'' +
                ", surveyId=" + surveyId +
                '}';
    }
}
