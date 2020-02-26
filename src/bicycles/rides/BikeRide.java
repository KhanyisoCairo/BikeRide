package bicycles.rides;

import bicycles.BicycleType;

public interface BikeRide {
    void ride();
    int currentSpeed();
    BicycleType getBicycleType();

}
