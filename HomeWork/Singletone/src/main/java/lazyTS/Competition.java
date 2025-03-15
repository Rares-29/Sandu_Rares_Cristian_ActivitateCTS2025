package lazyTS;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class Competition {
    private String name;
    private List<String> participants = new ArrayList<>();
    private List<Integer> awards = new ArrayList<>();
    private LocalDateTime startDate;

    private static Competition instance;

    private Competition(String name, LocalDateTime localDateTime) {
        this.name = name;
        this.startDate = localDateTime;
    }

    public synchronized static Competition getInstance() {
        if (instance == null) {
            LocalDateTime localDateTime = LocalDateTime.of(2025, 3, 16, 20, 30);
            instance = new Competition("Hackathon N-Able", localDateTime);
        }
        return instance;
    }

    public void addAward(Integer prize) {
        awards.add(prize);
    }
}
