package Conservatory;

import org.junit.Assert;
import org.junit.Test;

public class PrintAviaryTest extends Init {

    @Test
    public void Test() {
        Assert.assertThrows(IllegalArgumentException.class, () -> conservatory.printAviary(25));

        Assert.assertEquals("Aviary 5 is empty!", conservatory.printAviary(5));
        Assert.assertEquals("Aviary 6 is empty!", conservatory.printAviary(6));
        Assert.assertEquals("Aviary 7 is empty!", conservatory.printAviary(7));

        conservatory.assignToAviary(kiwi, 5);
        conservatory.assignToAviary(ostrich, 5);
        Assert.assertEquals("""
                Aviary 5 - Birds housed:
                 * Kiwi - Flightless bird - has loose feathers like fur and does not have wings
                 * Ostrich - Flightless bird - huge bird that lives in deserts
                """, conservatory.printAviary(5));


        conservatory.assignToAviary(goose, 6);
        conservatory.assignToAviary(duck, 6);
        Assert.assertEquals("""
                Aviary 6 - Birds housed:
                 * Goose - Waterfowl - known for its long neck and ability to swim
                 * Duck - Waterfowl - has yellow beak and can swim
                """, conservatory.printAviary(6));


        conservatory.assignToAviary(baldEagle, 7);
        Assert.assertEquals("""
                Aviary 7 - Birds housed:
                 * Bald eagle - Bird of prey - large bird with white head and yellow eyes
                """, conservatory.printAviary(7));
    }
}
