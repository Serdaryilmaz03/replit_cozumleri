package OOP.TEST8;

public class ParkingMeter {
    int timeLeft = 0;
    int maxTime;

    public int getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(int timeLeft) {
        this.timeLeft = timeLeft;
    }

    public ParkingMeter(int maxTime) {
        this.maxTime = maxTime;
    }

    public void tick() {
        if (timeLeft > 0) {
            timeLeft--;
        }
    }

    public boolean add(int value) {
        if (value == 25 && timeLeft + 30 <= maxTime) {
            timeLeft += 30;
            return true;
        } else {
            return false;
        }

    }

    public boolean isExpired() {
        if (timeLeft == 0) {
            return true;
        } else {
            return false;
        }
    }
}
