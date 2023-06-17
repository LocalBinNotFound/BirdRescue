package Conservatory;

import Birds.Bird;
import enums.BirdType;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a single aviary that can house at most 5 birds.
 */
public class Aviary {
    private List<Bird> birds;

    // constructor
    public Aviary() {
        birds = new ArrayList<>(5);
    }

    public List<Bird> getBirds() {
        return birds;
    }

    public void addBird(Bird Bird) {
        birds.add(Bird);
    }

    public void removeBird(Bird bird) {
        birds.remove(bird);
    }

    // helper methods in each aviary
    public int getNumberOfBirds() {
        return birds.size();
    }

    public Boolean containsBird(Bird bird) {
        return birds.contains(bird);
    }

    public Boolean containsCertainBird(BirdType expectedType) {
        for (Bird bird : birds) {
            if (Conservatory.isCertainBird(bird, expectedType)) {
                return true;
            }
        }
        return false;
    }

}

