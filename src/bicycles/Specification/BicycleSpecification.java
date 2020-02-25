package bicycles.Specification;

import bicycles.BicycleType;

public class BicycleSpecification {
    private int accelerationSpeed;
    private int brakeSpeed;
   BicycleType bicycleType;
    // add a variable for brakeSpeed


    public BicycleSpecification(int accelerationSpeed, int brakeSpeed,BicycleType bicycleType) {
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
        this.bicycleType = bicycleType;
        // initialize brakeSpeed private variable
    }
    public BicycleType getBicycleType(){
        return bicycleType;
    }

    public int getAccelerationSpeed(){
        return accelerationSpeed;
    }
    public int getBrakeSpeed(){
        return  brakeSpeed;
    }
    public void setBrakeSpeed(int brakeSpeed){
        this.brakeSpeed= brakeSpeed;
    }

}
