package ex1;

public class Runner {
    public static void main(String[] args) {
        Car car1 = new Car(true, 5, 2, 1.8);
        Car car2 = new Car(true, 5, 2, 1.8);
        Car car3 = new Car(true, 5, 2, 1.8);
        Car car4 = new Car(true, 5, 2, 1.8);
        Bus bus1 = new Bus(true, 12, 3, 2.3);
        Bus bus2 = new Bus(true, 12, 3, 2.3);
        Bus bus3 = new Bus(true, 12, 3, 2.3);
        Bus bus4 = new Bus(true, 12, 3, 2.3);
        Bus bus5 = new Bus(true, 12, 3, 2.3);

        Machine[] machines = new Machine[]{car1, car2, car3, car4, bus1, bus2, bus3, bus4, bus5};
        CarWash carWash = new CarWash();

        System.out.println(carWash.canCarWash(car1));
        System.out.println(carWash.canCarWash(machines));








    }
}
