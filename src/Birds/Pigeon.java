package Birds;

import enums.BirdType;
import enums.FoodList;
import enums.LocationList;

/**
 * Represents a pigeon, known for feeding their young "bird milk".
 * This class extends the {@link Birds.Bird} class and inherits its properties and behaviors.
 * @see Birds.Bird
 */
public class Pigeon extends Bird {
    private Boolean feedWithBirdMilk;
    private LocationList nestingLocation;

    // constructors
    public Pigeon() {
    }

    public Pigeon(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
                  FoodList[] preferredFood) {
        super(name, type, definingCharacteristic, extinct, numberOfWings, preferredFood);
    }

    public Pigeon(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
                  FoodList[] preferredFood, Boolean migratory, float weight) {
        super(name, type, definingCharacteristic, extinct, numberOfWings, preferredFood, migratory, weight);
    }

    public Pigeon(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
                  FoodList[] preferredFood, Boolean migratory, float weight, Boolean feedWithBirdMilk,
                  LocationList nestingLocation) {
        super(name, type, definingCharacteristic, extinct, numberOfWings, preferredFood, migratory, weight);
        this.feedWithBirdMilk = feedWithBirdMilk;
        this.nestingLocation = nestingLocation;
    }

    // setters and getters
    public void setFeedWithBirdMilk(Boolean feedWithBirdMilk) {
        this.feedWithBirdMilk = feedWithBirdMilk;
    }

    public void setNestingLocation(LocationList nestingLocation) {
        this.nestingLocation = nestingLocation;
    }

    public Boolean getFeedWithBirdMilk() {
        return feedWithBirdMilk;
    }

    public LocationList getNestingLocation() {
        return nestingLocation;
    }
}
