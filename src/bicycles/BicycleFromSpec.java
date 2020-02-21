package bicycles;

import bicycles.models.Bicycle;

public class BicycleFromSpec extends BicycleBase {
    private final BicycleSpecification bicycleSpecification;

    public BicycleFromSpec(BicycleSpecification bicycleSpecification){
        this.bicycleSpecification = bicycleSpecification;
    }

    @Override
    public void accelerate(
    ) {

    }

    @Override
    public void brake() {

    }

    @Override
    public BicycleType getBicycleType() {
        return bicycleSpecification.bicycleType;
    }
}
