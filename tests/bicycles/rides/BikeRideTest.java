package bicycles.rides;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import bicycles.rides.BikeRideOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTest {
    @Test
    public void mountainBikeSpeed () {
        MountainBike mountainBike = new MountainBike();
        BikeRideOne bikeRideOne = new BikeRideOne(mountainBike);
        bikeRideOne.ride();

        assertEquals(bikeRideOne.currentSpeed(), 14);
    }
    @Test
    public void tandemSpeed() {
        Tandem tandem = new Tandem();
        BikeRideOne bikeRideOne = new BikeRideOne(tandem);
        bikeRideOne.ride();

        assertEquals(bikeRideOne.currentSpeed(), 34);
    }
    @Test
    public void roadBikeSpeed() {
        RoadBike roadBike = new RoadBike();
        BikeRideOne bikeRideOne = new BikeRideOne(roadBike);
        bikeRideOne.ride();

        assertEquals(bikeRideOne.currentSpeed(), 36);
    }
}