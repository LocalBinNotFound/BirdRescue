package Birds;

import enums.BirdType;
import enums.FoodList;

/**
 * Represents a parrot, known for its intelligence and ability to mimic sounds.
 * This class extends the {@link Birds.Bird} class and inherits its properties and behaviors.
 * @see Birds.Bird
 */
public class Parrot extends Bird {
    private Boolean shortBeak;
    private int vocabularySize;
    private String favoriteSaying;

    public Parrot() {
    }

    public Parrot(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
                  FoodList[] preferredFood) {
        super(name, type, definingCharacteristic, extinct, numberOfWings, preferredFood);
    }

    public Parrot(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
                  FoodList[] preferredFood, Boolean migratory, float weight) {
        super(name, type, definingCharacteristic, extinct, numberOfWings, preferredFood, migratory, weight);
    }

    public Parrot(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
                  FoodList[] preferredFood, Boolean migratory, float weight, Boolean shortBeak, int vocabularySize,
                  String favoriteSaying) {
        super(name, type, definingCharacteristic, extinct, numberOfWings, preferredFood, migratory, weight);
        this.shortBeak = shortBeak;
        this.vocabularySize = vocabularySize;
        this.favoriteSaying = favoriteSaying;
    }

    public void setShortBeak(Boolean shortBeak) {
        this.shortBeak = shortBeak;
    }

    public void setVocabularySize(int vocabularySize) {
        this.vocabularySize = vocabularySize;
    }

    public void setFavoriteSaying(String favoriteSaying) {
        this.favoriteSaying = favoriteSaying;
    }

    public Boolean hasShortBeak() {
        return shortBeak;
    }

    public int getVocabularySize() {
        return vocabularySize;
    }

    public String getFavoriteSaying() {
        return favoriteSaying;
    }

    public void mimicMySound(String mySound) {
        System.out.println(mySound);
    }
}
