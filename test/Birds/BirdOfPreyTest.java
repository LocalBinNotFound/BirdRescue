package Birds;

import enums.BirdType;
import enums.FoodList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BirdOfPreyTest {

    private BirdOfPrey baldEagle;

    @Before
    public void init() {
        baldEagle = new BirdOfPrey();
    }

    @Test
    public void TestName() {
        baldEagle.setName("Bald eagle");
        Assert.assertEquals("Bald eagle", baldEagle.getName());
    }

    @Test
    public void TestType() {
        baldEagle.setType(BirdType.BIRD_OF_PREY);
        Assert.assertEquals(BirdType.BIRD_OF_PREY, baldEagle.getType());
    }

    @Test
    public void TestDefiningCharacteristic() {
        baldEagle.setDefiningCharacteristic("large bird with white head and yellow eyes");
        Assert.assertEquals("large bird with white head and yellow eyes", baldEagle.getDefiningCharacteristic());
    }

    @Test
    public void TestExtinct() {
        baldEagle.setExtinct(false);
        Assert.assertEquals(false, baldEagle.isExtinct());
    }

    @Test
    public void TestNumberOfWings() {
        baldEagle.setNumberOfWings(2);
        Assert.assertEquals(2,baldEagle.getNumberOfWings());
    }

    @Test
    public void TestPreferredFood() {
        FoodList[] food = {FoodList.OTHER_BIRDS, FoodList.SMALL_MAMMALS, FoodList.FISH};
        baldEagle.setPreferredFood(food);
        Assert.assertEquals(food, baldEagle.getPreferredFood());
    }

    @Test
    public void TestMigratory() {
        baldEagle.setMigratory(true);
        Assert.assertEquals(true,baldEagle.isMigratory());
    }

    @Test
    public void TestWeight() {
        baldEagle.setWeight(13.0F);
        Assert.assertEquals(13.0, baldEagle.getWeight(),0.01);
    }

    @Test
    public void TestSharpBeak() {
        baldEagle.setSharpBeak(true);
        Assert.assertEquals(true, baldEagle.hasSharpBeak());
    }

    @Test
    public void TestExceptions() {
        Assert.assertThrows(IllegalArgumentException.class, () -> baldEagle.setNumberOfWings(-2));
        Assert.assertThrows(IllegalArgumentException.class, () -> baldEagle.setWeight(0.0F));
    }
    @Test
    public void TestToString() {
        baldEagle.setName("Bald eagle");
        baldEagle.setType(BirdType.BIRD_OF_PREY);
        baldEagle.setDefiningCharacteristic("large bird with white head and yellow eyes");
        baldEagle.setExtinct(false);
        baldEagle.setNumberOfWings(2);
        baldEagle.setPreferredFood(new FoodList[] {FoodList.OTHER_BIRDS, FoodList.SMALL_MAMMALS, FoodList.FISH});
        baldEagle.setMigratory(true);
        baldEagle.setWeight(13.0F);
        baldEagle.setSharpBeak(true);
        System.out.println(baldEagle);
    }
}