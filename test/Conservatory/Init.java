package Conservatory;

import Birds.BirdOfPrey;
import Birds.FlightlessBird;
import Birds.Waterfowl;
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

        conservatory.rescueNewBird(kiwi);
        conservatory.rescueNewBird(ostrich);
        conservatory.rescueNewBird(goose);
        conservatory.rescueNewBird(duck);
        conservatory.rescueNewBird(baldEagle);
    }
}
