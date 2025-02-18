package ee.swedbank.second.challenge;

import ee.swedbank.second.challenge.enums.*;

public record UtilityLine(String name,
                          UtilityType utilityType,
                          Geometry shape) implements Mappable {

    public UtilityLine(String name, UtilityType utilityType) {
        this(name, utilityType, Geometry.LINE);
    }

    @Override
    public String label() {
        return name + " (" + utilityType.name() + ")";
    }

    @Override
    public String getMarker() {
        switch (utilityType) {
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
            default -> throw new IllegalStateException("Unexpected value: " + utilityType);
        }
    }

    @Override
    public Geometry getShape() {
        return shape;
    }

    @Override
    public String toJson() {
        String basicJson = Mappable.super.toJson();
        return basicJson.substring(0, basicJson.length() - 1) + ", " +
               "\"name\": \"" + this.name + "\", " +
               "\"utility\": \"" + this.utilityType.name() + "\"" +
               "}";
    }
}
