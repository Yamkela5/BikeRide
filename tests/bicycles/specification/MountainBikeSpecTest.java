package bicycles.specification;

import bicycles.rides.BikeRideOne;
import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeSpecTest {
    @Test
    public void mountainBikeSpec() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);


        assertEquals(mountainBikeSpec.getAccelerationSpeed(), 5);
        assertEquals(mountainBikeSpec.getBrakeSpeed(), -3);
        assertEquals(mountainBikeSpec.getBicycleType(), BicycleType.MountainBike);

    }
}
