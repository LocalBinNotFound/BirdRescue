package enums;

/**
 * Enum representing the types of birds.
 */
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

    /**
     * Constructs a BirdType enum constant with the specified type.
     * @param type the type of the bird
     */
    private BirdType(String type) {
        this.type = type;
    }

    /**
     * Returns the string representation of the BirdType.
     * @return the string representation of the BirdType
     */
    @Override
    public String toString() {
        return type;
    }
}

