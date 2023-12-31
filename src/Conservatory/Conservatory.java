package Conservatory;

import Birds.Bird;
import Birds.Quantity;
import enums.BirdType;
import enums.FoodList;

import java.util.*;

/**
 * Represents the conservatory that is used to bring in rescued birds.
 * The conservatory has 20 aviaries, each can house at most 5 birds.
 */
public class Conservatory {
    private final List<Bird> birds;
    private final List<Aviary> aviaries;
    private final int numOfAviaries = 20;
    private final int maxNumEachAviary = 5;

    // constructor
    public Conservatory() {
        birds = new ArrayList<>();
        aviaries = new ArrayList<>(20);
        for (int i = 0; i < numOfAviaries; i++) {
            aviaries.add(new Aviary());
        }
    }

    public Aviary getAviary(int location) {
        if (location < 1 || location > numOfAviaries) {
            throw new IllegalArgumentException("Invalid aviary location!");
        }
        return aviaries.get(location - 1);
    }

    public List<Bird> getBirds() {
        return birds;
    }

    public Boolean hasBird(Bird bird) {
        return birds.contains(bird);
    }

    // check if bird is of certain type
    public static Boolean isCertainBird(Bird bird, BirdType expectedType) {
        return bird.getType() == expectedType;
    }

    // rescue new bird and bring into conservatory
    public void rescueNewBird(Bird newBird) {
        birds.add(newBird);
    }

    // calculate food quantities for all birds in conservatory
    public String calculateFood() {
        StringBuilder foodString = new StringBuilder();
        foodString.append("Food requirements:\n");
        Map<FoodList, Quantity> totalFoodRequired = new HashMap<>();

        for (Bird bird : birds) {
            FoodList[] preferredFood = bird.getPreferredFood();
            Map<FoodList, Quantity> foodEachBird = bird.getFoodQuantity();
            for (FoodList food : preferredFood) {       // combine food values
                Quantity quantity = foodEachBird.get(food);
                totalFoodRequired.merge(food, quantity,
                        (q1, q2) -> new Quantity(q1.quantity() + q2.quantity(), q1.unit()));
            }
        }
        totalFoodRequired.forEach((food, quantity) -> {
            foodString.append(" * ").append(food).append(" - ");
            foodString.append(quantity.quantity()).append(" ").append(quantity.unit()).append("\n");
        });
        return foodString.toString();
    }

    // look up which aviary a bird is in
    public String lookupBird(Bird newBird) {
        for (int i = 0; i < aviaries.size(); i++) {
            Aviary aviary = aviaries.get(i);
            if (aviary.containsBird(newBird)) {
                return "Bird found in Aviary " + (i + 1);
            }
        }
        return "Bird is not found in any Aviary!";
    }

    // assign bird to aviary following criteria
    public void assignToAviary(Bird newBird, int aviaryLocation) {

        // check aviary number, bird extinct status, if bird has already been assigned to aviary
        if (aviaryLocation < 1 || aviaryLocation > numOfAviaries) {
            throw new IllegalArgumentException("Aviary number must be between 1-20!");
        }
        if (newBird.isExtinct()) {
            System.out.println("The bird is extinct and cannot be added to the aviary!");
            return;
        }
        if (!lookupBird(newBird).equals("Bird is not found in any Aviary!")) {
            System.out.println(newBird.getName() + " has already been assigned to " + lookupBird(newBird).substring(14));
            return;
        }

        Aviary aviary = aviaries.get(aviaryLocation - 1);
        if (aviary.getNumberOfBirds() < maxNumEachAviary) {
            if (aviary.getNumberOfBirds() == 0) {
                aviary.addBird(newBird);
            } else {    // if bird type match for three
                if ((isCertainBird(newBird, BirdType.FLIGHTLESS_BIRD) && aviary.containsCertainBird(BirdType.FLIGHTLESS_BIRD))
                        || (isCertainBird(newBird, BirdType.BIRD_OF_PREY) && aviary.containsCertainBird(BirdType.BIRD_OF_PREY))
                        || (isCertainBird(newBird, BirdType.WATERFOWL) && aviary.containsCertainBird(BirdType.WATERFOWL))) {
                    aviary.addBird(newBird);
                } else if (!(aviary.containsCertainBird(BirdType.FLIGHTLESS_BIRD)   // if none of three exists in aviary
                         || aviary.containsCertainBird(BirdType.BIRD_OF_PREY)
                         || aviary.containsCertainBird(BirdType.WATERFOWL))) {
                    aviary.addBird(newBird);
                } else {
                    System.out.println(newBird.getName() + " cannot be assigned to Aviary " + aviaryLocation + "!");
                }
            }
        } else {
            System.out.println("This aviary is full and cannot add more birds!");
        }
    }

    // print sign for any given aviary
    public String printAviary(int aviaryLocation) {
        if (aviaryLocation < 1 || aviaryLocation > numOfAviaries) {
            throw new IllegalArgumentException("Aviary number must be between 1-20!");
        }
        Aviary aviary = aviaries.get(aviaryLocation - 1);
        if (aviary.getNumberOfBirds() == 0) {
            return "Aviary " + aviaryLocation + " is empty!";
        } else {
            StringBuilder sign = new StringBuilder("Aviary " + aviaryLocation + " - Birds housed:\n");
            for (Bird bird : aviary.getBirds()) {
                sign.append(" * ").append(bird.getName()).append(" - ").append(bird.getType()).
                        append(" - ").append(bird.getDefiningCharacteristic()).append("\n");
            }
            return sign.toString();
        }
    }

    // print a map of all aviaries by location and birds they house
    public String printMap() {
        StringBuilder map = new StringBuilder("Printing aviary locations and birds they house:\n");
        for (int i = 0; i < aviaries.size(); i++) {
            map.append("Aviary ").append(i + 1).append(":");
            Aviary aviary = aviaries.get(i);
            if (aviary.getNumberOfBirds() == 0) {
                map.append(" Empty!\n");
            } else {
                map.append("\n");
                for (Bird bird : aviary.getBirds()) {
                    map.append(" * ").append(bird.getName()).append(" - ").
                            append(bird.getType()).append(" - ").append(bird.getDefiningCharacteristic()).append("\n");
                }
            }
        }
        return map.toString();
    }

    // print all birds alphabetically and their respective locations
    public String printIndex() {
        StringBuilder index = new StringBuilder("Printing all birds in alphabetical order and aviary locations:\n");
        List<Bird> sortedBirds = new ArrayList<>(birds);
        Collections.sort(sortedBirds);
        for (Bird bird : sortedBirds) {
            index.append(" * ").append(bird.getName()).append(" - ").append(lookupBird(bird)).append("\n");
        }
        return index.toString();
    }
}
