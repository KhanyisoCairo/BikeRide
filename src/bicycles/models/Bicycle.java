package bicycles.models;

import bicycles.BicycleType;

public interface Bicycle {

    public void accelerate();
    public void brake();
    public int currentSpeed();
    public void stop();
    BicycleType getBicycleType();

}
