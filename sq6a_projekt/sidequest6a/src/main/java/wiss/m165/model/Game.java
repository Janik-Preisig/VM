package wiss.m165.model;

import java.util.Date;

public class Game {
    private int id;
    private String name;
    private String type;
    private String description;
    private Date releaseDate;
    private String publisher;

    public Game(String name, String type, String description, Date releaseDate, String publisher) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.releaseDate = releaseDate;
        this.publisher = publisher;
    }

    public Game(int id, String name, String type, String description, Date releaseDate, String publisher) {
        this(name, type, description, releaseDate, publisher);
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
