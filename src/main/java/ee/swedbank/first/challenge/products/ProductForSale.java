package ee.swedbank.first.challenge.products;

public abstract class ProductForSale {
    private static int PRODUCT_INDEX = 1;

    private final int id;
    private final ProductType type;
    private final int price;
    private final String description;

    public abstract void showDetails();

    public void printPricedItem(int quantity) {
        System.out.printf("%d items at %d each (type: %s, description: %s)%n", quantity, price, type.getLowerCase(), description);
    }

    public int getSalesPrice(int quantity) {
        return quantity * price;
    }

    public ProductForSale(ProductType type, int price, String description) {
        this.id = PRODUCT_INDEX++;
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public ProductType getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
