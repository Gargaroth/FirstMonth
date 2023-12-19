package ex2;

public class Airplane implements Flyable {
    private int countPassengers;

    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void Fly() {
        try {
            if (countPassengers < 0) {
                throw new FlyException("Ошибка: пассажиров в самолете меньше 0");
            } else {
                System.out.println("Самолет летит");
            }
        } catch (FlyException e) {
            System.out.println(e.getMessage());
        }
    }
}
