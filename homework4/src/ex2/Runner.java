package ex2;

public class Runner {
    public static void main(String[] args) {
        Duck duck1 = new Duck(false);
        Duck duck2 = new Duck(true);
        Airplane airplane1 = new Airplane(10);
        Airplane airplane2 = new Airplane(-1);

        duck1.Fly();
        duck2.Fly();
        airplane1.Fly();
        airplane2.Fly();
    }
}
