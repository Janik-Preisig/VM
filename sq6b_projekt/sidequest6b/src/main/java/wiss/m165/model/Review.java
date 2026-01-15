package wiss.m165.model;

import org.springframework.data.annotation.Id;

public class Review {

    @Id
    private String id;

    private String feedback;
    private int points;

    public Review() {
    }

    public Review(String feedback, int points) {
        this.feedback = feedback;
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
