package Conservatory;

import Birds.BirdOfPrey;
import org.junit.Assert;
import org.junit.Test;

public class RescueBirdTest extends Init {

    @Test
    public void Test() {
        // checks if birds are already in conservatory
        Assert.assertTrue(conservatory.hasBird(kiwi));
        Assert.assertTrue(conservatory.hasBird(ostrich));
        Assert.assertTrue(conservatory.hasBird(goose));
        Assert.assertTrue(conservatory.hasBird(duck));
        Assert.assertTrue(conservatory.hasBird(baldEagle));

        // check if successfully bring bird into conservatory
        BirdOfPrey hawk = new BirdOfPrey();
        Assert.assertFalse(conservatory.hasBird(hawk));
        conservatory.rescueNewBird(hawk);
        Assert.assertTrue(conservatory.hasBird(hawk));
    }
}
