package bicycles;

import bicycles.rides.FunRide;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {
    @Test
    public void enteredCountTest() {
        FunRide funRide = new FunRide(3);
        BicycleSpecification bicycleSpecification = new BicycleSpecification(12, -7, BicycleType.Tandem);
        BicycleSpecification bicycleSpecification2 = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification bicycleSpecification3 = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleFromSpec bicycleFromSpec = new BicycleFromSpec(bicycleSpecification);
        BicycleFromSpec bicycleFromSpec2 = new BicycleFromSpec(bicycleSpecification2);
        BicycleFromSpec bicycleFromSpec3 = new BicycleFromSpec(bicycleSpecification3);
        funRide.accept(bicycleFromSpec);
        funRide.accept(bicycleFromSpec2);
        funRide.accept(bicycleFromSpec3);

        assertEquals(funRide.getEnteredCount(),3);
    }

    @Test
    public void countForTypeTest() {
        FunRide funRide = new FunRide(4);
        BicycleSpecification tandemSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleFromSpec bicycleFromSpec = new BicycleFromSpec(tandemSpec);
        BicycleFromSpec bicycleFromSpec2 = new BicycleFromSpec(mountainBikeSpec);
        BicycleFromSpec bicycleFromSpec3 = new BicycleFromSpec(roadBikeSpec);
        funRide.accept(bicycleFromSpec);
        funRide.accept(bicycleFromSpec);
        funRide.accept(bicycleFromSpec);

        assertEquals(3, funRide.getCountForType(BicycleType.Tandem));
    }

    @Test
    public void BikesAccepted() {
        FunRide funRide = new FunRide(2);
        BicycleSpecification bicycleSpecification = new BicycleSpecification(12, -7, BicycleType.Tandem);
        BicycleSpecification bicycleSpecification2 = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification bicycleSpecification3 = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleFromSpec bicycleFromSpec = new BicycleFromSpec(bicycleSpecification);
        BicycleFromSpec bicycleFromSpec2 = new BicycleFromSpec(bicycleSpecification2);
        BicycleFromSpec bicycleFromSpec3 = new BicycleFromSpec(bicycleSpecification3);
        funRide.accept(bicycleFromSpec);
        funRide.accept(bicycleFromSpec2);
        funRide.accept(bicycleFromSpec3);

        assertEquals("reject", funRide.accept(bicycleFromSpec3));
    }
}
