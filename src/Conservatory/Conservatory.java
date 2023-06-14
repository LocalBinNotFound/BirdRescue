package Conservatory;

import Birds.Bird;
import enums.BirdType;

import java.util.ArrayList;
import java.util.List;

public class Conservatory {
    private List<Bird> birds;
    private List<Aviary> aviaries;
    private final int numOfAviaries = 20;

    public Conservatory() {
        birds = new ArrayList<>();
        aviaries = new ArrayList<>(numOfAviaries);
        for (int i = 0; i < numOfAviaries; i++) {
            aviaries.add(new Aviary());
        }
    }

    public void setAviaries(List<Aviary> aviaries) {
        this.aviaries = aviaries;
    }

    public void setBirds(List<Bird> birds) {
        this.birds = birds;
    }

    public List<Aviary> getAviaries() {
        return aviaries;
    }

    public List<Bird> getBirds() {
        return birds;
    }

    public void rescueNewBird(Bird newBird) {
        birds.add(newBird);
    }

    public void calculateFood() {

    }

    public static Boolean isCertainBird(Bird bird, BirdType expectedType) {
        if (bird.getType() == expectedType) {
            return true;
        } else {
            return false;
        }
    }

    public void assignToAviary(Bird newBird, int aviaryLocation) {
        if (aviaryLocation < 1 || aviaryLocation > numOfAviaries) {
            throw new IllegalArgumentException("Aviary number must be between 1-20!");
        }
        if (newBird.isExtinct()) {
            System.out.println("The bird is extinct and cannot be added to the aviary!");
            return;
        }
        Aviary aviary = aviaries.get(aviaryLocation - 1);
        if (aviary.getNumberOfBirds() == 0 && !newBird.isExtinct()) {
            aviary.addBird(newBird);
        } else if (aviary.getNumberOfBirds() < 5 && !newBird.isExtinct()) {
            if (isCertainBird(newBird,BirdType.FLIGHTLESS_BIRD) && aviary.containsCertainBird(BirdType.FLIGHTLESS_BIRD)) {
                aviary.addBird(newBird);
                System.out.println("Rescued bird is " + newBird.getName() + ", a flightless bird.");
                System.out.println("Rescued bird is assigned to Aviary " + aviaryLocation);
            } else if (isCertainBird(newBird, BirdType.BIRD_OF_PREY) && aviary.containsCertainBird(BirdType.BIRD_OF_PREY)) {
                aviary.addBird(newBird);
                System.out.println("Rescued bird is " + newBird.getName() + ", a bird of prey.");
                System.out.println("Rescued bird is assigned to Aviary " + aviaryLocation);
            } else if (isCertainBird(newBird, BirdType.WATERFOWL) && aviary.containsCertainBird(BirdType.WATERFOWL)) {
                aviary.addBird(newBird);
                System.out.println("Rescued bird is " + newBird.getName() + ", a waterfowl.");
                System.out.println("Rescued bird is assigned to Aviary " + aviaryLocation);
            } else {
                aviary.addBird(newBird);
                System.out.println("Rescued bird is assigned to Aviary " + aviaryLocation);
            }
        }
    }

    public String lookUpAviary(Bird newBird) {
        for (int i = 0; i < aviaries.size(); i++) {
            Aviary aviary = aviaries.get(i);
            if (aviary.containsBird(newBird)) {
                return "Bird found in Aviary " + i;
            }
        }
        return "Bird is not found in any Aviary!";
    }

    public String printAviary(int aviaryLocation) {
        if (aviaryLocation < 1 || aviaryLocation > numOfAviaries) {
            throw new IllegalArgumentException("Aviary number must be between 1-20!");
        }
        Aviary aviary = aviaries.get(aviaryLocation - 1);
        if (aviary.getNumberOfBirds() == 0) {
            return "Aviary " + aviaryLocation + " is empty!";
        } else {
            String sign = "Aviary " + aviaryLocation + " Description:\nBirds housed:\n";
            for (Bird bird : aviary.getBirds()) {
                sign += bird.getName() + " - " + bird.getType() + " - " + bird.getDefiningCharacteristic() + "\n";
            }
            return sign;
        }
    }

    public String printMap() {
        return "  ";
    }

}
