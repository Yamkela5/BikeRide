package bicycles.rides;

import bicycles.models.RoadBike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTwoTest {

    @Test
    public void BikeRideTwo() {
        RoadBike bicycles = new RoadBike();
        BikeRideTwo bikeRide = new BikeRideTwo(bicycles);
        bikeRide.ride();
        assertEquals(bikeRide.currentSpeed(), 65);


    }

}