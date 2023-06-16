package Birds;

import enums.BirdType;
import enums.FoodList;
import enums.WaterType;

import java.util.Arrays;

/**
 * Represents a bird that lives near a water source.
 * This class extends the {@link Birds.Bird} class and inherits its properties and behaviors.
 * This class provides additional attributes specific to birds live near water.
 * @see Birds.Bird
 */
public class BirdLiveNearWater extends Bird {
    private WaterType waterType;
    private String waterName;

    // constructors
    public BirdLiveNearWater() {
    }

    public BirdLiveNearWater(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
                             FoodList[] preferredFood) {
        super(name, type, definingCharacteristic, extinct, numberOfWings, preferredFood);
    }

    public BirdLiveNearWater(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
                             FoodList[] preferredFood, Boolean migratory, float weight) {
        super(name, type, definingCharacteristic, extinct, numberOfWings, preferredFood, migratory, weight);
    }

    public BirdLiveNearWater(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
                             FoodList[] preferredFood, Boolean migratory, float weight, WaterType waterType,
                             String waterName) {
        super(name, type, definingCharacteristic, extinct, numberOfWings, preferredFood, migratory, weight);
        this.waterType = waterType;
        if (waterName.isEmpty()) {
            throw new IllegalArgumentException("Water source name cannot be empty!");
        }
        this.waterName = waterName;
    }

    // setters and getters
    public void setWaterType(WaterType waterType) {
        this.waterType = waterType;
    }

    public void setWaterName(String waterName) {
        if (waterName.isEmpty()) {
            throw new IllegalArgumentException("Water source name cannot be empty!");
        }
        this.waterName = waterName;
    }

    public WaterType getWaterType() {
        return waterType;
    }

    public String getWaterName() {
        return waterName;
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
                    Water Name: %s""").formatted(getName(), getType(), getDefiningCharacteristic(), isExtinct(),
                    getNumberOfWings(), Arrays.toString(getPreferredFood()), isMigratory(), getWeight(),waterType,
                    waterName);
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
                    Water Name: %s""").formatted(getName(), getType(), getDefiningCharacteristic(), isExtinct(),
                    getNumberOfWings(), Arrays.toString(getPreferredFood()), isMigratory(), getWeight(),waterType,
                    waterName);
        }
    }

}
