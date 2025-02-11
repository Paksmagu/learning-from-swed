package ee.swedbank.first;

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
    }
}
