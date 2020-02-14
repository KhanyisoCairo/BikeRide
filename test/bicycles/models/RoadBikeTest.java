package bicycles.models;

import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeTest {
    @Test
    public void ShouldAccelarate(){
        RoadBike bike = new RoadBike();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(bike.currentSpeed(),33);
    }
    @Test
    public void braking(){
        RoadBike brake = new RoadBike();
        brake.accelerate();
        brake.accelerate();
        brake.brake();
        assertEquals(brake.currentSpeed(),18);
    }
    @Test
    public void ShouldStop(){
        RoadBike stop =new RoadBike();
        stop.accelerate();
        stop.brake();
        stop.stop();
        assertEquals(stop.currentSpeed(),0);
    }
}
