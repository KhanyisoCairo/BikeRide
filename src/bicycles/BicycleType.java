package bicycles;

import bicycles.models.Bicycle;
import bicycles.models.MountainBike;

public enum  BicycleType {
    MountainBike(5,-3),
    RoadBike(7,-4),
    Tandem(12, -7);

    private  int accelerationSpeed;
    private  int brakeSpeed;

    BicycleType(int accelerationSpeed,int brakeSpeed){
    this.accelerationSpeed = accelerationSpeed;
    this.brakeSpeed = brakeSpeed;


    }
    public int getAcceleration(){
        return accelerationSpeed;
    }
    public int getBrake(){
        return  brakeSpeed;
    }
}
