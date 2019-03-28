package bicycles.specification;

import bicycles.BicycleBase;
import bicycles.BicycleType;

public class BicycleFromSpec extends BicycleBase {
    private BicycleSpecification bicycleFromSpec;
    public BicycleFromSpec(BicycleSpecification roadBikeSpec) {

        this.bicycleFromSpec = roadBikeSpec;
    }

    public void accelerate() {

        changeSpeed(this.bicycleFromSpec.getAccelerationSpeed());
    }

    public void brake() {

        changeSpeed(this.bicycleFromSpec.getBrakeSpeed());
    }

    public BicycleType getBicycleType() {

        return this.bicycleFromSpec.getBicycleType();
    }
}
