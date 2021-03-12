package com.leonardolariu.models;

import lombok.Getter;

@Getter
public abstract class Player {
    private String name;
    private Integer score;

    public Player(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player{" +
            "name='" + name + '\'' +
            ", score=" + score +
            '}';
    }
}
