package wiss.m165.model;

import org.springframework.data.annotation.Id;

public class Game {

    @Id
    private String _id;

    private int id;

    private String name;

    public Game() {
    }

    public Game(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
