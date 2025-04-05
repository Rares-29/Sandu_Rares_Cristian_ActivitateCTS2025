package prototype;

import java.util.ArrayList;
import java.util.List;

public class Plane {

    List<Seat> seatList = new ArrayList<>();
    private Double cost;

    public Plane(Double cost, Integer numberOfSeats) {
        Seat seatOne = new Seat(1, 10, 20, true);
        seatList.add(seatOne);
        for (int i = 0; i < numberOfSeats; i++) {
            Seat seatClone = seatOne.clone();
            seatClone.setHasExtraSpace(i % 2 == 0);
            seatClone.setSeatNumber(seatClone.getSeatNumber() + 1);
            if (i % 2 == 0) {
                seatClone.setyPosition(seatClone.getyPosition() + 10);
            }
            else {
                seatClone.setxPosition(seatClone.getxPosition() + 20);
            }
            seatList.add(seatClone);

        }
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "seatList=" + seatList +
                ", cost=" + cost +
                '}';
    }
}
