package bicycles.models;

import bicycles.BicycleBase;
import bicycles.BicycleType;

public class MountainBike extends BicycleBase {


    @Override
    public void accelerate() {
    changeSpeed(5);
    }

    @Override
    public void brake() {
    changeSpeed(-3);
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public BicycleType getBicycleType() {
        return BicycleType.MountainBike;
    }
}
