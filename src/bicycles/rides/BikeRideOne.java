package bicycles.rides;

import bicycles.Bicycle;


public class BikeRideOne implements BikeRide {

    private Bicycle bicycle;

    public BikeRideOne(Bicycle bicycle) {

        this.bicycle = bicycle;
    }

    @Override
    public int currentSpeed() {
        return this.bicycle.currentSpeed();
    }

    @Override
    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
    }
}