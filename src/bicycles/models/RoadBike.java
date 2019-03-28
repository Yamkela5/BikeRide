package bicycles.models;

//import bicycles.Bicycle;
import bicycles.BicycleBase;
import bicycles.BicycleType;


public class RoadBike extends BicycleBase {

    @Override
    public void accelerate() {

        changeSpeed(11);
    }

    @Override
    public void brake() {

        changeSpeed(-4);
    }

    @Override
    public BicycleType getBicycleType() {
        return BicycleType.RoadBike;
    }
}