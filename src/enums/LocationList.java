package enums;

public enum LocationList {
    TREE("Tree"),
    FOREST("Forest"),
    CLIFF("Cliff"),
    GUTTER("Gutter"),
    GARAGE("Garage"),
    ROOFTOP("Rooftop");

    private final String location;

    private LocationList(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return location;
    }
}
