package bicycles;

import bicycles.rides.BikeRideOne;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeSpecTest {
    @Test
    public void mountainBikeSpec() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        BikeRideOne bikeRideOne = new BikeRideOne(bicycle);
        bikeRideOne.ride();

        assertEquals(mountainBikeSpec.getAccelerationSpeed(), 5);
        assertEquals(mountainBikeSpec.getBrakeSpeed(), -3);
        assertEquals(mountainBikeSpec.getBicycleType(), BicycleType.MountainBike);
        assertEquals(bikeRideOne.currentSpeed(), 14);
    }
}
