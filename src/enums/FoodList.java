package enums;

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

    private FoodList(String preferredFood) {
        this.preferredFood = preferredFood;
    }

    @Override
    public String toString() {
        return preferredFood;
    }
}
