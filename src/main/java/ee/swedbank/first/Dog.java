package ee.swedbank.first;

public class Dog extends Mammal {
    @Override
    void shedHair() {
        System.out.println("Alot of hair");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
