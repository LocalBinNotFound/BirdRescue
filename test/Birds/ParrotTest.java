package Birds;

import enums.BirdType;
import enums.FoodList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParrotTest {
    private Parrot africanGrey;

    @Before
    public void init() {
        africanGrey = new Parrot("African grey",
                BirdType.PARROT,
                "highly intelligent parrot that can say hundreds of words",
                false,
                2,
                new FoodList[]{FoodList.SEEDS, FoodList.FRUITS, FoodList.NUTS, FoodList.BERRIES, FoodList.VEGETATION},
                false,
                1.2F);
    }

    @Test
    public void TestSettersAndGetters() {
        africanGrey.setShortBeak(true);
        africanGrey.setVocabularySize(300);
        africanGrey.setFavoriteSaying("I am an african grey and I know so many words!");
        Assert.assertEquals(true, africanGrey.hasShortBeak());
        Assert.assertEquals(300, africanGrey.getVocabularySize());
        Assert.assertEquals("I am an african grey and I know so many words!", africanGrey.getFavoriteSaying());
    }

    @Test
    public void TestExceptions() {
        System.out.println(africanGrey);
        africanGrey.mimicMySound("You look so white!");
    }
}
