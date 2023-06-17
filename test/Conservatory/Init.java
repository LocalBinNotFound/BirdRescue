package Conservatory;

import Birds.*;
import enums.BirdType;
import enums.FoodList;
import org.junit.Before;

public class Init {
    protected Conservatory conservatory;

    protected FlightlessBird kiwi;
    protected FlightlessBird ostrich;
    protected Waterfowl duck;
    protected Waterfowl goose;
    protected BirdOfPrey baldEagle;
    protected Owl snowyOwl;
    protected Parrot cockatiel;
    protected Pigeon icePigeon;

    @Before
    public void init() {
        conservatory = new Conservatory();

        kiwi = new FlightlessBird("Kiwi",
                BirdType.FLIGHTLESS_BIRD,
                "has loose feathers like fur and does not have wings",
                false,
                0,
                new FoodList[]{FoodList.SEEDS},
                false,
                6);
        ostrich = new FlightlessBird("Ostrich",
                BirdType.FLIGHTLESS_BIRD,
                "huge bird that lives in deserts",
                false,
                2,
                new FoodList[]{FoodList.VEGETATION},
                false,
                300);
        duck = new Waterfowl("Duck",
                BirdType.WATERFOWL,
                "has yellow beak and can swim",
                false,
                2,
                new FoodList[]{FoodList.FISH, FoodList.AQUATIC_INVERTEBRATES},
                true,
                3.5F);
        goose = new Waterfowl("Goose",
                BirdType.WATERFOWL,
                "known for its long neck and ability to swim",
                false,
                2,
                new FoodList[]{FoodList.FISH, FoodList.AQUATIC_INVERTEBRATES},
                true,
                10.5F);
        baldEagle = new BirdOfPrey("Bald eagle",
                BirdType.BIRD_OF_PREY,
                "large bird with white head and yellow eyes",
                false,
                2,
                new FoodList[]{FoodList.OTHER_BIRDS, FoodList.SMALL_MAMMALS, FoodList.FISH},
                true,
                13);
        snowyOwl = new Owl("Snowy owl",
                BirdType.OWL,
                "the owl known to the world from Harry Potter movies",
                false,
                2,
                new FoodList[]{FoodList.SMALL_MAMMALS, FoodList.OTHER_BIRDS});
        cockatiel = new Parrot("Cockatiel",
                BirdType.PARROT,
                "parrot with a proud posture, small dark eyes and a long tail",
                false,
                2,
                new FoodList[]{FoodList.BERRIES, FoodList.INSECTS});
        icePigeon = new Pigeon("Ice pigeon",
                BirdType.PIGEON,
                "pigeon that has a white colored body throughout",
                false,
                2,
                new FoodList[] {FoodList.BERRIES});

        conservatory.rescueNewBird(kiwi);
        conservatory.rescueNewBird(ostrich);
        conservatory.rescueNewBird(goose);
        conservatory.rescueNewBird(duck);
        conservatory.rescueNewBird(baldEagle);
        conservatory.rescueNewBird(snowyOwl);
        conservatory.rescueNewBird(cockatiel);
        conservatory.rescueNewBird(icePigeon);
    }
}
