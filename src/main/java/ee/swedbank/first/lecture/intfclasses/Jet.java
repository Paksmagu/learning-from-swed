package ee.swedbank.first.lecture.intfclasses;

public class Jet implements Flyable{
    @Override
    public void fly() {
        System.out.println("I am going boom boom boom");
    }
}
