package Birds;

import enums.BirdType;
import enums.FoodList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OwlTest {
    private Owl northernHawkOwl;

    @Before
    public void init() {
        northernHawkOwl = new Owl();
        northernHawkOwl.setName("Northern hawk owl");
        northernHawkOwl.setType(BirdType.OWL);
        northernHawkOwl.setDefiningCharacteristic("diurnal owl with a heart-shaped face");
        northernHawkOwl.setExtinct(false);
        northernHawkOwl.setNumberOfWings(2);
        northernHawkOwl.setPreferredFood(new FoodList[] {FoodList.SMALL_MAMMALS});
        northernHawkOwl.setMigratory(false);
        northernHawkOwl.setWeight(1.0F);
        northernHawkOwl.setFacialDisk(true);
        northernHawkOwl.setFacialDiskColor("Beige");
        northernHawkOwl.setNocturnal(false);
    }

    @Test
    public void TestGetters() {
        Assert.assertEquals(true,northernHawkOwl.hasFacialDisk());
        Assert.assertEquals("Beige",northernHawkOwl.getFacialDiskColor());
        Assert.assertNotEquals(true, northernHawkOwl.isNocturnal());
    }

    @Test
    public void TestToString() {
        System.out.println(northernHawkOwl);
        northernHawkOwl.sleepHours(10);
    }
}