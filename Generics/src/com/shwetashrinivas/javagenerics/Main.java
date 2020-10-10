package com.shwetashrinivas.javagenerics;

public class Main {
    public static void main(String[] args) {
        FootballPlayer ronaldo = new FootballPlayer("Ronaldo");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        CricketPlayer dhoni = new CricketPlayer("Dhoni");

        Team mi = new Team("Mumbai Indians");
        mi.addPlayer(ronaldo);
        mi.addPlayer(pat);
        mi.addPlayer(dhoni);

        System.out.println(mi.numPlayers());

    }
}
