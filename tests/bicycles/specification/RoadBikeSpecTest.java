package bicycles.specification;
import bicycles.Bicycle;
import bicycles.BicycleType;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.rides.BikeRideOne;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeSpecTest {
    @Test
    public void roadBikeSpecTest() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideOne bikeRideOne = new BikeRideOne(bicycle);
        bikeRideOne.ride();

        assertEquals(roadBikeSpec.getAccelerationSpeed(), 11);
        assertEquals(roadBikeSpec.getBrakeSpeed(), -4);
        assertEquals(roadBikeSpec.getBicycleType(), BicycleType.RoadBike);
        assertEquals(bikeRideOne.currentSpeed(), 47);
    }
}
