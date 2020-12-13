package Avikal.JavaMasterClass;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    ArrayList<T> member = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(T player){
        if(member.contains(player)) {
            System.out.println(player.getName() + " already in the team.");
        } else {
            member.add(player);
            System.out.println(player.getName() + " picked for the team " + this.name);
        }
    }

    public int numberOfPlayer(){
        return this.member.size();
    }

    public void matchResults(Team<T> opponent, int ourScore, int theirScore){
        if(ourScore > theirScore) {
            this.won++;
        } else if(ourScore == theirScore){
            this.tied++;
        } else {
            this.lost++;
        }
        this.played++;
        if(opponent != null){
            opponent.matchResults(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return (this.won * 2) + this.tied;
    }
}
