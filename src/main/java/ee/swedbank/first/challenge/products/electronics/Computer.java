package ee.swedbank.first.challenge.products.electronics;

import ee.swedbank.first.challenge.products.ProductForSale;
import ee.swedbank.first.challenge.products.ProductType;

public abstract class Computer extends ProductForSale {
    private final ComputerType computerType;

    public Computer(ProductType type, int price, String description, ComputerType computerType) {
        super(type, price, description);
        this.computerType = computerType;
    }

    @Override
    public void showDetails() {
        System.out.println("------------------------------");
        System.out.printf("This %s is a %s.%n", super.getType().getLowerCase(), computerType.getType());
        System.out.printf("The price of the piece is %d euro.%n", super.getPrice());
        System.out.println(super.getDescription());
    }
}
