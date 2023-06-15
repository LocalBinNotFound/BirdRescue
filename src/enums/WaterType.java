package enums;

public enum WaterType {
    WETLAND("Wetland"),
    POND("Pond"),
    RIVER("River"),
    FRESHWATER_LAKE("Freshwater Lake"),
    SALTWATER_LAKE("Saltwater Lake"),
    BEACH("Beach"),
    SHORE("Shore"),
    OCEAN_COAST("Ocean Coast");

    private final String water;

    private WaterType(String water) {
        this.water = water;
    }

    @Override
    public String toString() {
        return water;
    }
}
