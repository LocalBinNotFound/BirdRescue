package Birds;

import enums.BirdType;
import enums.FoodList;

/**
 * Represents a bird of prey, known for its hunting and feeding habits.
 * This class extends the {@link Birds.Bird} class and inherits its properties and behaviors.
 * This class provides additional attributes specific to birds of prey.
 * @see Birds.Bird
 */
public class BirdOfPrey extends Bird {
    Boolean sharpBeak;

    public BirdOfPrey() {
    }

    public BirdOfPrey(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
                             FoodList[] preferredFood) {
        super(name, type, definingCharacteristic, extinct, numberOfWings, preferredFood);
    }

    public BirdOfPrey(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
                      FoodList[] preferredFood, Boolean migratory, float weight) {
        super(name, type, definingCharacteristic, extinct, numberOfWings, preferredFood, migratory, weight);
    }

    public BirdOfPrey(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
                      FoodList[] preferredFood, Boolean migratory, float weight, Boolean sharpBeak) {
        super(name, type, definingCharacteristic, extinct, numberOfWings, preferredFood, migratory, weight);
        this.sharpBeak = sharpBeak;
    }

    public void setSharpBeak(Boolean sharpBeak) {
        this.sharpBeak = sharpBeak;
    }

    public Boolean hasSharpBeak() {
        return sharpBeak;
    }
}
