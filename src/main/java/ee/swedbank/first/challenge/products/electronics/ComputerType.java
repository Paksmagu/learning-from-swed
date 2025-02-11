package ee.swedbank.first.challenge.products.electronics;

public enum ComputerType {
    MODERN_COMPUTER("modern computer"),
    LEGACY_COMPUTER("legacy computer");

    private final String type;

    ComputerType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
