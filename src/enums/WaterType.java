package enums;

/**
 * Enum representing the type of water source a bird resides near.
 */
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

    /**
     * Constructs a WaterType enum constant with the specified water.
     * @param water the type of water source a bird resides near
     */
    private WaterType(String water) {
        this.water = water;
    }

    /**
     * Returns a string representation of the WaterType.
     * @return a string representation of the WaterType
     */
    @Override
    public String toString() {
        return water;
    }
}
