package Conservatory;

import Birds.*;
import enums.BirdType;
import enums.FoodList;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ConservatoryTest {

    private Conservatory conservatory;
    private FlightlessBird kiwi;
    private FlightlessBird ostrich;
    private Waterfowl duck;
    private Waterfowl goose;
    private BirdOfPrey baldEagle;
    private BirdOfPrey hawk;
    private Owl northernHawkOwl;

    @Before
    public void init() {
        conservatory = new Conservatory();
        kiwi = new FlightlessBird("Kiwi", BirdType.FLIGHTLESS_BIRD, "has loose feathers like fur and does not have wings",
                false, 0, new FoodList[] {FoodList.SEEDS}, false, 6);
        ostrich = new FlightlessBird("Ostrich", BirdType.FLIGHTLESS_BIRD, "huge", false, 2,
                new FoodList[] {FoodList.VEGETATION}, false, 300);
        duck = new Waterfowl("Duck", BirdType.WATERFOWL, "has yellow beak and can swim", false, 2,
                new FoodList[] {FoodList.FISH, FoodList.AQUATIC_INVERTEBRATES}, true, 3.5F);
        goose = new Waterfowl("Goose", BirdType.WATERFOWL, "known for its long neck and ability to swim", false, 2,
                new FoodList[] {FoodList.FISH,FoodList.AQUATIC_INVERTEBRATES}, true, 10.5F);
        baldEagle = new BirdOfPrey("Bald eagle", BirdType.BIRD_OF_PREY, "large bird with white head and yellow eyes",
                false, 2, new FoodList[] {FoodList.OTHER_BIRDS, FoodList.SMALL_MAMMALS, FoodList.FISH}, true, 13);
        hawk = new BirdOfPrey();
        northernHawkOwl = new Owl();
    }

    @Test
    public void TestRescueNewBird() {
    }

    @Test
    public void TestCalculateFood() {
    }

    @Test
    public void TestIsCertainBird() {
    }

    @Test
    public void TestAssignToAviary() {
    }

    @Test
    public void TestLookUpAviary() {
    }

    @Test
    public void TestPrintAviary() {
        conservatory.assignToAviary(kiwi, 5);
        conservatory.assignToAviary(ostrich, 5);
        conservatory.assignToAviary(goose, 6);
        conservatory.assignToAviary(duck, 6);
        conservatory.assignToAviary(baldEagle, 6);
        conservatory.assignToAviary(baldEagle, 7);
        System.out.println(conservatory.printAviary(5));
        System.out.println(conservatory.printAviary(6));
        System.out.println(conservatory.printAviary(7));
    }

    @Test
    public void TestPrintMap() {
    }
}