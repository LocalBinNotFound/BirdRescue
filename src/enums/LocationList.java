package enums;

/**
 * Enum representing the locations that pigeon tends to nest at.
 */
public enum LocationList {
    TREE("Tree"),
    FOREST("Forest"),
    CLIFF("Cliff"),
    GUTTER("Gutter"),
    GARAGE("Garage"),
    ROOFTOP("Rooftop");

    private final String location;

    /**
     * Constructs a LocationList enum constant with the specified location.
     * @param location the location a pigeon nests on
     */
    private LocationList(String location) {
        this.location = location;
    }

    /**
     * Returns the string representation of the LocationList.
     * @return the string representation of the LocationList
     */
    @Override
    public String toString() {
        return location;
    }
}
