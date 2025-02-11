package ee.swedbank.first.challenge.order;

import ee.swedbank.first.challenge.products.ProductForSale;

public class OrderItem {
    private final int quantity;
    private final ProductForSale productForSale;

    public OrderItem(int quantity, ProductForSale productForSale) {
        this.quantity = quantity;
        this.productForSale = productForSale;
    }

    public void printOrderItem() {
        productForSale.printPricedItem(quantity);
    }

    public int getPrice() {
        return productForSale.getSalesPrice(quantity);
    }
}
