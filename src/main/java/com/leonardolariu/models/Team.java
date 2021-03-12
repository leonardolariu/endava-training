package com.leonardolariu.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    private Integer totalScore = 0;
    private List<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on team " + name);
            return false;
        } else {
            members.add(player);
            totalScore += player.getScore();
            System.out.println(player.getName() + " picked for team " + name);
            return true;
        }
    }

    @Override
    public int compareTo(Team<T> o) {
        return Integer.compare(this.totalScore, o.totalScore);
    }

    @Override
    public String toString() {
        return "Team{" +
            "name='" + name + '\'' +
            ", totalScore=" + totalScore +
            ", members=" + members +
            '}';
    }
}
