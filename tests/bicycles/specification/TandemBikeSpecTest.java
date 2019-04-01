package bicycles.specification;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.rides.BikeRideOne;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemBikeSpecTest {

        @Test
        public void tandemBikeSpec () {
            BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
            Bicycle bicycle = new BicycleFromSpec(tandemBikeSpec);
            BikeRideOne bikeRideOne = new BikeRideOne(bicycle);
            bikeRideOne.ride();

            assertEquals(tandemBikeSpec.getAccelerationSpeed(), 12);
            assertEquals(tandemBikeSpec.getBrakeSpeed(), -7);
            assertEquals(tandemBikeSpec.getBicycleType(), BicycleType.Tandem);
            assertEquals(bikeRideOne.currentSpeed(), 46);
        }
}
