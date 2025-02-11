package ee.swedbank.first.challenge.products.furniture;

import ee.swedbank.first.challenge.products.ProductType;

public class Chair extends Furniture {
    public Chair(ProductType type, int price, String description, Country manufacturingCountry) {
        super(type, price, description, manufacturingCountry);
    }
}
