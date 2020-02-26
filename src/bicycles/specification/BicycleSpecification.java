package bicycles.specification;

import bicycles.BicycleType;

public class BicycleSpecification {
    private int accelerationSpeed;
    private int brakeSpeed;
    BicycleType bicycleType;


    public BicycleSpecification(BicycleType bicycleType) {
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
        this.bicycleType = bicycleType;
    }
    public BicycleType getBicycleType(){
        return bicycleType;
    }

    public int getAccelerationSpeed(){
        return bicycleType.getAcceleration();
    }
    public int getBrakeSpeed(){
        return  bicycleType.getBrake();
    }

}
