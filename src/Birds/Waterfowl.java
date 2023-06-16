package Birds;

import enums.BirdType;
import enums.FoodList;
import enums.WaterType;

import java.util.Arrays;

/**
 * Represents a waterfowl that also lives near water but has long necks.
 * This class extends the {@link Birds.Bird} class and inherits its properties and behaviors.
 * @see Birds.Bird
 */
public class Waterfowl extends BirdLiveNearWater {
    private Boolean webbedFeet;
    private int neckLength;
    private Boolean swim;

    // constructors
    public Waterfowl() {
    }

    public Waterfowl(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
                     FoodList[] preferredFood) {
        super(name, type, definingCharacteristic, extinct, numberOfWings, preferredFood);
    }

    public Waterfowl(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
                     FoodList[] preferredFood, Boolean migratory, float weight) {
        super(name, type, definingCharacteristic, extinct, numberOfWings, preferredFood, migratory, weight);
    }

    public Waterfowl(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
                     FoodList[] preferredFood, Boolean migratory, float weight, WaterType waterType, String waterName) {
        super(name, type, definingCharacteristic, extinct, numberOfWings, preferredFood, migratory, weight, waterType, waterName);
    }

    public Waterfowl(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
                     FoodList[] preferredFood, Boolean migratory, float weight, WaterType waterType, String waterName,
                     Boolean webbedFeet, int neckLength, Boolean swim) {
        super(name, type, definingCharacteristic, extinct, numberOfWings, preferredFood, migratory, weight, waterType, waterName);
        this.webbedFeet = webbedFeet;
        this.neckLength = neckLength;
        this.swim = swim;
    }

    // setters and getters
    public void setWebbedFeet(Boolean webbedFeet) {
        this.webbedFeet = webbedFeet;
    }

    public void setNeckLength(int neckLength) {
        this.neckLength = neckLength;
    }

    public void setSwim(Boolean swim) {
        this.swim = swim;
    }

    public Boolean hasWebbedFeet() {
        return webbedFeet;
    }

    public int getNeckLength() {
        return neckLength;
    }

    public Boolean canSwim() {
        return swim;
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
                    Webbed Feet: %s
                    Neck Length: %d inches
                    Can Swim: %s""").formatted(getName(), getType(), getDefiningCharacteristic(), isExtinct(),
                    getNumberOfWings(), Arrays.toString(getPreferredFood()), isMigratory(), getWeight(),getWaterType(),
                    getWaterName(), webbedFeet, neckLength, swim);
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
            Webbed Feet: %s
            Neck Length: %d inches
            Can Swim: %s""").formatted(getName(), getType(), getDefiningCharacteristic(), isExtinct(),
                    getNumberOfWings(), Arrays.toString(getPreferredFood()), isMigratory(), getWeight(),getWaterType(),
                    getWaterName(), webbedFeet, neckLength, swim);
        }
    }
}
