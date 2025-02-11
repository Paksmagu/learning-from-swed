package ee.swedbank.first.lecture.abstrclasses;

public class Dog extends Mammal {
    @Override
    public void shedHair() {
        System.out.println("Alot of hair");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
