package eager;

import eager.Competition;

public class Main {

    public static void main(String[] args) {

        Competition competition = Competition.getInstance();
        Competition competition2 = Competition.getInstance();

        competition.addAward(20);

        System.out.println(competition2);
    }
}