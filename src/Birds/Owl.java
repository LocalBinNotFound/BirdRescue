package Birds;

import enums.BirdType;
import enums.FoodList;

/**
 * Represents an owl, a bird that has distinguished facial disk that frames its eyes and bill.
 * This class extends the {@link Birds.Bird} class and inherits its properties and behaviors.
 * @see Birds.Bird
 */
public class Owl extends Bird {
    private Boolean facialDisk;
    private String facialDiskColor;
    private Boolean nocturnal;

    public Owl() {
    }

    public Owl(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
               FoodList[] preferredFood) {
        super(name, type, definingCharacteristic, extinct, numberOfWings, preferredFood);
    }

    public Owl(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
               FoodList[] preferredFood, Boolean migratory, float weight) {
        super(name, type, definingCharacteristic, extinct, numberOfWings, preferredFood, migratory, weight);
    }

    public Owl(String name, BirdType type, String definingCharacteristic, Boolean extinct, int numberOfWings,
               FoodList[] preferredFood, Boolean migratory, float weight, Boolean facialDisk, String facialDiskColor,
               Boolean nocturnal) {
        super(name, type, definingCharacteristic, extinct, numberOfWings, preferredFood, migratory, weight);
        this.facialDisk = facialDisk;
        if (facialDiskColor.isEmpty()) {
            throw new IllegalArgumentException("Facial disk color cannot be empty!");
        }
        this.facialDiskColor = facialDiskColor;
        this.nocturnal = nocturnal;
    }

    public void setFacialDisk(Boolean facialDisk) {
        this.facialDisk = facialDisk;
    }

    public void setFacialDiskColor(String facialDiskColor) {
        if (facialDiskColor.isEmpty()) {
            throw new IllegalArgumentException("Facial disk color cannot be empty!");
        }
        this.facialDiskColor = facialDiskColor;
    }

    public void setNocturnal(Boolean nocturnal) {
        this.nocturnal = nocturnal;
    }

    public Boolean hasFacialDisk() {
        return facialDisk;
    }

    public String getFacialDiskColor() {
        return facialDiskColor;
    }

    public Boolean isNocturnal() {
        return nocturnal;
    }

    public void sleepHours(int hours) {
        System.out.println("This owl sleeps for " + hours + " hours.");
    }
}
