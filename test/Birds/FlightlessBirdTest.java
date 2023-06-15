package Birds;

import enums.BirdType;
import enums.FoodList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FlightlessBirdTest {
    private FlightlessBird kiwi;

    @Before
    public void init()  {
        kiwi = new FlightlessBird("Kiwi",
                BirdType.OTHER_TYPE,
                "has loose feathers like fur and does not have wings",
                false,
                0,
                new FoodList[] {FoodList.SEEDS},
                false,
                6.0F);
    }

    @Test
    public void TestType() {
        kiwi.setType(BirdType.FLIGHTLESS_BIRD);
        Assert.assertEquals(BirdType.FLIGHTLESS_BIRD, kiwi.getType());
    }

    @Test
    public void TestPreferredFood() {
        FoodList[] food = {FoodList.INSECTS, FoodList.BERRIES, FoodList.SEEDS};
        kiwi.setPreferredFood(food);
        Assert.assertEquals(food, kiwi.getPreferredFood());

    }

    @Test
    public void TestExceptions() {
        Assert.assertThrows(IllegalArgumentException.class, () -> kiwi.setNumberOfWings(-2));
        Assert.assertThrows(IllegalArgumentException.class, () -> kiwi.setWeight(-1));
        Assert.assertThrows(IllegalArgumentException.class, () -> kiwi.setDefiningCharacteristic(""));
        Assert.assertThrows(IllegalArgumentException.class, () -> kiwi.setPreferredFood(new FoodList[] {}));
    }

    @Test
    public void TestToString() {
        kiwi.setType(BirdType.FLIGHTLESS_BIRD);
        kiwi.setPreferredFood(new FoodList[] {FoodList.INSECTS, FoodList.SEEDS, FoodList.BERRIES});
        System.out.println(kiwi);
    }
}