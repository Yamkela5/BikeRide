package bicycles.rides;
import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public  class FunRideTest {
    @Test
    public void enteredCountTest() {
        FunRide funRide = new FunRide(3);
        BicycleSpecification tandemSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleFromSpec tandemFromSpec = new BicycleFromSpec(tandemSpec);
        BicycleFromSpec mountainBikeFromSpec = new BicycleFromSpec(mountainBikeSpec);
        BicycleFromSpec roadBikeFromSpec = new BicycleFromSpec(roadBikeSpec);
        funRide.accept(tandemFromSpec);
        funRide.accept(mountainBikeFromSpec);
        funRide.accept(roadBikeFromSpec);

        assertEquals(funRide.getEnteredCount(),3);
    }

    @Test
    public void countForTypeTest() {
        FunRide funRide = new FunRide(4);
        BicycleSpecification tandemSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleFromSpec tandemFromSpec = new BicycleFromSpec(tandemSpec);
        BicycleFromSpec mountainBikeFromSpec = new BicycleFromSpec(mountainBikeSpec);
        BicycleFromSpec roadBikeFromSpec = new BicycleFromSpec(roadBikeSpec);
        funRide.accept(tandemFromSpec);
        funRide.accept(mountainBikeFromSpec);
        funRide.accept(roadBikeFromSpec);
        funRide.accept(mountainBikeFromSpec);
        funRide.getCountForType(BicycleType.Tandem );
        assertEquals(2, funRide.getCountForType(BicycleType.Tandem));
    }

    @Test
    public void BikesAccepted() {
        FunRide funRide = new FunRide(2);
        BicycleSpecification tandems = new BicycleSpecification(12, -7, BicycleType.Tandem);
        BicycleSpecification mountainBike = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification RoadBikes = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleFromSpec tandemSpec = new BicycleFromSpec(tandems);
        BicycleFromSpec mountainBikeSpec = new BicycleFromSpec(mountainBike);
        BicycleFromSpec RoadBikeSpec = new BicycleFromSpec(RoadBikes);
        funRide.accept(tandemSpec);
        funRide.accept(tandemSpec);



       funRide.accept(tandemSpec);

       funRide.accept(mountainBikeSpec);
        funRide.getCountForType(BicycleType.Tandem);
        assertEquals(2, funRide.getCountForType(BicycleType.Tandem));

    }
}
