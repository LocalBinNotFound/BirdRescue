package Birds;

import enums.BirdType;
import enums.FoodList;
import enums.WaterType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WaterfowlTest {
    private Waterfowl goose;

    @Before
    public void init() {
        goose = new Waterfowl("Goose",
                BirdType.WATERFOWL,
                "known for its long neck and ability to swim",
                false,
                2,
                new FoodList[]{FoodList.FISH, FoodList.AQUATIC_INVERTEBRATES},
                true,
                10.5F);
        goose.setWaterType(WaterType.POND);
        goose.setWaterName("Swanson pond");
        goose.setWebbedFeet(true);
        goose.setNeckLength(20);
        goose.setSwim(true);
    }

    @Test
    public void TestSettersAndGetters() {
        Assert.assertEquals(true, goose.hasWebbedFeet());
        Assert.assertEquals(20, goose.getNeckLength());
        Assert.assertEquals(true, goose.canSwim());
    }

    @Test
    public void TestToString() {
        System.out.println(goose);
    }
}