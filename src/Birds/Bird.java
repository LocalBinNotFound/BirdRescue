package Birds;

import enums.BirdType;
import enums.FoodList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Represents a bird with various attributes and behaviors.
 * The Birds.Bird class provides methods to set and retrieve information
 * about the bird's type, defining characteristics, extinct status,
 * number of wings, preferred food, migratory behavior, and weight.
 */
public class Bird implements BirdInterface, Comparable<Bird> {
    private String name;
    private BirdType type;
    private String definingCharacteristic;
    private Boolean extinct;
    private int numberOfWings;
    private FoodList[] preferredFood;
    private Boolean migratory;
    private float weight;

    // constructors
    public Bird() {
    }

    public Bird(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
                FoodList[] preferredFood) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Bird name cannot be empty!");
        }
        this.name = name;
        this.type = type;
        if (definingCharacteristic.isEmpty()) {
            throw new IllegalArgumentException("Defining characteristic cannot be empty!");
        }
        this.definingCharacteristic = definingCharacteristic;
        this.extinct = extinct;
        if (numberOfWings < 0) {
            throw new IllegalArgumentException("Number of wings cannot be negative!");
        }
        this.numberOfWings = numberOfWings;
        if (preferredFood.length == 0) {
            throw new IllegalArgumentException("Preferred food list cannot be empty!");
        }
        this.preferredFood = preferredFood;
    }

    public Bird(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
                FoodList[] preferredFood, Boolean migratory, float weight) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Bird name cannot be empty!");
        }
        this.name = name;
        this.type = type;
        if (definingCharacteristic.isEmpty()) {
            throw new IllegalArgumentException("Defining characteristic cannot be empty!");
        }
        this.definingCharacteristic = definingCharacteristic;
        this.extinct = extinct;
        if (numberOfWings < 0) {
            throw new IllegalArgumentException("Number of wings cannot be negative!");
        }
        this.numberOfWings = numberOfWings;
        if (preferredFood.length == 0) {
            throw new IllegalArgumentException("Preferred food list cannot be empty!");
        }
        this.preferredFood = preferredFood;
        this.migratory = migratory;
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be positive!");
        }
        this.weight = weight;
    }

    // setters and getters
    @Override
    public void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Bird name cannot be empty!");
        }
        this.name = name;
    }

    @Override
    public void setType(BirdType type) {
        this.type = type;
    }

    @Override
    public void setDefiningCharacteristic(String definingCharacteristic) {
        if (definingCharacteristic.isEmpty()) {
            throw new IllegalArgumentException("Defining characteristic cannot be empty!");
        }
        this.definingCharacteristic = definingCharacteristic;
    }

    @Override
    public void setExtinct(Boolean extinct) {
        this.extinct = extinct;
    }

    @Override
    public void setNumberOfWings(int numberOfWings) {
        if (numberOfWings < 0) {
            throw new IllegalArgumentException("Number of wings cannot be negative!");
        }
        this.numberOfWings = numberOfWings;
    }

    @Override
    public void setPreferredFood(FoodList[] preferredFood) {
        if (preferredFood.length == 0) {
            throw new IllegalArgumentException("Preferred food list cannot be empty!");
        }
        this.preferredFood = preferredFood;
    }

    @Override
    public void setMigratory(Boolean migratory) {
        this.migratory = migratory;
    }

    @Override
    public void setWeight(float weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be positive!");
        }
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BirdType getType() {
        return type;
    }

    @Override
    public String getDefiningCharacteristic() {
        return definingCharacteristic;
    }

    @Override
    public Boolean isExtinct() {
        return extinct;
    }

    @Override
    public int getNumberOfWings() {
        return numberOfWings;
    }

    @Override
    public FoodList[] getPreferredFood() {
        return preferredFood;
    }

    @Override
    public Boolean isMigratory() {
        return migratory;
    }

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Bird otherBird) {
        return this.getName().compareTo(otherBird.getName());
    }

    @Override
    public String toString() {
        if (weight <= 1) {
            return ("""
                    Bird Name: %s
                    Bird Type: %s
                    Defining Characteristics: %s
                    Extinct: %s
                    Number of Wings: %d
                    Preferred Food: %s
                    Migratory: %s
                    Weight: %s lb""").formatted(name, type, definingCharacteristic, extinct, numberOfWings,
                    Arrays.toString(preferredFood), migratory, weight);
        } else {
            return ("""
                    Bird Name: %s
                    Bird Type: %s
                    Defining Characteristics: %s
                    Extinct: %s
                    Number of Wings: %d
                    Preferred Food: %s
                    Migratory: %s
                    Weight: %s lbs""").formatted(name, type, definingCharacteristic, extinct, numberOfWings,
                    Arrays.toString(preferredFood), migratory, weight);
        }
    }


    // keep track of food quantity of certain bird
    public Map<FoodList, Quantity> getFoodQuantity() {
        Map<FoodList, Quantity> foodNeededPerMonth = new HashMap<>();

        for (FoodList food : preferredFood) {
            Quantity quantity = switch (food) {
                case BERRIES, SEEDS, FRUITS, NUTS, VEGETATION -> new Quantity(60, "lbs");
                case INSECTS, BUDS, LARVAE -> new Quantity(600, "units");
                case OTHER_BIRDS, SMALL_MAMMALS, FISH, AQUATIC_INVERTEBRATES -> new Quantity(100, "units");
                case EGGS -> new Quantity(100, "lbs");
            };
            foodNeededPerMonth.put(food, quantity);
        }
        return foodNeededPerMonth;

    }
}
