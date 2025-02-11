package ee.swedbank.first.challenge.products.electronics;

import ee.swedbank.first.challenge.products.ProductType;

public class Desktop extends Computer {
    public Desktop(ProductType type, int price, String description, ComputerType computerType) {
        super(type, price, description, computerType);
    }
}
