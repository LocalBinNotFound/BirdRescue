package Birds;

import enums.BirdType;
import enums.FoodList;
import enums.LocationList;

import java.util.Arrays;

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
                    Feed with Bird Milk: %s
                    Nesting Location: %s""").formatted(getName(), getType(), getDefiningCharacteristic(), isExtinct(),
                    getNumberOfWings(), Arrays.toString(getPreferredFood()), isMigratory(), getWeight(),feedWithBirdMilk,
                    nestingLocation);
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
                    Feed with Bird Milk: %s
                    Nesting Location: %s""").formatted(getName(), getType(), getDefiningCharacteristic(), isExtinct(),
                    getNumberOfWings(), Arrays.toString(getPreferredFood()), isMigratory(), getWeight(),feedWithBirdMilk,
                    nestingLocation);
        }
    }
}
