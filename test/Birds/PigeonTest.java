package Birds;

import enums.BirdType;
import enums.FoodList;
import enums.LocationList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PigeonTest {
    private Pigeon columbidae;

    @Before
    public void init() {
        columbidae = new Pigeon("Columbidae",
                BirdType.PIGEON,
                "pigeon that have a small green head and large wings",
                false,
                2,
                new FoodList[]{FoodList.BERRIES, FoodList.INSECTS, FoodList.LARVAE},
                true,
                3.0F);
        columbidae.setFeedWithBirdMilk(true);
        columbidae.setNestingLocation(LocationList.CLIFF);
    }

    @Test
    public void TestGetters() {
        Assert.assertEquals(true, columbidae.getFeedWithBirdMilk());
        Assert.assertEquals(LocationList.CLIFF, columbidae.getNestingLocation());
        Assert.assertNotEquals(LocationList.TREE, columbidae.getNestingLocation());
    }

    @Test
    public void TestToString() {
        System.out.println(columbidae);
    }
}