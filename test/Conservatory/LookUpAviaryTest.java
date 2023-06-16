package Conservatory;

import Birds.BirdOfPrey;
import org.junit.Assert;
import org.junit.Test;

public class LookUpAviaryTest extends Init {

    @Test
    public void Test() {
        BirdOfPrey hawk = new BirdOfPrey();
        Assert.assertEquals("Bird is not found in any Aviary!", conservatory.lookupBird(hawk));
        Assert.assertEquals("Bird is not found in any Aviary!", conservatory.lookupBird(kiwi));
        conservatory.assignToAviary(kiwi, 5);
        Assert.assertEquals("Bird found in Aviary 5", conservatory.lookupBird(kiwi));
    }
}
