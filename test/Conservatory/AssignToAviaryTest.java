package Conservatory;

import org.junit.Assert;
import org.junit.Test;

public class AssignToAviaryTest extends Init {

    @Test
    public void Test() {
        // aviary location between 1-20
        Assert.assertThrows(IllegalArgumentException.class, () -> conservatory.getAviary(25));

        Assert.assertFalse(conservatory.getAviary(5).containsBird(kiwi));
        conservatory.assignToAviary(kiwi, 5);
        Assert.assertTrue(conservatory.getAviary(5).containsBird(kiwi));

        conservatory.assignToAviary(ostrich, 5);
        Assert.assertTrue(conservatory.getAviary(5).containsBird(ostrich));

        // Waterfowl is not allowed in FlightlessBird aviary
        System.out.println();
        conservatory.assignToAviary(goose, 5);
        Assert.assertFalse(conservatory.getAviary(5).containsBird(goose));
        conservatory.assignToAviary(goose, 6);
        Assert.assertTrue(conservatory.getAviary(6).containsBird(goose));

        // BirdOfPrey is now allowed in FlightlessBird or Waterfowl aviary
        System.out.println();
        conservatory.assignToAviary(baldEagle, 5);
        Assert.assertFalse(conservatory.getAviary(5).containsBird(baldEagle));
        conservatory.assignToAviary(baldEagle, 6);
        Assert.assertFalse(conservatory.getAviary(6).containsBird(baldEagle));
        conservatory.assignToAviary(baldEagle, 7);
        Assert.assertTrue(conservatory.getAviary(7).containsBird(baldEagle));

        // print already in aviary if assigned
        System.out.println();
        conservatory.assignToAviary(baldEagle, 7);
    }
}
