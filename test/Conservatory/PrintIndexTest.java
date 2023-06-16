package Conservatory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrintIndexTest extends Init {

    @Test
    public void Test() {
        Assert.assertEquals("""
                Printing all birds in alphabetical order and their aviary location:
                 * Bald eagle - Bird is not found in any Aviary!
                 * Duck - Bird is not found in any Aviary!
                 * Goose - Bird is not found in any Aviary!
                 * Kiwi - Bird is not found in any Aviary!
                 * Ostrich - Bird is not found in any Aviary!
                """, conservatory.printIndex());

        conservatory.assignToAviary(kiwi, 5);
        conservatory.assignToAviary(ostrich, 5);
        conservatory.assignToAviary(goose, 6);
        conservatory.assignToAviary(duck, 6);
        conservatory.assignToAviary(baldEagle, 7);

        Assert.assertEquals("""
                Printing all birds in alphabetical order and their aviary location:
                 * Bald eagle - Bird found in Aviary 7
                 * Duck - Bird found in Aviary 6
                 * Goose - Bird found in Aviary 6
                 * Kiwi - Bird found in Aviary 5
                 * Ostrich - Bird found in Aviary 5
                """, conservatory.printIndex());
    }
}
