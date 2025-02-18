package ee.swedbank.second.challenge.enums;

public enum BuildingType {
    BUSINESS,
    COMMERCIAL,
    LIVING,
    GOVERNMENT;

    public String getMarker() {
        switch (this) {
            case BUSINESS -> {
                return Color.BLUE.name() + " " + PointMarker.DIAMOND.name();
            }
            case COMMERCIAL -> {
                return Color.YELLOW.name() + " " + PointMarker.TRIANGLE.name();
            }
            case LIVING -> {
                return Color.GREEN.name() + " " + PointMarker.CIRCLE.name();
            }
            case GOVERNMENT -> {
                return Color.RED.name() + " " + PointMarker.SQUARE.name();
            }
            default -> throw new IllegalStateException("Unexpected value: " + this.name());
        }
    }
}
