package Birds;

import enums.BirdType;
import enums.FoodList;

/**
 * BirdInterface represents a contract for a bird.
 */
public interface BirdInterface {

    /**
     * Sets the name of the bird.
     * @param name the name of the bird
     */
    void setName(String name);

    /**
     * Sets the type of the bird.
     * @param type the type of the bird
     */
    void setType(BirdType type);

    /**
     * Sets the defining characteristic of the bird.
     * @param definingCharacteristic the defining characteristic of the bird
     */
    void setDefiningCharacteristic(String definingCharacteristic);

    /**
     * Sets the extinct status of the bird.
     * @param extinct true if the bird is extinct, false otherwise
     */
    void setExtinct(Boolean extinct);

    /**
     * Sets the number of wings of the bird.
     * @param numberOfWings the number of wings of the bird
     */
    void setNumberOfWings(int numberOfWings);

    /**
     * Sets the preferred food list of the bird.
     * @param preferredFood the preferred food list of the bird
     */
    void setPreferredFood(FoodList[] preferredFood);

    /**
     * Sets the migratory status of the bird.
     * @param migratory true if the bird is migratory, false otherwise
     */
    void setMigratory(Boolean migratory);

    /**
     * Sets the weight of the bird.
     * @param weight the weight of the bird
     */
    void setWeight(float weight);

    /**
     * Retrieves the name of the bird.
     * @return the name of the bird as a {@link String}
     */
    String getName();

    /**
     * Retrieves the type of the bird.
     * @return the type of the bird as a {@link BirdType} object
     */
    BirdType getType();

    /**
     * Retrieves the defining characteristic of the bird.
     * @return the defining characteristic of the bird as a {@link String}
     */
    String getDefiningCharacteristic();

    /**
     * Returns the extinct status of the bird.
     * @return true if the bird is extinct, false otherwise
     */
    Boolean isExtinct();

    /**
     * Retrieves the number of wings of the bird.
     * @return the number of wings of the bird as an integer
     */
    int getNumberOfWings();

    /**
     * Retrieves the preferred food list of the bird.
     * @return an array of {@link FoodList} representing the preferred food of the bird
     */
    FoodList[] getPreferredFood();

    /**
     * Returns the migratory status of the bird.
     * @return true if the bird is migratory, false otherwise
     */
    Boolean isMigratory();

    /**
     * Retrieves the weight of the bird.
     * @return the weight of the bird as a float
     */
    float getWeight();
}

