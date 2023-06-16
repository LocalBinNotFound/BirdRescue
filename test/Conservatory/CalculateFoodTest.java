package Conservatory;

import Birds.*;
import enums.BirdType;
import enums.FoodList;
import org.junit.Assert;
import org.junit.Test;

public class CalculateFoodTest extends Init {

    @Test
    public void Test() {
        Assert.assertEquals("""
                Food requirements:
                 * Aquatic invertebrates - 200 units
                 * Vegetation - 60 lbs
                 * Seeds - 60 lbs
                 * Small mammals - 100 units
                 * Fish - 300 units
                 * Other birds - 100 units
                 """, conservatory.calculateFood());



        Owl northernHawkOwl = new Owl("Northern hawk owl", BirdType.OWL, "diurnal owl with a heart-shaped face", false, 2,
                new FoodList[]{FoodList.SMALL_MAMMALS}, false, 1.0F);
        conservatory.rescueNewBird(northernHawkOwl);

        // Small mammals 100 units -> 200 units
        Assert.assertEquals("""
                Food requirements:
                 * Aquatic invertebrates - 200 units
                 * Vegetation - 60 lbs
                 * Seeds - 60 lbs
                 * Small mammals - 200 units
                 * Fish - 300 units
                 * Other birds - 100 units
                """, conservatory.calculateFood());



        Pigeon columbidae = new Pigeon("Columbidae", BirdType.PIGEON, "pigeon that have a small green head and large wings",
                false, 2, new FoodList[]{FoodList.BERRIES, FoodList.INSECTS, FoodList.LARVAE}, true, 3.0F);
        conservatory.rescueNewBird(columbidae);

        // Insects 0 -> 600 units
        // Larvae  0 -> 600 units
        // Berries 0 -> 60 lbs
        Assert.assertEquals("""
                Food requirements:
                 * Insects - 600 units
                 * Larvae - 600 units
                 * Berries - 60 lbs
                 * Aquatic invertebrates - 200 units
                 * Vegetation - 60 lbs
                 * Seeds - 60 lbs
                 * Small mammals - 200 units
                 * Fish - 300 units
                 * Other birds - 100 units
                """, conservatory.calculateFood());
    }
}
