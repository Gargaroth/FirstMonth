package ex3;

public class Builder extends Human {

    public String makeSound() {
        return "Я строитель " + super.makeSound();
    }
}
