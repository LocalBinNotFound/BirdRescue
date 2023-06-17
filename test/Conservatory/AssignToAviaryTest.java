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
        conservatory.assignToAviary(goose, 5);
        Assert.assertFalse(conservatory.getAviary(5).containsBird(goose));
        conservatory.assignToAviary(goose, 6);
        Assert.assertTrue(conservatory.getAviary(6).containsBird(goose));
        conservatory.assignToAviary(duck, 6);
        Assert.assertTrue(conservatory.getAviary(6).containsBird(duck));

        // remove bird from one aviary
        conservatory.getAviary(6).removeBird(goose);
        Assert.assertFalse(conservatory.getAviary(6).containsBird(goose));

        // BirdOfPrey is now allowed in FlightlessBird or Waterfowl aviary
        conservatory.assignToAviary(baldEagle, 5);
        Assert.assertFalse(conservatory.getAviary(5).containsBird(baldEagle));
        conservatory.assignToAviary(baldEagle, 6);
        Assert.assertFalse(conservatory.getAviary(6).containsBird(baldEagle));
        conservatory.assignToAviary(baldEagle, 7);
        Assert.assertTrue(conservatory.getAviary(7).containsBird(baldEagle));

        // other types of birds can mix and match
        conservatory.assignToAviary(snowyOwl, 5);
        conservatory.assignToAviary(snowyOwl, 20);
        conservatory.assignToAviary(cockatiel, 6);
        conservatory.assignToAviary(cockatiel, 20);
        conservatory.assignToAviary(icePigeon, 7);
        conservatory.assignToAviary(icePigeon, 20);
        Assert.assertTrue(conservatory.getAviary(20).containsBird(snowyOwl));
        Assert.assertTrue(conservatory.getAviary(20).containsBird(cockatiel));
        Assert.assertTrue(conservatory.getAviary(20).containsBird(icePigeon));

        // print already assigned
        conservatory.assignToAviary(icePigeon, 15);
    }
}
