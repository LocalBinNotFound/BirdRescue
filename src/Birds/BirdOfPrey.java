package Birds;

import enums.BirdType;
import enums.FoodList;

import java.util.Arrays;

/**
 * Represents a bird of prey, known for its hunting and feeding habits.
 * This class extends the {@link Birds.Bird} class and inherits its properties and behaviors.
 * This class provides additional attributes specific to birds of prey.
 * @see Birds.Bird
 */
public class BirdOfPrey extends Bird {
    Boolean sharpBeak;

    // constructors
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

    // setters and getters
    public void setSharpBeak(Boolean sharpBeak) {
        this.sharpBeak = sharpBeak;
    }

    public Boolean hasSharpBeak() {
        return sharpBeak;
    }

    @Override
    public String toString() {
        if (getWeight() <= 1) {
            return ("""
                    Bird Name: %s
                    Bird Type: %s
                    Defining Characteristics: %s
                    Extinct: %s
                    Number of Wings: %d
                    Preferred Food: %s
                    Migratory: %s
                    Weight: %s lb
                    Sharp Beak: %s""").formatted(getName(), getType(), getDefiningCharacteristic(), isExtinct(),
                    getNumberOfWings(), Arrays.toString(getPreferredFood()), isMigratory(), getWeight(),sharpBeak);
        } else {
            return ("""
                    Bird Name: %s
                    Bird Type: %s
                    Defining Characteristics: %s
                    Extinct: %s
                    Number of Wings: %d
                    Preferred Food: %s
                    Migratory: %s
                    Weight: %s lbs
                    Sharp Beak: %s""").formatted(getName(), getType(), getDefiningCharacteristic(), isExtinct(),
                    getNumberOfWings(), Arrays.toString(getPreferredFood()), isMigratory(), getWeight(),sharpBeak);
        }
    }
}
