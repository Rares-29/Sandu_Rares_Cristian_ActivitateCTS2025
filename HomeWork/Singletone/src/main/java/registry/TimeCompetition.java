package registry;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TimeCompetition extends Competition{

    private Integer msTillNextRemove = 20;
    private static TimeCompetition instance = new TimeCompetition("Hackathon N-Able", LocalDateTime.of(2025, 3, 16, 20, 30), "timed");

    TimeCompetition(String name, LocalDateTime localDateTime, String competitionType) {
        super(name, localDateTime, competitionType);
    }

    @Override
    public void startCompetition() {
        System.out.println("Time competition has started...");
    }

    public void removePerson(String name) {
        getParticipants().remove(name);
    }

}
