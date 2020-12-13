package Avikal.JavaMasterClass;

//import java.lang.*;
public class PlayerMain {
    
    public static void main(String[] args) {

        Team<FootBallPlayer> teamShubham = new Team<>("Foot Ball Avikal.JavaMasterclass.Team");
        Team<BaseballPlayer> teamVivek = new Team<>("Base Ball Avikal.JavaMasterclass.Team");
        Team<SoccerPlayer> teamVikas = new Team<>("Soccer Avikal.JavaMasterclass.Team");

        Team<FootBallPlayer> teamPiyush = new Team<>("Foot Ball Avikal.JavaMasterclass.Team");
        Team<BaseballPlayer> teamRishabh = new Team<>("Base Ball Avikal.JavaMasterclass.Team");
        Team<SoccerPlayer> teamAnshuman = new Team<>("Soccer Avikal.JavaMasterclass.Team");

        teamShubham.addPlayer(new FootBallPlayer("Shubham"));
        teamShubham.addPlayer(new FootBallPlayer("Rajesh"));
        teamShubham.addPlayer(new FootBallPlayer("Pradeep"));
        teamShubham.addPlayer(new FootBallPlayer("Golu"));
        teamShubham.addPlayer(new FootBallPlayer("Kriti"));

        teamVivek.addPlayer(new BaseballPlayer("Vivek"));
        teamVivek.addPlayer(new BaseballPlayer("Amit"));
        teamVivek.addPlayer(new BaseballPlayer("Ranjeet"));
        teamVivek.addPlayer(new BaseballPlayer("Shailendra"));      
        teamVivek.addPlayer(new BaseballPlayer("Gillu"));

        teamVikas.addPlayer(new SoccerPlayer("Vikas"));
        teamVikas.addPlayer(new SoccerPlayer("Akash"));
        teamVikas.addPlayer(new SoccerPlayer("Priyanshu"));
        teamVikas.addPlayer(new SoccerPlayer("Roushan"));
        teamVikas.addPlayer(new SoccerPlayer("Vinit"));

        teamPiyush.addPlayer(new FootBallPlayer("Shubham"));
        teamPiyush.addPlayer(new FootBallPlayer("Rajesh"));
        teamPiyush.addPlayer(new FootBallPlayer("Pradeep"));
        teamPiyush.addPlayer(new FootBallPlayer("Golu"));
        teamPiyush.addPlayer(new FootBallPlayer("Kriti"));

        teamRishabh.addPlayer(new BaseballPlayer("Vivek"));
        teamRishabh.addPlayer(new BaseballPlayer("Amit"));
        teamRishabh.addPlayer(new BaseballPlayer("Ranjeet"));
        teamRishabh.addPlayer(new BaseballPlayer("Shailendra"));
        teamRishabh.addPlayer(new BaseballPlayer("Gillu"));

        teamAnshuman.addPlayer(new SoccerPlayer("Vikas"));
        teamAnshuman.addPlayer(new SoccerPlayer("Akash"));
        teamAnshuman.addPlayer(new SoccerPlayer("Priyanshu"));
        teamAnshuman.addPlayer(new SoccerPlayer("Roushan"));
        teamAnshuman.addPlayer(new SoccerPlayer("Vinit"));

        System.out.println(teamShubham.getName() + " --> " + teamShubham.numberOfPlayer());
        System.out.println(teamVivek.getName() + " --> " + teamVivek.numberOfPlayer());
        System.out.println(teamVikas.getName() + " --> " + teamVikas.numberOfPlayer());

        teamVivek.matchResults(teamRishabh, 10, 11);
        teamShubham.matchResults(teamPiyush, 15, 10);
        teamVikas.matchResults(teamAnshuman, 50, 36);

        System.out.println(teamShubham.ranking());
        System.out.println(teamVikas.ranking());
        System.out.println(teamVivek.ranking());
        System.out.println(teamRishabh.ranking());
        System.out.println(teamPiyush.ranking());
        System.out.println(teamAnshuman.ranking());

    }
}
