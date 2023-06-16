package Birds;

import enums.BirdType;
import enums.FoodList;

/**
 * Represents a flightless bird, a bird that has no or undeveloped wings.
 * This class extends the {@link Birds.Bird} class and inherits its properties and behaviors.
 * @see Birds.Bird
 */
public class FlightlessBird extends Bird {

    // constructors
    public FlightlessBird() {
    }

    public FlightlessBird(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
                             FoodList[] preferredFood) {
        super(name, type, definingCharacteristic, extinct, numberOfWings, preferredFood);
    }

    public FlightlessBird(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
                          FoodList[] preferredFood, Boolean migratory, float weight) {
        super(name, type, definingCharacteristic, extinct, numberOfWings, preferredFood, migratory, weight);
    }

}
