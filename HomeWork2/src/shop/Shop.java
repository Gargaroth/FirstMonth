package shop;

import java.util.Arrays;

public class Shop  {
    Worker[] workers;

    public Shop(Worker[] workers) {
        this.workers = workers;
    }

    public void print() {
        System.out.println(workers);
    }

}
