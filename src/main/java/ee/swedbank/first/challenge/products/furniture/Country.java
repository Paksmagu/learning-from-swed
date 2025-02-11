package ee.swedbank.first.challenge.products.furniture;

public enum Country {
    ESTONIA("Estonia"),
    LATVIA("Latvia");

    private final String country;

    Country(String type) {
        this.country = type;
    }

    public String getCountry() {
        return country;
    }
}
