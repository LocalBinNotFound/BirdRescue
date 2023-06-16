package Birds;

import enums.BirdType;
import enums.FoodList;
import enums.WaterType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShorebirdTest {
    private Shorebird longBilledCurlew;

    @Before
    public void init() {
        longBilledCurlew = new Shorebird("Long-billed curlew",
                BirdType.SHOREBIRD,
                "North America's largest shorebird with a long bill",
                false,
                2,
                new FoodList[] {FoodList.FISH, FoodList.AQUATIC_INVERTEBRATES},
                true,
                1.3F);
        longBilledCurlew.setWaterType(WaterType.SHORE);
        longBilledCurlew.setWaterName("Great Plains of West U.S.");
        longBilledCurlew.setLegLength(23);
    }

    @Test
    public void TestGetters() {
        Assert.assertEquals(WaterType.SHORE, longBilledCurlew.getWaterType());
        Assert.assertEquals("Great Plains of West U.S.", longBilledCurlew.getWaterName());
        Assert.assertEquals(23, longBilledCurlew.getLegLength());
    }

    @Test
    public void TestToString() {
        System.out.println(longBilledCurlew);
    }

}