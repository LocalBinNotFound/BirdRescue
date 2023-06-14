package Birds;

import enums.BirdType;
import enums.FoodList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BirdTest {
    private Bird sparrow;
    private Bird invalidSparrow;

    @Before
    public void init() {
        sparrow = new Bird("Sparrow", BirdType.OTHER_TYPE, "has a gray head, a white cheek, a black bib and a rufous neck", false,
                2, new FoodList[] {FoodList.INSECTS, FoodList.SEEDS}, true, 0.0625F);

    }
    @Test
    public void TestType() {
        Assert.assertEquals(BirdType.OTHER_TYPE, sparrow.getType());
    }

    @Test
    public void TestDefiningCharacteristic() {
        Assert.assertEquals("has a gray head, a white cheek, a black bib and a rufous neck",
                sparrow.getDefiningCharacteristic());
    }

    @Test
    public void TestExtinct() {
        Assert.assertEquals(false, sparrow.isExtinct());
    }

    @Test
    public void TestNumberOfWings() {
        Assert.assertEquals(2, sparrow.getNumberOfWings());
    }

    @Test
    public void TestPreferredFood() {
        Assert.assertEquals(new FoodList[] {FoodList.INSECTS, FoodList.SEEDS}, sparrow.getPreferredFood());
    }

    @Test
    public void TestMigratory() {
        Assert.assertEquals(true, sparrow.isMigratory());
    }

    @Test
    public void TestWeight() {
        Assert.assertEquals(0.0625, sparrow.getWeight(),0.01);
    }


    @Test
    public void TestExceptions() {
        Assert.assertThrows(IllegalArgumentException.class, () -> sparrow.setName(""));
        Assert.assertThrows(IllegalArgumentException.class, () -> sparrow.setNumberOfWings(-2));
        Assert.assertThrows(IllegalArgumentException.class, () -> sparrow.setWeight(0.0F));
        Assert.assertThrows(IllegalArgumentException.class, () -> sparrow.setDefiningCharacteristic(""));
        Assert.assertThrows(IllegalArgumentException.class, () -> sparrow.setPreferredFood(new FoodList[] {}));

        // Check exceptions for constructor:
            // Check exception for empty name
        Assert.assertThrows(IllegalArgumentException.class, () -> invalidSparrow = new Bird("", BirdType.OTHER_TYPE,
                "has a gray head, a white cheek, a black bib and a rufous neck", false, 2, new FoodList[] {FoodList.INSECTS, FoodList.SEEDS}));

            // Check exception for empty defining characteristic
        Assert.assertThrows(IllegalArgumentException.class, () -> invalidSparrow = new Bird("Sparrow", BirdType.OTHER_TYPE,
                "", false, 2, new FoodList[] {FoodList.INSECTS, FoodList.SEEDS}));

            // Check exception for negative number of wings
        Assert.assertThrows(IllegalArgumentException.class, () -> invalidSparrow = new Bird("Sparrow", BirdType.OTHER_TYPE,
                "has a gray head, a white cheek, a black bib and a rufous neck", false,
                -1, new FoodList[] {FoodList.INSECTS, FoodList.SEEDS}));

            // Check exception for empty preferred food list
        Assert.assertThrows(IllegalArgumentException.class, () -> invalidSparrow = new Bird("Sparrow", BirdType.OTHER_TYPE,
                "has a gray head, a white cheek, a black bib and a rufous neck", false,
                2, new FoodList[] {}));

            // Check exception for negative weight
        Assert.assertThrows(IllegalArgumentException.class, () -> invalidSparrow = new Bird("Sparrow", BirdType.OTHER_TYPE,
                "has a gray head, a white cheek, a black bib and a rufous neck", false,
                2, new FoodList[] {FoodList.INSECTS, FoodList.SEEDS}, true, -1.0F));

    }
    @Test
    public void TestToString() {
        sparrow.setMigratory(true);
        sparrow.setWeight(0.0625F);
        System.out.println(sparrow);
    }
}