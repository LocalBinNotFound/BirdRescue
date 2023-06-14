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
        northernHawkOwl.setPreferredFood(new FoodList[] {FoodList.OTHER_BIRDS, FoodList.SMALL_MAMMALS});
        northernHawkOwl.setMigratory(false);
        northernHawkOwl.setWeight(1.0F);
    }

    @Test
    public void TestFacialDisk() {
        northernHawkOwl.setFacialDisk(true);
        Assert.assertEquals(true,northernHawkOwl.hasFacialDisk());
    }

    @Test
    public void TestFacialDiskColor() {
        northernHawkOwl.setFacialDiskColor("Beige");
        Assert.assertEquals("Beige",northernHawkOwl.getFacialDiskColor());
    }

    @Test
    public void TestNocturnal() {
        northernHawkOwl.setNocturnal(false);
        Assert.assertEquals(false, northernHawkOwl.isNocturnal());
    }

    @Test
    public void TestToString() {
        System.out.println(northernHawkOwl);
        northernHawkOwl.sleepHours(10);
    }
}