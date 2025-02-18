package ee.swedbank.second.challenge.enums;

public enum UtilityType {
    ELECTRICAL,
    WATER,
    FIBER_OPTIC,
    CELLULAR;

    public String getMarker() {
        switch (this) {
            case ELECTRICAL -> {
                return Color.YELLOW.name() + " " + LineMarker.DOTTED.name();
            }
            case WATER -> {
                return Color.BLUE.name() + " " + LineMarker.SOLID.name();
            }
            case FIBER_OPTIC -> {
                return Color.YELLOW.name() + " " + LineMarker.SOLID.name();
            }
            case CELLULAR -> {
                return Color.PINK.name() + " " + LineMarker.DASHED.name();
            }
            default -> throw new IllegalStateException("Unexpected value: " + this.name());
        }
    }
}
