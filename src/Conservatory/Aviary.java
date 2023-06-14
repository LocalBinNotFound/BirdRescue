package Conservatory;

import Birds.Bird;
import enums.BirdType;
import java.util.ArrayList;
import java.util.List;

public class Aviary {
    private List<Bird> birds;

    public Aviary() {
        birds = new ArrayList<>(5);
    }

    public int getNumberOfBirds() {
        return birds.size();
    }

    public List<Bird> getBirds() {
        return birds;
    }

    public Boolean containsBird(Bird bird) {
        return birds.contains(bird);
    }

    public void addBird(Bird newBird) {
        birds.add(newBird);
    }

    public void removeBird(Bird bird) {
        birds.remove(bird);
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

