package ee.swedbank.second.challenge;

import ee.swedbank.second.challenge.enums.BuildingType;
import ee.swedbank.second.challenge.enums.Geometry;
import ee.swedbank.second.challenge.enums.UtilityType;

import java.util.ArrayList;

public interface Mappable {
    String JSON_PROPERTY = "\"properties\": {%s}";

    String label();

    String getMarker();

    Geometry getShape();

    default String toJson() {
        return String.format(JSON_PROPERTY,
                "\"type\": \"" + getShape().name() + "\", " +
                "\"label\": \"" + this.label() + "\", " +
                "\"marker\": \"" + this.getMarker() + "\"");
    }

    static void mapIt(Mappable mappable) {
        System.out.println(mappable.toJson());
    }

    static void main(String[] args) {
        ArrayList<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("Tallinna Raekoda", BuildingType.GOVERNMENT));
        mappables.add(new Building("Sakala Keskus", BuildingType.COMMERCIAL));
        mappables.add(new Building("TTÜ Ühikad", BuildingType.LIVING));
        mappables.add(new UtilityLine("Tallinna Teletorn", UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("Ülemiste Järv", UtilityType.WATER));

        mappables.forEach(Mappable::mapIt);
    }
}
