package ee.swedbank.first.challenge.products.furniture;

import ee.swedbank.first.challenge.products.ProductType;

public class Desk extends Furniture {
    public Desk(ProductType type, int price, String description, Country manufacturingCountry) {
        super(type, price, description, manufacturingCountry);
    }
}
