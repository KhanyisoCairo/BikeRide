package bicycles.rides;

import bicycles.BicycleType;
import bicycles.models.Bicycle;

public class BikeRideOne implements BikeRide {
    private Bicycle bicycle;

    public BikeRideOne(Bicycle bicycle){
        this.bicycle = bicycle;

    }

    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }
    public int currentSpeed(){
        return bicycle.currentSpeed();
    }

    @Override
    public BicycleType getBicycleType() {
        return bicycle.getBicycleType();
    }
}
