package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BikeRide;

public  class BikeRideTwo implements BikeRide {
    private Bicycle bicycle;

    public BikeRideTwo (Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
    }

    @Override
    public int currentSpeed() {
        return this.bicycle.currentSpeed();
    }
}
