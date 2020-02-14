package bicycles.rides;

import bicycles.BicycleBase;
import bicycles.BicycleType;
import bicycles.BikeRide;

public class BikeRideOne implements BikeRide {

    private BicycleBase bicycleBase;

    public BikeRideOne(BicycleBase bicycleBase){
        this.bicycleBase = bicycleBase;

    }

    public static void main(String[] args) {
     //   BicycleBase bicycleBase = new BicycleBase();
       // BikeRide bikeRide = new BikeRide(bicycleBase);
        //bikeRide.ride();
    }
    public void ride() {
        this.bicycleBase.accelerate();
        this.bicycleBase.accelerate();
        this.bicycleBase.accelerate();
        this.bicycleBase.brake();
        this.bicycleBase.brake();
        this.bicycleBase.accelerate();
    }
    public int currentSpeed(){
        return bicycleBase.currentSpeed();
    }

    @Override
    public BicycleType getBicycleType() {
        return null;
    }
}
