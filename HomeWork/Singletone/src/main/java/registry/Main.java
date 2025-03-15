package registry;


import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        try {
            Class.forName("registry.TimeCompetition");
            Competition competition = Competition.getInstance("timed");
            competition.startCompetition();

        }catch(Exception e) {
            System.out.println("exception");
        }


    }
}