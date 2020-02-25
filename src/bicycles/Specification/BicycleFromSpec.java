package bicycles.Specification;

import bicycles.BicycleBase;
import bicycles.BicycleType;

public class BicycleFromSpec extends BicycleBase {
    private final BicycleSpecification bicycleSpecification;

    public BicycleFromSpec(BicycleSpecification bicycleSpecification){
        this.bicycleSpecification = bicycleSpecification;
    }

    @Override
    public void accelerate(
    ) {
        changeSpeed(bicycleSpecification.getAccelerationSpeed());
    }

    @Override
    public void brake() {
        changeSpeed(bicycleSpecification.getBrakeSpeed());
    }

    @Override
    public BicycleType getBicycleType() {
        return bicycleSpecification.bicycleType;
    }
}
