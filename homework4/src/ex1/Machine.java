package ex1;

public class Machine {
    protected boolean haveDirt;
    protected double length;
    protected double height;
    protected double width;

    public Machine(boolean haveDirt, double length, double height, double width) {
        this.haveDirt = haveDirt;
        this.length = length;
        this.height = height;
        this.width = width;
    }
}
