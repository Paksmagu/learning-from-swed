package ee.swedbank.first.challenge.products.furniture;

import ee.swedbank.first.challenge.products.ProductForSale;
import ee.swedbank.first.challenge.products.ProductType;

public abstract class Furniture extends ProductForSale {
    private final Country manufacturingCountry;
    public Furniture(ProductType type, int price, String description, Country manufacturingCountry) {
        super(type, price, description);
        this.manufacturingCountry = manufacturingCountry;
    }

    @Override
    public void showDetails() {
        System.out.println("------------------------------");
        System.out.printf("This %s was manufactured in %s.%n", super.getType().getLowerCase(), manufacturingCountry.getCountry());
        System.out.printf("The price of the piece is %d euro.%n", super.getPrice());
        System.out.println(super.getDescription());
    }
}
