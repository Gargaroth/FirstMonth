package ex1;
import ex1.animal.Animal;
import ex1.animal.Bird;
import ex1.animal.Dog;
import ex1.animal.Tiger;

public class Runner {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Animal[] animals = new Animal[]{tiger, dog, bird};
        Zoo<Tiger, Dog, Bird> zoo = new Zoo<>(tiger, dog, bird);

        zoo.getBird().canFly();
        zoo.getDog().canBark();
        zoo.getTiger().canGrowl();
    }
}
