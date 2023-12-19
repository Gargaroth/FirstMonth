package ex1;

public class Bus extends Machine {
    private final int MAX_COUNT_PASSENGERS = 20;

    public Bus(boolean haveDirt, double length, double height, double width) {
        super(haveDirt, length, height, width);
    }
}
