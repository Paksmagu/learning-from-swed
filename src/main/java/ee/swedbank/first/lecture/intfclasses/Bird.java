package ee.swedbank.first.lecture.intfclasses;

import ee.swedbank.first.lecture.abstrclasses.Animal;

public class Bird extends Animal implements Flyable {
    @Override
    public void makeSound() {
        System.out.println("chirp");
    }

    @Override
    public void fly() {
        System.out.println("i am flying");
    }
}
