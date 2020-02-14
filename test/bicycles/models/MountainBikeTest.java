package bicycles.models;

import bicycles.models.MountainBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeTest {

    @Test
    public  void shouldAccelerate(){
        MountainBike bike = new MountainBike();
        bike.accelerate();
        bike.accelerate();
        assertEquals(bike.currentSpeed(), 10);
    }
    @Test
    public void braking(){
        MountainBike brake1 = new MountainBike();
        brake1.accelerate();
        brake1.accelerate();
        brake1.brake();
        brake1.brake();
        assertEquals(brake1.currentSpeed(),4);
    }
    @Test
    public void Stopping(){
        MountainBike stop = new MountainBike();
        stop.accelerate();
        stop.accelerate();
        stop.stop();
        assertEquals(stop.currentSpeed(),0);

    }

}
