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
                false, 0, new FoodList[] {FoodList.SEEDS}, false, 6.0F);
        ostrich = new FlightlessBird("Ostrich", BirdType.FLIGHTLESS_BIRD, "huge", false, 2,
                new FoodList[] {FoodList.VEGETATION}, false, 300.0F);
        duck = new Waterfowl();
        goose = new Waterfowl();
        baldEagle = new BirdOfPrey();
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
        conservatory.assignToAviary(kiwi, 5);
        Aviary aviary = conservatory.getAviaries().get(4);
        List<Bird> birdsInAviary = aviary.getBirds();
        assertTrue(birdsInAviary.contains(kiwi));
        assertEquals(1, birdsInAviary.size());
    }

    @Test
    public void TestLookUpAviary() {
    }

    @Test
    public void TestPrintAviary() {
        conservatory.assignToAviary(kiwi, 5);
        conservatory.assignToAviary(kiwi, 5);
        conservatory.assignToAviary(ostrich, 5);
        conservatory.assignToAviary(ostrich, 5);
        System.out.println(conservatory.printAviary(5));
    }

    @Test
    public void TestPrintMap() {
    }
}