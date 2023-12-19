package ex2;

public class Duck implements Flyable {
    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    @Override
    public void Fly() {
        try {
            if (isInjured) {
                throw new FlyException("Ошибка: Утра ранена");
            } else {
                System.out.println("Утка летит");
            }
        } catch (FlyException e) {
            System.out.println(e.getMessage());
        }
    }
}
