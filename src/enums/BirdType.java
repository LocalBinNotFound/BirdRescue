package enums;

public enum BirdType {
    BIRD_OF_PREY("Bird of prey"),
    BIRD_LIVE_NEAR_WATER("Bird live near water"),
    FLIGHTLESS_BIRD("Flightless bird"),
    OWL("Owl"),
    PARROT("Parrot"),
    PIGEON("Pigeon"),
    SHOREBIRD("Shorebird"),
    WATERFOWL("Waterfowl"),
    OTHER_TYPE("Other type");

    private final String type;

    private BirdType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}

