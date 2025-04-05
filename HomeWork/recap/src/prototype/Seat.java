package prototype;

import java.time.Duration;

public class Seat implements ISeat {

    private Integer seatNumber;
    private Integer xPosition;
    private Integer yPosition;
    private boolean hasExtraSpace;

    public Seat(Integer seatNumber, Integer xPosition, Integer yPosition, boolean hasExtraSpace) {
        this.seatNumber = seatNumber;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.hasExtraSpace = hasExtraSpace;
        System.out.println("A method which takes very long...");
        try {
            Thread.sleep(Duration.ofSeconds(5));
        }catch(InterruptedException ie) {
            System.out.println("thread interupted");
        }
    }

    private Seat() {

    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Integer getxPosition() {
        return xPosition;
    }

    public void setxPosition(Integer xPosition) {
        this.xPosition = xPosition;
    }

    public Integer getyPosition() {
        return yPosition;
    }

    public void setyPosition(Integer yPosition) {
        this.yPosition = yPosition;
    }

    public boolean isHasExtraSpace() {
        return hasExtraSpace;
    }

    public void setHasExtraSpace(boolean hasExtraSpace) {
        this.hasExtraSpace = hasExtraSpace;
    }

    @Override
    public Seat clone() {
        Seat seat = new Seat();
        seat.setSeatNumber(this.seatNumber);
        seat.setxPosition(this.xPosition);
        seat.setyPosition(this.yPosition);
        seat.setHasExtraSpace(this.hasExtraSpace);
        return seat;
    }
}
