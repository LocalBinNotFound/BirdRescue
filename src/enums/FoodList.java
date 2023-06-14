package enums;

/**
 * Enum representing the list of foods birds typically eat.
 */
public enum FoodList {
    BERRIES("Berries"),
    SEEDS("Seeds"),
    FRUITS("Fruits"),
    INSECTS("Insects"),
    OTHER_BIRDS("Other birds"),
    EGGS("Eggs"),
    SMALL_MAMMALS("Small mammals"),
    FISH("Fish"),
    BUDS("Buds"),
    LARVAE("Larvae"),
    AQUATIC_INVERTEBRATES("Aquatic invertebrates"),
    NUTS("Nuts"),
    VEGETATION("Vegetation");

    private final String preferredFood;

    /**
     * Constructs a FoodList enum constant with the specified food.
     * @param preferredFood the preferred food of the bird
     */
    private FoodList(String preferredFood) {
        this.preferredFood = preferredFood;
    }

    /**
     * Returns the string representation of the FoodList.
     * @return the string representation of the FoodList
     */
    @Override
    public String toString() {
        return preferredFood;
    }
}
