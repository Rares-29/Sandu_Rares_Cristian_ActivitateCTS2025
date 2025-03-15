package registry;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Competition {
    private String name;
    private List<String> participants = new ArrayList<>();
    private List<Integer> awards = new ArrayList<>();
    private LocalDateTime startDate;
    private static Map<String, Competition> register = new HashMap<>();
    private static Competition instance = new Competition("Hackathon N-Able", LocalDateTime.of(2025, 3, 16, 20, 30), "normal");
    private String competitionType;

    protected Competition(String name, LocalDateTime localDateTime, String competitionType) {
        this.name = name;
        this.startDate = localDateTime;
        registerSingleton(competitionType, this);
    }

    public static synchronized void registerSingleton(String type, Competition competition) {
        if (!register.containsKey(type)) {
            register.put(type, competition);
        }
    }

    private Competition() {

    }

    public synchronized static Competition getInstance(String competitionType) {
        return register.getOrDefault(competitionType, register.get("normal"));
    }

    public void addParticipants(String participant) {
        participants.add(participant);
    }

    public void startCompetition() {
        System.out.println("Competition has started...");
    }
    public void addAward(Integer prize) {
        awards.add(prize);
    }
}
