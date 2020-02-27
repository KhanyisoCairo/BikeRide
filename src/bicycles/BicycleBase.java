package bicycles;

import bicycles.models.Bicycle;

public abstract class  BicycleBase implements Bicycle {
    protected   int speed;
    protected void changeSpeed(int  actualSpeed ){
    speed += actualSpeed;
    }

    @Override
    public void stop() {
        speed = 0;
    }

    @Override
    public int currentSpeed() {
        if(speed < 0){
            return 0;

        }
        return speed;
    }
}
