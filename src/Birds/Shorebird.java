package Birds;

import enums.BirdType;
import enums.FoodList;
import enums.WaterType;

import java.util.Arrays;

/**
 * Represents a shorebird that lives near water sources but has long legs for probing.
 * This class extends the {@link Birds.Bird} class and inherits its properties and behaviors.
 * @see Birds.Bird
 */
public class Shorebird extends BirdLiveNearWater{
    private int legLength;

    // constructors
    public Shorebird() {
    }

    public Shorebird(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
                     FoodList[] preferredFood) {
        super(name, type, definingCharacteristic, extinct, numberOfWings, preferredFood);
    }

    public Shorebird(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
                     FoodList[] preferredFood, Boolean migratory, float weight) {
        super(name, type, definingCharacteristic, extinct, numberOfWings, preferredFood, migratory, weight);
    }

    public Shorebird(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
                     FoodList[] preferredFood, Boolean migratory, float weight, WaterType waterType, String waterName) {
        super(name, type, definingCharacteristic, extinct, numberOfWings, preferredFood, migratory, weight, waterType, waterName);
    }

    public Shorebird(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
                     FoodList[] preferredFood, Boolean migratory, float weight, WaterType waterType, String waterName,
                     int legLength) {
        super(name, type, definingCharacteristic, extinct, numberOfWings, preferredFood, migratory, weight, waterType, waterName);
        this.legLength = legLength;
    }

    // setter and getter
    public void setLegLength(int legLength) {
        this.legLength = legLength;
    }

    public int getLegLength() {
        return legLength;
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
                    Water Type: %s
                    Water Name: %s
                    Leg Length: %d inches""").formatted(getName(), getType(), getDefiningCharacteristic(), isExtinct(),
                    getNumberOfWings(), Arrays.toString(getPreferredFood()), isMigratory(), getWeight(),getWaterType(),
                    getWaterName(), legLength);
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
                    Water Type: %s
                    Water Name: %s
                    Leg Length: %d inches""").formatted(getName(), getType(), getDefiningCharacteristic(), isExtinct(),
                    getNumberOfWings(), Arrays.toString(getPreferredFood()), isMigratory(), getWeight(),getWaterType(),
                    getWaterName(), legLength);
        }
    }
}
