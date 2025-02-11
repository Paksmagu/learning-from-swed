package ee.swedbank.first.lecture;

import ee.swedbank.first.lecture.abstrclasses.Animal;
import ee.swedbank.first.lecture.abstrclasses.Dog;
import ee.swedbank.first.lecture.abstrclasses.Mammal;
import ee.swedbank.first.lecture.intfclasses.Bird;
import ee.swedbank.first.lecture.intfclasses.Flyable;
import ee.swedbank.first.lecture.intfclasses.Jet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.makeSound();
        dog.shedHair();

        System.out.println();

        Mammal mammalDog = new Dog();
        mammalDog.eat();
        mammalDog.makeSound();
        mammalDog.shedHair();

        System.out.println();

        Animal animalDog = new Dog();
        animalDog.eat();
        animalDog.makeSound();

        Flyable bird = new Bird();
        bird.fly();

        Flyable jet = new Jet();
        jet.fly();

        List<Flyable> list = new ArrayList<>();
        list.add(bird);
        list.add(jet);

        list.forEach(System.out::println);
    }
}
