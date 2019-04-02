package bicycles.rides;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideThreeTest {

    @Test
    public void shouldTakeMountainBikeOnBikeRide() {
        MountainBike bicycle = new MountainBike();
        BikeRideThree bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride();
        assertEquals(bikeRide.currentSpeed(), 14);
    }

    @Test
    public void shouldTakeRoadBikeOnBikeRide() {
        RoadBike bicycle = new RoadBike();
        BikeRideThree bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride();
        assertEquals(bikeRide.currentSpeed(), 49);
    }
}
