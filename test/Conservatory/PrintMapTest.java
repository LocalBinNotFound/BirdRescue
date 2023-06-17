package Conservatory;

import org.junit.Assert;
import org.junit.Test;

public class PrintMapTest extends Init {

    @Test
    public void Test() {
        Assert.assertEquals("""
                Printing aviary locations and birds they house:
                Aviary 1: Empty!
                Aviary 2: Empty!
                Aviary 3: Empty!
                Aviary 4: Empty!
                Aviary 5: Empty!
                Aviary 6: Empty!
                Aviary 7: Empty!
                Aviary 8: Empty!
                Aviary 9: Empty!
                Aviary 10: Empty!
                Aviary 11: Empty!
                Aviary 12: Empty!
                Aviary 13: Empty!
                Aviary 14: Empty!
                Aviary 15: Empty!
                Aviary 16: Empty!
                Aviary 17: Empty!
                Aviary 18: Empty!
                Aviary 19: Empty!
                Aviary 20: Empty!
                """, conservatory.printMap());


        conservatory.assignToAviary(kiwi, 5);
        conservatory.assignToAviary(ostrich, 5);
        conservatory.assignToAviary(goose, 6);
        conservatory.assignToAviary(duck, 6);
        conservatory.assignToAviary(baldEagle, 7);
        conservatory.assignToAviary(snowyOwl, 20);
        conservatory.assignToAviary(cockatiel, 20);
        conservatory.assignToAviary(icePigeon, 20);
        Assert.assertEquals("""
                Printing aviary locations and birds they house:
                Aviary 1: Empty!
                Aviary 2: Empty!
                Aviary 3: Empty!
                Aviary 4: Empty!
                Aviary 5:
                 * Kiwi - Flightless bird - has loose feathers like fur and does not have wings
                 * Ostrich - Flightless bird - huge bird that lives in deserts
                Aviary 6:
                 * Goose - Waterfowl - known for its long neck and ability to swim
                 * Duck - Waterfowl - has yellow beak and can swim
                Aviary 7:
                 * Bald eagle - Bird of prey - large bird with white head and yellow eyes
                Aviary 8: Empty!
                Aviary 9: Empty!
                Aviary 10: Empty!
                Aviary 11: Empty!
                Aviary 12: Empty!
                Aviary 13: Empty!
                Aviary 14: Empty!
                Aviary 15: Empty!
                Aviary 16: Empty!
                Aviary 17: Empty!
                Aviary 18: Empty!
                Aviary 19: Empty!
                Aviary 20:
                 * Snowy owl - Owl - the owl known to the world from Harry Potter movies
                 * Cockatiel - Parrot - parrot with a proud posture, small dark eyes and a long tail
                 * Ice pigeon - Pigeon - pigeon that has a white colored body throughout
                """, conservatory.printMap());
    }
}
