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
        return utilityType.getMarker();
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
