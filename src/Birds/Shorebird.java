package Birds;

import enums.BirdType;
import enums.FoodList;
import enums.WaterType;

/**
 * Represents a shorebird that lives near water sources but has long legs for probing.
 * This class extends the {@link Birds.Bird} class and inherits its properties and behaviors.
 * @see Birds.Bird
 */
public class Shorebird extends BirdLiveNearWater{
    private int legLength;

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

    public void setLegLength(int legLength) {
        this.legLength = legLength;
    }

    public int getLegLength() {
        return legLength;
    }
}
