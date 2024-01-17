package ex1;


import ex1.animal.Animal;

public class Zoo <T, E, I extends Animal> {

    private T tiger;
    private E dog;
    private I bird;

    public Zoo(T tiger, E dog, I bird) {
        this.tiger = tiger;
        this.dog = dog;
        this.bird = bird;
    }

    public T getTiger() {
        return tiger;
    }

    public E getDog() {
        return dog;
    }

    public I getBird() {
        return bird;
    }
}
