package com.leonardolariu.generics;

import com.leonardolariu.models.BaseballPlayer;
import com.leonardolariu.models.FootballPlayer;
import com.leonardolariu.models.Team;

public class TeamsRanking {

    public static void main(String[] args) {
        FootballPlayer fp1 = new FootballPlayer("Leo", 1);
        FootballPlayer fp2 = new FootballPlayer("Leo", 2);
        FootballPlayer fp3 = new FootballPlayer("Leo", 4);
        FootballPlayer fp4 = new FootballPlayer("Leo", 5);
        FootballPlayer fp5 = new FootballPlayer("Leo", 7);

        BaseballPlayer bp1 = new BaseballPlayer("Leo", 2);
        BaseballPlayer bp2 = new BaseballPlayer("Leo", 3);
        BaseballPlayer bp3 = new BaseballPlayer("Leo", 4);

        Team<FootballPlayer> ft1 = new Team<>("FootballTeam1");
        ft1.addPlayer(fp1);
        ft1.addPlayer(fp2);
        ft1.addPlayer(fp5);
        // ft1.addPlayer(bp1); how can we ensure stronger type checks at compile time?

        Team<FootballPlayer> ft2 = new Team<>("FootballTeam2");
        ft2.addPlayer(fp3);
        ft2.addPlayer(fp4);

        Team<BaseballPlayer> bt = new Team<>("BaseballTeam");
        bt.addPlayer(bp1);
        bt.addPlayer(bp2);
        bt.addPlayer(bp3);

        // elimination of casts
        // Team<String> brokenTeam = new Team<>("StringTeam");
        // brokenTeam.addPlayer("no-one");

        // enabling programmers to implement generic algorithms
        System.out.println(maximum(3, 5));

        // print the best football team
        System.out.println(maximum(ft1, ft2));
    }

    public static <T extends Comparable<T>> T maximum(T x, T y) {
        if (x.compareTo(y) >= 0) {
            return x;
        }

        return y;
    }
}
