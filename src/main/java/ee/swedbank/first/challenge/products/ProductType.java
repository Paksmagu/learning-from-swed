package ee.swedbank.first.challenge.products;

public enum ProductType {
    DESKTOP,
    LAPTOP,
    DESK,
    CHAIR;


    public String getLowerCase() {
        return this.name().toLowerCase();
    }
}
