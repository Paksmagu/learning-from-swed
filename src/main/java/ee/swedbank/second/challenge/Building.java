package ee.swedbank.second.challenge;

import ee.swedbank.second.challenge.enums.*;

public record Building(
        String name,
        BuildingType buildingType,
        Geometry shape
) implements Mappable {

    public Building(String name, BuildingType buildingType) {
        this(name, buildingType, Geometry.POINT);
    }

    @Override
    public String label() {
        return name + " (" + buildingType.name() + ")";
    }

    @Override
    public String getMarker() {
        switch (buildingType) {
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
            default -> throw new IllegalStateException("Unexpected value: " + buildingType);
        }
    }

    @Override
    public Geometry getShape() {
        return shape;
    }

    @Override
    public String toJson() {
        String basicInfo = Mappable.super.toJson();
        return basicInfo.substring(0, basicInfo.length() - 1) + ", " +
               "\"name\": \"" + this.name + "\", " +
               "\"usage\": \"" + this.buildingType.name() + "\"" +
               "}";
    }
}
